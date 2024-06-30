-- CREATE DATABASE DATABASE_NAME;
CREATE DATABASE STUDENT;

-- SHOW DATABASES will show all the database present
SHOW DATABASES;

-- For using any database - USE DATABASE_NAME;
USE STUDENT;

-- For creating Table inside database
-- CREATE table table_name(Column1 datatype (size), column2 datatype (size));
CREATE TABLE Student (
    StudentID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Section VARCHAR(50),
    TotalMarkds DECIMAL(10, 2)
);

-- DataTypes Example
CREATE TABLE Company (
    EmployeeID INT PRIMARY KEY,              -- Numeric type
    FirstName VARCHAR(50),                   -- Character type
    LastName VARCHAR(50),                    -- Character type
    Age INT,                                 -- Numeric type
    Salary DECIMAL(10, 2),                   -- Numeric type
    StartDate DATE,                          -- Date type
    LastLogin DATETIME,                      -- DateTime type
    Timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Timestamp type
    CountryCode CHAR(2)                      -- Character type
);

-- Inserting data into Table 
-- INSERT INTO table_name (column1, column2, columnN) VALUES (value1, value2, valueN);
INSERT INTO Student (StudentID, FirstName, LastName, Section, TotalMarkds)
 VALUES (2, 'Alice', 'Smith', 'A', 88.75);

INSERT INTO Student (StudentID, FirstName, LastName, Section, TotalMarkds) 
VALUES (3, 'Bob', 'Johnson', 'B', 92.50);

INSERT INTO Student (StudentID, FirstName, LastName, Section, TotalMarkds) 
VALUES (4, 'Charlie', 'Williams', 'A', 79.00);

INSERT INTO Student (StudentID, FirstName, LastName, Section, TotalMarkds) 
VALUES (5, 'David', 'Brown', 'C', 85.25);

INSERT INTO Student (StudentID, FirstName, LastName, Section, TotalMarkds) 
VALUES (6, 'Eve', 'Davis', 'B', 91.00);


-- SELECT -> selecting Data from Table
-- SELECT column1, column2, ... FROM table_name WHERE condition;
SELECT FirstName, LastName FROM student WHERE Section = 'C';

-- UPDATE -> Updating Data of specific row in a Table:
-- UPDATE table_name SET column1 = value1, column2 = value2, ... WHERE condition;
UPDATE student SET LastName = 'Smith' WHERE StudentID = 1;

-- DELETE -> Delete data from table based on Where condition
-- DELETE FROM table_name WHERE condition;
DELETE FROM Student WHERE StudentID = 6;

-- ALTER -> Altering (Changing) Table or column Name or Add or Removing columns
-- ALTER TABLE table_name ADD column_name datatype;
-- ALTER TABLE Student RENAME TO Student_Details;
-- ALTER TABLE Student RENAME COLUMN Column_NAME TO FIRST_NAME;
ALTER TABLE Student RENAME COLUMN StudentID TO ID;


















