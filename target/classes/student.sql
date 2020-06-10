DROP TABLE IF EXISTS student;
 
CREATE TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  age VARCHAR(250) NOT NULL,
  emailaddress VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO student (name, age, emailaddress) VALUES
  ('Srini', 22, 'Billionaire@Industrialist'),
  ('Vas', 23, 'Billionaire @Tech Entrepreneur'),
  ('Rao', 24, 'Billionaire @ Oil Magnate');
  