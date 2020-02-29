USE `docker-test`;
DROP TABLE IF EXISTS tbl_orders;
DROP TABLE IF EXISTS  tbl_employee;
DROP TABLE IF EXISTS tbl_department;

CREATE TABLE IF NOT EXISTS tbl_department (	id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
                                               name varchar(10)
);

CREATE TABLE IF NOT EXISTS tbl_employee (	id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
                                             name VARCHAR(64),
                                             gender INT(2) default  0,
                                             email VARCHAR(20),
                                             fk_department_id INT(10)
);
alter table tbl_employee add constraint tbl_employee_fk_department_id_fk0  foreign key (fk_department_id) references tbl_department (id);

CREATE TABLE IF NOT EXISTS tbl_orders (	id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
                                          name VARCHAR(128),
                                          fk_employee_id INT(10)
);
alter table tbl_orders add constraint tbl_order_id_fk0  foreign key (fk_employee_id) references tbl_employee (id);

# CREATE TABLE IF NOT EXISTS tbl_department (	id int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
#                                                name varchar(10)
# );
#
# CREATE TABLE IF NOT EXISTS tbl_employee (	id int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
#                                              name varchar(20),
#                                              gender INT(2) default  0,
#                                              email VARCHAR(20),
#                                              fk_department_id INT(10),
#                                              INDEX fk_department_ind (fk_department_id),
#                                              FOREIGN KEY (fk_department_id) REFERENCES tbl_department(id) ON DELETE CASCADE
# );
#
# CREATE TABLE IF NOT EXISTS tbl_order (	id int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
#                                           name varchar(20),
#                                           fk_employee_id INT(10),
#                                           INDEX fk_employee_ind (fk_employee_id),
#                                           FOREIGN KEY (fk_employee_id) REFERENCES tbl_employee(id) ON DELETE CASCADE
# );