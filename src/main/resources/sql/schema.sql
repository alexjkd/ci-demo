USE `docker-test`;
DROP TABLE IF EXISTS  tbl_employee;
DROP TABLE IF EXISTS tbl_department;

CREATE TABLE IF NOT EXISTS tbl_department (	id int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
                                               name varchar(10)
);

CREATE TABLE IF NOT EXISTS tbl_employee (	id int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
                                             name varchar(10),
                                             gender INT(2) default  0,
                                             email VARCHAR(20),
                                             fk_department_id INT(2) default  0
);
alter table tbl_employee add constraint tbl_employee_fk_department_id_fk0  foreign key (fk_department_id) references tbl_department (id);
