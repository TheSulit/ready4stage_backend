#latest mysql-server version
FROM mysql:latest

#copy the sql script for ready4stage containing all test-data
COPY . ready4stage.sql

#enviorment variables for mysql
ENV MYSQL_USER=user
ENV MYSQL_PASSWORD=pw
ENV MYSQL_ROOT_PASSWORD=""
ENV MYSQL_ALLOW_EMPTY_PASSWORD=yes
ENV MYSQL_DATABASE=ready4stage

#run the sql script inside the container
#RUN mysql -u {MYSQL_ROOT_USER} ready4stage < /ready4stage.sql