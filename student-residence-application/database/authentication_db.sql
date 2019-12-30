CREATE TABLE IF NOT EXISTS projectrestapi.authentication (
  id INT NOT NULL AUTO_INCREMENT,
  userId VARCHAR(100) NULL,
  generatedTime VARCHAR(100) NULL,
  expiryTime VARCHAR(100) NULL,
  accessToken VARCHAR(200) NULL,
  PRIMARY KEY (id));



CREATE TABLE IF NOT EXISTS projectrestapi.user (
  id INT NOT NULL AUTO_INCREMENT,
  userId VARCHAR(100) NULL,
  userName VARCHAR(100) NULL,
  password VARCHAR(200) NULL,
  PRIMARY KEY (id),
  unique key (userId)
  );