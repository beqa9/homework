INSERT INTO users(email,password,first_name,last_name)
VALUES ('beqabeqa329@gmail.com',
		'$2y$10$YsdGO7HjMyxFLZyr3HhcWetX3N/2bBNTdF2RnmY6TtQyl2Sp/cl5a',
		'Beqa','Murjikneli');

INSERT INTO countries(iso_code_2,iso_code_3,name,name_geo)
VALUES ('GE','GEO','Georgia','საქართველო');

INSERT INTO companies(parent_id,country_id,name,name_geo)
VALUES (1,1,'Dawn','განთიადი');

INSERT INTO products(ean,name,company_id,country_id)
VALUES ('9780201379624','solar_panel',1,1);


