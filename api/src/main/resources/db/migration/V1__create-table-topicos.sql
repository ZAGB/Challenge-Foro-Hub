
create table topicos(

id bigint not null auto_increment,
título varchar(100) not null,
mensaje varchar(200) not null,
fecha_de_creación date not null,
status_tópic int not null,
autor varchar(100) not null,
curso varchar(100) not null,

primary key(id)

)