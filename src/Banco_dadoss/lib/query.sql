create database db_ronchi;
use db_ronchi;

create table pessoas(
	id int auto_increment primary key,
	nome varchar(100) not null,
	idade int not null
);

select*from pessoas;

