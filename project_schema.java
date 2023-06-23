
public class project_schema {

}DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS step;
DROP TABLE IF EXISTS project_category;
DROP TABLE IF EXISTS material;
DROP TABLE IF EXISTS category;


CREATE TABLE project(
project_id INT AUTO_INCREMENT NOT NULL,
project_name VARCHAR(128) NOT NULL,
estimated_hours DECIMAL(7,2),
actual_hours DECIMAL(7,2),
difficulty INT,
notes TEXT,
PRIMARY KEY (porject_id)

);

CREATE TABLE material (
material_id INT AUTO_INCREMENT NOT NULL,
project_id INT AUTO_INCREMENT NOT NULL,
material_name VARCHAR(128) NOT NULL,
step_order INT AUTO_INCREMENT NOT NULL,
PRIMARY KEY (material_id),
FOREIGN KEY (project_id) REFRENCES material (material_id) ON DELETE CASCADE

);

CREATE TABLE step (
step_id INT AUTO_INCREMENT NOT NULL,
project_id INT AUTO_INCREMENT NOT NULL,
step_text TEXT AUTO_INCREMENT NOT NULL
PRIMARY KEY (step_id),
FOREIGN KEY (project_id) REFRENCES step (step_id) ON DELETE CASCADE

);

CREATE TABLE category (
category_id INT AUTO_INCREMENT NOT NULL,
category_name VARCHAR(128)
PRIMARY KEY (category_id)

);

CREATE TABLE project_category(
project_id INT AUTO_INCREMENT NOT NULL,
category_id INT AUTO_INCREMENT NOT NULL,
PRIMARY KEY (project_category),
FOREIGN KEY (project_id) REFRENCES project_category (project_category) ON DELETE CASCADE,
UNIQUE KEY (project_id, project_category)

);


