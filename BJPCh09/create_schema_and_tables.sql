-- create schema and tables
CREATE SCHEMA `employeeschema` ;

CREATE TABLE `employeeschema`.`department` (
    `DepartmentID` INT NOT NULL,
    `DepartmentName` VARCHAR(45) NULL DEFAULT NULL,
    `DepartmentAddress` VARCHAR(45) NULL DEFAULT NULL,
    PRIMARY KEY (`DepartmentID`)
);

CREATE TABLE `employeeschema`.`employee` (
    `EmployeeID` INT(11) NOT NULL,
    `EmployeeName` VARCHAR(45) NULL DEFAULT NULL,
    `EmployeeGender` VARCHAR(45) NULL DEFAULT NULL,
    `DepartmentID` INT(11) NULL DEFAULT NULL,
    PRIMARY KEY (`EmployeeID`),
    INDEX `DepartmentIDForeign_idx_idx` (`DepartmentID` ASC),
    CONSTRAINT `DepartmentIDForeign_idx` FOREIGN KEY (`DepartmentID`)
        REFERENCES `employeeschema`.`department` (`DepartmentID`)
        ON DELETE NO ACTION ON UPDATE NO ACTION
);