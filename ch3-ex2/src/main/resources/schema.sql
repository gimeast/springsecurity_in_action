CREATE TABLE IF NOT EXISTS `security`.`users` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(45) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    `enabled` INT NOT NULL,
    PRIMARY KEY(`ID`)
);

CREATE TABLE IF NOT EXISTS `security`.`authorities` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(45) NOT NULL,
    `AUTHORITY` VARCHAR(45) NOT NULL,
    PRIMARY KEY(`id`)
);