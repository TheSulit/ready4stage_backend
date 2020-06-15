import sys
import os
import docker
import time

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
    if (client.containers.get("mysqldb-container").status != "running"):
        client.containers.get("mysqldb-container").start()
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
