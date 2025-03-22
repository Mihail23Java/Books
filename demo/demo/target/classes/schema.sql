CREATE TABLE books(

    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(45) NULL, 
    author VARCHAR(45) UNIQUE NULL, 
    yearOfPublication INT NULL
    

);



INSERT INTO books(title,author,yearOfPublication) VALUES('Евгений Онегин','Александр Сергеевич Пушкин',1823);
INSERT INTO books(title,author,yearOfPublication) VALUES('Преступление и наказание','Фёдор Михайлович Достоевский',1866);
INSERT INTO books(title,author,yearOfPublication) VALUES('Тихий дон','Михаил Александрович Шолохов',1928);
INSERT INTO books(title,author,yearOfPublication) VALUES('Отцы и дети','Иван Сергеевич Тургенев',1862);
INSERT INTO books(title,author,yearOfPublication) VALUES('Мастер и Маргарита','Михаил Афанасьевич Булгаков',1928);
