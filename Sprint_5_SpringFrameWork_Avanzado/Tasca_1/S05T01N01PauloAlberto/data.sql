CREATE TABLE IF NOT EXISTS sucursal (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name_sucursal VARCHAR(255) NOT NULL,
  country_sucursal VARCHAR(255) NOT NULL
);

INSERT INTO sucursal (name_sucursal, country_sucursal) VALUES ('Barcelona Central', 'Spain');
INSERT INTO sucursal (name_sucursal, country_sucursal) VALUES ('London Main', 'UK');
INSERT INTO sucursal (name_sucursal, country_sucursal) VALUES ('New York Headquarters', 'USA');
