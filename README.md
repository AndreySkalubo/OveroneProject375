# Overone Project

## Requirements

* JDK 11
* Apache Maven
* mySQL

You can download mySQL here: [https://www.mysql.com/downloads](https://www.mysql.com/downloads).

## Functionality

This application allows connecting to database and working with its data. The goal is to take a list of students
and simulate them quizzing each other. In the beginning, there are 2 students, student A is questioning student B.
After that, the question and the answer are assessed by giving marks to each student. Then, student B is questioning
student C. And that until the last student is questioning student A. In the end, the results are shown to the user.

## Setting

After installing mySQL you need to create a user:

```
CREATE USER 'bestuser'@'localhost' IDENTIFIED BY 'bestuser';
GRANT ALL PRIVILEGES ON *.* TO 'bestuser'@'localhost' WITH GRANT OPTION;
```

And a database:

```
drop database if exists overone;
create database overone;
use overone;
```

## Build application:

```
mvn clean install
```

## Start application

To start an application:

```
 java -jar ./target/Andersen_JavaCource-1.0-SNAPSHOT.jar
```

Server up on [http://localhost:8090](http://localhost:8090).