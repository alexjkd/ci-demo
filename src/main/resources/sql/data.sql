delete  from tbl_department;
delete  from tbl_employee;

insert into tbl_department(name) values ('sales');
insert into tbl_department(name) values ('developer');
insert into tbl_department(name) values ('tester');

insert into tbl_employee(name, gender, email, fk_department_id) VALUES ('alex','0','alexjkd@outlook.com',1);