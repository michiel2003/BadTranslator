create table dutch (word_id integer not null auto_increment, word varchar(255), primary key (word_id)) type=MyISAM
create table english (word_id integer not null auto_increment, word varchar(255), primary key (word_id)) type=MyISAM
create table language (language_id integer not null auto_increment, language_name varchar(255), primary key (language_id)) type=MyISAM
