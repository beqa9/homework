CREATE TABLE countries(
    id serial PRIMARY KEY,
    iso_code_2 varchar(2) NOT NULL,
    iso_code_3 varchar(3) NOT NULL,
    name varchar(255) NOT NULL,
    name_geo varchar(255) NOT NULL
);
CREATE TABLE users(
    id serial PRIMARY KEY,
    email varchar(255) UNIQUE NOT NULL,
    password varchar(255) NOT NULL,
    first_name varchar(255),
    last_name varchar(255),
    last_login_date timestamp,
    active boolean NOT NULL default true,
    changed_by integer references users(id),
    changed_at timestamp,
    created_by integer references users(id),
    created_at timestamp
);
CREATE TABLE companies(
    id serial PRIMARY KEY,
    parent_id integer,
    country_id integer references countries(id),
    name varchar(255) NOT NULL,
    name_geo varchar(255) NOT NULL,
    active boolean NOT NULL default true,
    changed_by integer references users(id),
    changed_at timestamp,
    created_by integer references users(id),
    created_at timestamp
);
CREATE TABLE products(
    id serial PRIMARY KEY,
    ean varchar(255) UNIQUE,
    name varchar(255) NOT NULL,
    company_id integer references companies(id),
    country_id integer references countries(id),
    description varchar(255),
    active boolean NOT NULL default true,
    changed_by integer references users(id),
    changed_at timestamp,
    created_by integer references users(id),
    created_at timestamp
);
