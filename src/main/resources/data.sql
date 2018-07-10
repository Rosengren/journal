-- Journal Users
INSERT INTO account(ACCOUNT_NAME, PASSWORD) VALUES('user', 'pass');
INSERT INTO account(ACCOUNT_NAME, PASSWORD) VALUES('user2', 'pass');

-- Journal Data
INSERT INTO entry(TITLE, SUMMARY, CREATED)

  VALUES('Get to know Spring Boot', 'Today I will learn Spring Boot', '2018-07-03 00:00:00.00');

INSERT INTO entry(TITLE, SUMMARY, CREATED)
  VALUES('Give money away', 'Invest in Bitcoin', '2018-08-02 00:00:00.00');

INSERT INTO entry(TITLE, SUMMARY, CREATED)
  VALUES('Read East of Eden', 'I hear it is a great book', '2018-08-04 00:00:00.00');
