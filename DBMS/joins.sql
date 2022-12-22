create database joins;
use joins;
create table members(member_id integer(10),name varchar(10),primary key (member_id));
create table committees(committee_id integer(10),name varchar(10),primary key (committee_id));
insert into members values(1,'John');
insert into members values(2,'Jane');
insert into members values(3,'Mary');
insert into members values(4,'David');
insert into members values(5,'Amelia');
select*from members;
insert into committees values(1,'John');
insert into committees values(2,'Mary');
insert into committees values(3,'Amelia');
insert into committees values(4,'Joe');

select*from committees;
select m.member_id,m.name as member,c.committee_id,c.name as committee from members m
inner join committees c on c.name=m.name;
select m.member_id,m.name as member,c.committee_id,c.name as committee from members m
inner join committees c using(name);
select m.member_id,m.name as member,c.committee_id,c.name as committee from members m
right join committees c on c.name=m.name;
select m.member_id,m.name as member,c.committee_id,c.name as committee from members m
left join committees c on c.name=m.name;
select m.member_id,m.name as member,c.committee_id,c.name as committee from members m
join committees c on c.name=m.name;
