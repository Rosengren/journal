# Journal

#### Create Project Command
    spring init --boot-version=1.3.1.RELEASE --build=gradle --groupId=com --name=Journal

#### Build Command
    gradle build

#### Clean Build
    gradle clean build

#### Run Server
    gradle bootRun

#### Run Mysql Server
    mysql -uroot -P 3306 -p

**Note:** The SQL server must be running in order to run the application.

### Software Versions

* Java 8
* Gradle 2.14.1
* Spring Boot CLI 1.3.2
* Bootstrap 3.1.1
* MySQL 8.0.11

The following SQL commands were run to setup the database:

```sql
    CREATE USER 'user'@'localhost' IDENTIFIED BY 'pass';
    GRANT ALL PRIVILEGES ON *.* TO 'user'@'localhost' IDENTIFIED BY 'pass';
    ALTER USER 'user'@'localhost' IDENTIFIED WITH mysql_native_password BY 'pass';
    CREATE DATABASE journal;
    SET GLOBAL time_zone = '+3:00';
```

#### Create SQL Table

```sql
    CREATE DATABASE journal;
    USE journal;
    CREATE TABLE entry (
      id BIGINT NOT NULL auto_increment,
      title VARCHAR(1000),
      created VARCHAR(1000),
      summary VARCHAR(2000),
      PRIMARY KEY (id)
    );
```

### Notes

When starting up the server, you will need to enter a username and password to access the web page. There are 3 locations where this information can be defined (in order of precedence):

1. The InMemorySecurityConfiguration class defines usernames and passwords.

2. If the above does not have any users, then the user name and password can be found in the application properties file:
* security.user.name
* security.user.password

3. If the above are not specified, then the defaults are the following:
* The user name is 'user'.
* The password is an auto-generated GUID that is printed in the terminal when the server is starting up.

Calls to the server using curl can be done as follows:

    http://username:password@localhost:8080/api

A list of search options can be found at the following endpoint:

    localhost:8080/api/journal/search

Use the HAL browser to inspect REST APIs at the following endpoint:

    localhost:8080/api/browser
