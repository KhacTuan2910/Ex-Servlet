create database if not exists accountDB;
use accountDB;

create table _account (
	id int auto_increment unique,
    username varchar(255),
    _password varchar(255) not null,
    isAdmin int,
    primary key(id)
);

insert _account(username, _password, isAdmin)
values
	("admin", "admin123", 1),
    ("tuan", "123456", 0),
    ("nguyen", "Nguyen11", 1),
    ("khac", "tuna12", 0),
    ("hai", "vna231", 0),
    ("trung", "321123", 0);
