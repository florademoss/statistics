CREATE DATABASE mydatabase;
USE mydatabase;
CREATE TABLE `score` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`mathScore` INT NULL,
	`classid` INT NULL,
	PRIMARY KEY (`id`)
)
DELIMITER //
CREATE PROCEDURE createScore()
    BEGIN
    DECLARE i INT DEFAULT 1;
        WHILE i<=100 DO
            INSERT INTO score(mathScore,classid) VALUES ( FLOOR(0+(RAND()*98)),FLOOR(0+(RAND()*9)));
            SET i =i+1;
        END WHILE;
    END
CALL createScore();
