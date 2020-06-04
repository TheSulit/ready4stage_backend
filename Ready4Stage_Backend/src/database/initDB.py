import sys
import os
import mysql.connector
import docker
import time
#import pandas as pd

# print(sys.version)
if (sys.platform == "win32" or sys.platform == "win64"):
    os.chdir("src\\database\\ready4Stage_sql_files")
elif (sys.platform == "darwin"):
    os.chdir("src/database/ready4Stage_sql_files")

client = docker.from_env()

#Build the Docker Image if not built already
try: 
    client.images.get("mysqldb-image")
except docker.errors.ImageNotFound:
    client.images.build(
            path=".",
            tag="mysqldb-image"
        )

#Run the Docker Container if not running already
try:
    client.containers.get("mysqldb-container").status
except docker.errors.NotFound:
    client.containers.run(
        ports={
            '3306/tcp': ('localhost', '8080')
        },
        image="mysqldb-image",
        detach=True,
        name="mysqldb-container"
    )
    #waiting for the container to run otherwise the database connection will fail
    time.sleep(15)

#Connect to the database
db = mysql.connector.connect(
    host="127.0.0.1",
    port=8080,
    user="root",
    passwd="",
    database="ready4stage"
)

mycursor = db.cursor()

#run sql Statements in sql files
sqlFiles = ["dozenten.sql", "LS_Ready4Stage_Belegung_Raum_1.sql", "LS_Ready4Stage_Belegung_Raum_2.sql", "raumplan.sql", "teilnehmer.sql"]
try: 
    for fileString in sqlFiles:
        sqlFile = open(fileString)
        sql = " ".join(sqlFile.readlines())
        sqlStatements = sql.split(";")
        for sqlStatement in sqlStatements:
            mycursor.execute(sqlStatement)
except mysql.connector.errors.ProgrammingError:
    print("Database already set") 

db.commit()
db.close()
mycursor.close()