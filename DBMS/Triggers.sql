create database triggers;
use triggers;

CREATE TABLE Student_Trigger
(
Student_RollNo INT NOT NULL PRIMARY KEY,
Student_FirstName Varchar (100),
Student_EnglishMarks INT,
Student_PhysicsMarks INT,
Student_ChemistryMarks INT,
Student_MathsMarks INT,
Student_TotalMarks INT,
Student_Percentage float );
desc Student_Trigger;

CREATE TRIGGER Student_Table_Marks BEFORE INSERT ON Student_Trigger FOR EACH ROW
SET new.Student_TotalMarks = 
new.Student_EnglishMarks + new.Student_PhysicsMarks + new.Student_ChemistryMarks + new.Student_MathsMarks,
new.Student_Percentage = ( new.Student_TotalMarks / 400) * 100;

insert into Student_Trigger VALUES ( 201, "Sorya", 88, 75, 69, 92, 0, 0);
insert into Student_Trigger VALUES ( 204, "anil", 86, 85, 89, 96, 0, 0);
insert into Student_Trigger VALUES ( 205, "vamshi", 96, 91, 75, 92, 0, 0);
insert into Student_Trigger VALUES ( 206, "bro", 100, 100, 99, 98, 0, 0);

select * from Student_Trigger;

