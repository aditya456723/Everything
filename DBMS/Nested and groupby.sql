create database sailor;
use sailor;
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
                  bname varchar(20),
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
insert into reserve values(2,1,2,'10-10-07','60');
insert into reserve values(3,1,3,'10-10-07','60');
insert into reserve values(4,1,4,'10-10-07','60');
insert into reserve values(5,3,2,'10-10-07','60');
insert into reserve values(6,3,3,'10-10-07','60');
insert into reserve values(7,3,4,'10-10-07','60');
insert into reserve values(8,6,1,'16-10-07','60');
insert into reserve values(9,6,2,'10-10-07','60');
insert into reserve values(10,7,3,'10-10-07','60');
select*from reserve;

select sname from sailors where SID = (select SID from reserve where BID=4);
select sname from sailors where exists (select SID from reserve);
SELECT sname FROM sailors where SID IN(select SID from reserve where BID=1 AND 2 AND 3 AND 4 );
select sname,rating from sailors where rating>(select rating from sailors where sname='Dustin');
select sname from sailors where rating>7;
select sname from sailors where rating= all (select max(rating) from sailors);

select sname from sailors order by sname asc;
select rating,sname,age from sailors group by rating order by rating desc,age desc;
select rating,sname,age from sailors group by rating order by rating desc,age asc;

select rating,min(age) as minage from sailors group by rating;
select rating,min(age) from sailors where age>=18 group by rating having count(*)>=2;
select rating,min(age) from sailors where age>=18 and age<=60 group by rating having count(*)>=2;