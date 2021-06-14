/* CREATE DATABASE */
CREATE DATABASE hibernateAnnotationsDb;

/* USE THE NEWLY CREATED DATABASE */
USE hibernateAnnotationsDb;

/* CREATING TABLE */
CREATE TABLE student (id INT(11) NOT NULL AUTO_INCREMENT, name VARCHAR(20) DEFAULT NULL, age INT(5)  DEFAULT NULL, PRIMARY KEY (id));

/* DESC TABLE */
DESC student;