## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).

## Database

The Database is dockerized! Here are some tips while setting the container up:

- `connection`: 
    - since mysql 8.0 authorization is not enabled from outside by default
    - for enabling the access from outside: `ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password'`

- `Docker (via python-script)`:
    - For Documentation on the Python Library on the Docker Engine API: https://docker-py.readthedocs.io/en/stable/client.html
