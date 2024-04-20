create table CUSTOMERS
(
    name         varchar(50) not null,
    surname      varchar(50) not null,
    age          int         not null,
    phone_number varchar(16) unique,
    id           serial primary key
);

insert into CUSTOMERS
values ('Bob', 'Marley', 65, '+148486547924');
insert into CUSTOMERS
values ('Cary', 'Grant', 23, '+1895486465924');
insert into CUSTOMERS
values ('Marlon', 'Brando', 27, '+148465487924');
insert into CUSTOMERS
values ('Fred', 'Aster', 45, '+148795447924');
insert into CUSTOMERS
values ('Andrey', 'Mironov', 37, '+79214787647');
insert into CUSTOMERS
values ('Alexander', 'Ostrovckiy', 66, '+79214467847');
insert into CUSTOMERS
values ('Alexey', 'Ogoltcov', 99, '+79214447847');