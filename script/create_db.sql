-- 创建数据库
create schema mango
    default character set utf8mb4
    collate utf8mb4_general_ci;
-- 创建用户
CREATE USER 'mango'@'%' IDENTIFIED BY 'qwer@1234';
-- 给用户赋予权限
grant all privileges on mango.* to 'mango'@'%';