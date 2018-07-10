DROP DATABASE IF EXISTS journal;
CREATE DATABASE journal;
USE journal;

-- User accounts
DROP TABLE IF EXISTS account;
CREATE TABLE account (
  ACCOUNT_NAME varchar(255) NOT NULL,
  PASSWORD varchar(255) NOT NULL,
  ID SERIAL,
  ENABLED BOOL DEFAULT true
);

-- Journal entries
DROP TABLE IF EXISTS entry;
CREATE TABLE entry (
  ID BIGINT(20) NOT NULL AUTO_INCREMENT,
  CREATED DATETIME DEFAULT NULL,
  TITLE VARCHAR(255) DEFAULT NULL,
  SUMMARY VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (ID)
);
