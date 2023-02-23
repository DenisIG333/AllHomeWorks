-- create
CREATE TABLE EMPLOYEE (
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  name TEXT NOT NULL,
  age INTEGER NOT NULL,
  adress TEXT NOT NULL
);

-- insert
INSERT INTO EMPLOYEE (name, age, adress) VALUES ('Иван', '23', 'Смоленск');
INSERT INTO EMPLOYEE (name, age, adress) VALUES ('Степан', '30', 'Новороссийск');
INSERT INTO EMPLOYEE (name, age, adress) VALUES ('Алексей', '40', 'Москва');
INSERT INTO EMPLOYEE (name, age, adress) VALUES ('Виктор', '25', 'Москва');
INSERT INTO EMPLOYEE (name, age, adress) VALUES ('Игорь', '19', 'Москва');
INSERT INTO EMPLOYEE (name, age, adress) VALUES ('Петр', '33', 'Шатура');
INSERT INTO EMPLOYEE (name, age, adress) VALUES ('Василий', '34', 'Жуковский');

-- fetch 
SELECT name FROM EMPLOYEE WHERE age >= 18 AND age <= 30  AND adress = 'Москва';


