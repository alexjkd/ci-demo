CREATE TABLE IF NOT EXISTS tbl_employee (	id int PRIMARY KEY,
	name varchar(10),
	age INTEGER(2),
	salary FLOAT default  0.00,
	fk_department_id INT
);
CREATE TABLE IF NOT EXISTS tbl_department (	id int PRIMARY KEY,
	name varchar(10)
);