
# 初始化数据
CREATE database if NOT EXISTS `qwe666-spring5demo` default character set utf8 collate utf8_general_ci;
use `qwe666-spring5demo`;

drop table if exists `user`;
create table user(
  id bigint primary key auto_increment,
  nickname varchar(50) unique not null,
  account varchar(50) unique not null,
  password varchar(100) not null,
  salt varchar(50) not null,
  gmt_create datetime not null default now(),
  gmt_modified datetime not null default now()
);

insert into user values (null, '张三', 'zhangsan', 'asdfeawga345d34d==', '1', now(), now());
insert into user values (null, '丽莎', 'lisha', 'asdfeawga345d34d==', '1', now(), now());