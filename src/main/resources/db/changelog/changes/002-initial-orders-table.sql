create table ORDERS
(
    date         date        not null,
    product_name varchar(50) not null,
    amount       int         not null,
    customer_id  int         not null,
    id           serial primary key,
    foreign key (customer_id) references customers (id)
);

insert into ORDERS
values (now(), 'Phone', 1, 6);
insert into ORDERS
values (now(), 'TV', 1, 5);
insert into ORDERS
values (now(), 'Washing machine', 1, 4);
insert into ORDERS
values (now(), 'Phone', 1, 3);
insert into ORDERS
values (now(), 'Playstation', 1, 2);
insert into ORDERS
values (now(), 'Phone', 1, 1);
insert into ORDERS
values (now(), 'Phone', 1, 7);