create database db_crud;
use db_crud;

create table Produtos(
id int auto_increment primary key,
nome varchar(100) not null,
preco double not null,
quantidade int not null
);
select*from Produtos;
drop table people;