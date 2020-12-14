drop table impiegato cascade constraint;

drop sequence imp_seq;
create sequence imp_seq;

create table impiegato(
id int,
nome varchar2(30) not null,
stipendio number(7,2) not null,
reparto varchar2(30) not null,
constraint p_impiegato_spring primary key(id));


create table impiegato(
id int,
nome varchar2(30) not null,
stipendio number(7,2) not null,
reparto varchar2(30) not null,
url_img varchar2(30) not null,
constraint p_impiegato_spring primary key(id));

create table utente_spr(
username varchar2(10),
nascita date,
password varchar2(30),
constraint p_uspr primary key(username));

insert into utente_spr values('mimmo', sysdate, 'pass');

drop table utente_spr;