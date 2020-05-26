import sys
import os

# print(sys.version)

if (sys.platform == "win32" or sys.platform == "win64"):
    os.chdir("src\\database")
elif (sys.platform == "darwin"):
    os.chdir("src/database")

os.system("docker build -t mysqldb-image .")
os.system("docker run -d -h localhost -p 3000:3306 --name mysqldb-container mysqldb-image")
os.system("docker exec -it mysqldb-container bash -c 'mysql -u root -ppassword'")
    
