create table tb_users (
    id varchar (255) not null primary key,
    cpf varchar(12) unique,
    name varchar(50) not null,
    email varchar(50) not null,
    password varchar(50) not null
);

create table tb_accounts(

    id varchar(255) not null primary key,
    account_number int not null,
    agency int not null,
    user_Id varchar(255),
    foreign key (user_Id) references tb_users (id)
);