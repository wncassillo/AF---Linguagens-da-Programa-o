drop database if exists Ingressos;
create database Ingressos;
use Ingressos;

create table Vendas(
id			int				primary key		auto_increment,
nome 		varchar(45)		not null,
cpf 		varchar(15)		not null,
telefone 	varchar(12)		not null, 
ingresso	varchar(10)		not null, 
assento		varchar(4)		not null,
pagamento 	varchar(18)		not null 
);

select * from Vendas;