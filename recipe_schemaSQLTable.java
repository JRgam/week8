
public class recipe_schemaSQLTable {

}

DROP TABLE IF EXISTS ingredients;
DROP TABLE IF EXISTS step;
DROP TABLE IF EXISTS recipe_category;
DROP TABLE IF EXISTS unit;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS recipe;

CREATE TABLE recipe(
recipe_id INT AUTO_INCREMENT NOT NULL,
recipe_name VARCHAR(128) NOT NULL,
notes TEXT,
num_servings INT,
prep_time TIME,
cook_time TIME,
created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY (recipe_id)
);

CREATE TABLE category (
category_id INT AUTO_INCREMENT NOT NULL,
category_name VARCHAR(64) NOT NULL,
PRIMARY KEY (category_id)
);
CREATE TABLE unit (
unit_id INT AUTO_INCREMENT NOT NULL,
unit_name_singulat VARCHAR(32NOT NULL,
unit_name_plural VARCHAR(34) NOT NULL,
primary key (unit_id)
);


CREATE TABLE recipe_category (
recipe_id INT NOT NULL,
category_id INT NOT NULL,
FOREIGN KEY (recipe_id) REFRENCES recipe (recipe_id) ON DELETE CASCADE,
FORIEGN KEY (catefory_id) REFRENCES category (category_id) ON DELETE CASCARE,
UNIQUE KEY (reciepe_id, category_id)
);

CREATE TABLE step(
step_id INT AUTO_INCREMENT NOT NULL,
recipe_id INT NOT NULL,
step_order INT NOT NULL,
step_text TEXT NOT NULL,
PRIMARY KEY (sep_id),
FOREIGN KEY (recipe_id) REFRENCES recipe (recipe_id) ON DELETE CASCADE
);

CREATE TABLE ingredient (
ingredients_id INT AUT0_INCREMENT NOT NULL,
recipe_id INT NOT NULL,
unit_id INT NOT NULL,
ingredients_name VARCHAR(64) NOT NULL,
instruction VARCHAR(64)
ingredient_order INT NOT NULL,
amount DECIMAL(7,2),
PRIMARY KEY(ingredient_id),
FOREIGN KEY (recipe_id) REFRENCES recipe (recipe_id) ON DELETE CASCADE,
FOREIGN KEY (unit_id) REFRENCES unit (unti_id)
);