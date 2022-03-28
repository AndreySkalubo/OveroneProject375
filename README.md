# Overone Project

## Requirements

* JDK 11
* Apache Maven
* mySQL

You can download mySQL here: [https://www.mysql.com/downloads](https://www.mysql.com/downloads).

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