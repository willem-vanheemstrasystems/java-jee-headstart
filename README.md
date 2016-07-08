# java-jee-headstart
Java JEE - Headstart


Tip: View Java content in Chrome using the IE Tab extension https://techhelpkb.com/how-to-use-java-in-google-chrome/

Based on:

Book 'Beginning Java Programming - The Object-Oriented Approach' by Bart Baesens, Aimee Backiel, Seppe vanden Broucke

BJPCh6 - DistanceConverter

BJPCh6 - JUnitTest

BJPCh7 - Account

BJPCh7 - Accountable

BJPCh7 - AccountManager

BJPCh7 - CheckingAccount

BJPCh7 - IllegalAccount

BJPCh7 - IllegalDeposit

BJPCh7 - IllegalWithdrawal

BJPCh7 - Person

BJPCh7 - SavingsAccount

BJPCh08 - FileCopierWithByteStreams: uses FileInputStream, FileOutputStream

BJPCh08 - FormattingOutput: uses PrintStream

BJPCh08 - FileCopierWithCharacterStreams: uses FileReader, FileWriter

BJPCh08 - FileCopierWithBufferedStreams: uses BufferedReader, BufferedWriter

BJPCh09 - Working with Databases in Java

Note: download MySQL from http://www.mysql.com/downloads
__

''''

CREATE SCHEMA `employeeschema` ;

CREATE TABLE `employeeschema`.`department` (
  `DepartmentID` INT NOT NULL,
  `DepartmentName` VARCHAR(45) NULL DEFAULT NULL,
  `DepartmentAddress` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`DepartmentID`));

CREATE TABLE `employeeschema`.`employee` (
  `EmployeeID` INT(11) NOT NULL,
  `EmployeeName` VARCHAR(45) NULL DEFAULT NULL,
  `EmployeeGender` VARCHAR(45) NULL DEFAULT NULL,
  `DepartmentID` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`EmployeeID`),
  INDEX `DepartmentIDForeign_idx_idx` (`DepartmentID` ASC),
  CONSTRAINT `DepartmentIDForeign_idx`
    FOREIGN KEY (`DepartmentID`)
    REFERENCES `employeeschema`.`department` (`DepartmentID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

ENGINE = InnoDB

''''
__

''''
-- Insert data into department table
insert into employeeschema.department
values
	(1,	'ITC', 'Brussels'),
    (2, 'Marketing', 'New York'),
    (3, 'Finance', 'Singapore'),
    (4, 'Accounting', 'Sydney');
''''
__

''''
-- insert data in employee table
insert into employeeschema.employee
values
	(1, 'Bart Baesens', 'Male', 1),
    (2, 'Aimee Backiel', 'Female', 1),
    (3, 'Seppe vanden Broucke', 'Male', 1),
    (4, 'Michael Jackson', 'Male', 2),
    (5, 'Sarah Adams', 'Female', 3);
''''

BJPCh09 - Java Database Connectivity (JDBC)

Download JDBC Driver for MySQL for Java from http://dev.mysql.com/downloads/connector/j/

Once installed, add the path to the driver to Windows Environment Variables PATH (e.g. C:\Program Files\MySQL\mysql-connector-java-5.1.39)

Now add a reference to the driver as an external jar in Eclipse for this project.
Choose Build Path > Configure Build Path > Add External JARs, then explicitely add the file C:\Program Files\MySQL\mysql-connector-java-5.1.39\mysql-connector-java-5.1.39-bin.jar

