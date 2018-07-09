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

Once the server is up and running, a list of search options can be found at the following endpoint:

    localhost:8080/api/journal/search

Use the HAL browser to inspect REST APIs at the following endpoint:

    localhost:8080/api/browser
