create database sailors;
use sailors;
create table sailors(SID numeric primary key,
                     sname varchar(20),
                     rating int,
                     age float);
insert into sailors values(1,'Dustin',7,45.0);
insert into sailors values(2,'Brutus',1,33.0);
insert into sailors values(3,'Laura',8,55.5);
insert into sailors values(4,'Andy',8,25.5);
insert into sailors values(5,'Rusty',10,35.0);
insert into sailors values(6,'Horatio',7,55.0);
insert into sailors values(7,'Zelda',10,48.0);
insert into sailors values(8,'Horatio',9,45.70);
insert into sailors values(9,'Amy',3,45.89);
insert into sailors values(10,'Bob',3,42.67);
select *from sailors;
                     
create table boat(BID numeric unique,
                  sname varchar(20),
                  color varchar(20));
insert into boat values(1,'interlake','blue');
insert into boat values(2,'interlake','red');
insert into boat values(3,'clipper','green');
insert into boat values(4,'marine','red');
select *from boat;

create table reserve(RID numeric unique,
                  SID numeric,
                  BID numeric,
                  rdate varchar(20),
                  duration int);
insert into reserve values(1,1,1,'10-10-07','60');
insert into reserve values(2,1,1,'10-10-07','60');
insert into reserve values(3,1,1,'10-10-07','60');
insert into reserve values(4,5,1,'10-10-07','60');
insert into reserve values(5,3,1,'10-10-07','60');
insert into reserve values(6,6,1,'10-10-07','60');
insert into reserve values(7,5,6,'10-10-07','60');
insert into reserve values(8,6,1,'16-10-07','60');
insert into reserve values(9,7,6,'10-10-07','60');
insert into reserve values(10,2,1,'10-10-07','60');
select*from reserve;
select *from sailors where age>=35;
select *from sailors where rating<10 and rating>35;
select *from boat where color='red';