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

CREATE TABLE `employeeschema`.`project` (
  `ProjectID` INT NOT NULL,
  `ProjectName` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`ProjectID`)
);

CREATE TABLE `employeeschema`.`works_on` (
  `EmployeeID` INT(11) NOT NULL,
  `ProjectID` INT(11) NOT NULL,
  PRIMARY KEY (`EmployeeID`, `ProjectID`),
  INDEX `works_onProj_idx` (`ProjectID` ASC),
  CONSTRAINT `works_onEmp`
    FOREIGN KEY (`EmployeeID`)
    REFERENCES `employeeschema`.`employee` (`EmployeeID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `works_onProj`
    FOREIGN KEY (`ProjectID`)
    REFERENCES `employeeschema`.`project` (`ProjectID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);
