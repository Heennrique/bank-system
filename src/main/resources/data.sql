create table tb_users (
    id varchar (255) not null primary key,
    cpf varchar(12) unique,
    nome varchar(50) not null,
    email varchar(50) not null,
    password varchar(50) not null
);