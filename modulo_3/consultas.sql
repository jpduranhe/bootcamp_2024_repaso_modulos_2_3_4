-- create schema mascotainador;
use mascotainador;


-- petowner

create table petowner(
	petowner_id int auto_increment primary key,
	petowner_name varchar(50) not null,
    petowner_lastname varchar(50) not null ,
    petowner_email varchar(100) not null 
);
-- drop table petowner;

alter table petowner
add constraint uq_email UNIQUE (petowner_email);

insert into petowner (petowner_name,petowner_lastname,petowner_email)
values('Isaura','Carrasco','isaura@mail.com'),
('Jose','Mora','jose@mail.com');
select *  from petowner; 
delete from petowner where petowner_name='Jose';

create table gender(
	gender_id int auto_increment primary key,
    gender_description varchar(50) not null
);

create table pet(
	pet_id int auto_increment primary key,
	pet_name varchar(50) not null,
    pet_breed varchar(50) not null,
    petowner_id int not null,
    gender_id int not null,
    foreign key (petowner_id)
	references  petowner (petowner_id),
    foreign key (gender_id)
	references  gender (gender_id)
);

insert into gender (gender_description)
value ('Female'),('Male');
select * from gender;

insert into pet (pet_name,pet_breed,petowner_id,gender_id)
value('Firulais','Kilterier',6,1),
('Cachupin','Pastor Aleman',7,2),
('Luci','Persa',6,2);

select * from pet;



select p.pet_name, pw.petowner_name, pw.petowner_lastname
from pet p
inner join petowner pw
on p.petowner_id= pw.petowner_id;


select p.pet_name,g.gender_description ,pw.petowner_name, pw.petowner_lastname
from pet p
inner join petowner pw
on p.petowner_id= pw.petowner_id
inner join gender g
on p.gender_id= g.gender_id
where g.gender_id=2;



select count(*),g.gender_description
from pet p
inner join gender g
on p.gender_id= g.gender_id
group by g.gender_description;



select count(*),pw.petowner_name
from pet p
inner join petowner pw
on p.petowner_id= pw.petowner_id
group by pw.petowner_name;

update petowner set petowner_name='Juan Jose'
where petowner_id=7;

set autocommit=OFF;
start transaction; 
update petowner set petowner_name='Juan Joseeee'
where petowner_id=7;

-- commit 
-- rollback ;
