USE tienda;
SELECT nombre FROM producto;
SELECT nombre, precio FROM producto;
SELECT * FROM producto;
SELECT nombre, precio, precio * 1.10 FROM producto;
SELECT nombre, precio AS euro , precio * 1.10 AS dolares FROM producto;
SELECT UPPER(nombre), precio FROM producto;
SELECT LOWER(nombre), precio FROM producto;
SELECT nombre, UCASE(SUBSTRING(nombre, 1, 2)) AS iniciales_mayus FROM fabricante;
SELECT nombre, FLOOR(precio) FROM producto;
SELECT nombre, ROUND(precio) FROM producto;
SELECT codigo_fabricante FROM producto WHERE codigo_fabricante > 0;
SELECT DISTINCT codigo_fabricante FROM producto WHERE codigo_fabricante > 0;
SELECT nombre FROM fabricante ORDER BY nombre ASC;
SELECT nombre FROM fabricante ORDER BY nombre DESC;
SELECT * FROM fabricante ORDER BY codigo ASC LIMIT 5;
SELECT * FROM fabricante WHERE codigo > 3 ORDER BY codigo ASC LIMIT 2;
SELECT * FROM producto ORDER BY precio;
SELECT * FROM producto ORDER BY precio DESC;
SELECT * FROM producto WHERE codigo_fabricante = 2;
SELECT  producto.nombre, producto.precio, fabricante.nombre
FROM producto
LEFT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo;
SELECT  producto.nombre, producto.precio, fabricante.nombre
FROM producto
RIGHT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo;
SELECT  producto.nombre, fabricante.codigo, fabricante.nombre
FROM producto
INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo;
SELECT producto.nombre, producto.precio,fabricante.nombre AS nombre_fabricante
FROM producto
INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
ORDER BY producto.precio;
SELECT producto.nombre, producto.precio,fabricante.nombre AS nombre_fabricante
FROM producto
INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
ORDER BY producto.precio DESC;
SELECT fabricante.nombre AS nombre_fabricante, producto.nombre, producto.precio
FROM fabricante
INNER JOIN producto ON  fabricante.codigo = producto.codigo_fabricante
WHERE precio > 200;
SELECT fabricante.nombre AS nombre_fabricante, producto.nombre, producto.precio
FROM fabricante
INNER JOIN producto ON  fabricante.codigo = producto.codigo_fabricante;
SELECT fabricante.nombre AS nombre_fabricante, producto.nombre, producto.precio
FROM fabricante
INNER JOIN producto ON  fabricante.codigo = producto.codigo_fabricante
WHERE fabricante.nombre = 'asus' OR fabricante.nombre = 'Seagate' OR fabricante.nombre = 'Hewlett-Packard';
SELECT fabricante.nombre AS nombre_fabricante, producto.nombre, producto.precio
FROM fabricante
INNER JOIN producto ON  fabricante.codigo = producto.codigo_fabricante
WHERE fabricante.nombre IN ('asus', 'Seagate' ,'Hewlett-Packard');
SELECT fabricante.nombre AS nombre_fabricante, producto.nombre, producto.precio
FROM fabricante
INNER JOIN producto ON  fabricante.codigo = producto.codigo_fabricante
WHERE fabricante.nombre LIKE '%e';
SELECT fabricante.nombre AS nombre_fabricante, producto.nombre, producto.precio
FROM fabricante
INNER JOIN producto ON  fabricante.codigo = producto.codigo_fabricante
WHERE fabricante.nombre LIKE '%w%';
SELECT producto.nombre, producto.precio, fabricante.nombre AS fabricante_name
FROM producto
INNER JOIN fabricante ON fabricante.codigo = producto.codigo_fabricante
WHERE precio = ANY(
SELECT producto.precio
FROM producto
WHERE precio >= 180
ORDER BY nombre
)
ORDER BY precio DESC;
SELECT*
FROM fabricante
RIGHT JOIN producto ON fabricante.codigo = producto.codigo_fabricante;
SELECT*
FROM fabricante
LEFT JOIN producto ON fabricante.codigo = producto.codigo_fabricante;
SELECT *
FROM fabricante
WHERE fabricante.codigo NOT IN(
SELECT producto.codigo_fabricante
FROM producto
);
SELECT *
FROM producto
WHERE producto.codigo_fabricante IN(
SELECT fabricante.codigo
FROM fabricante
WHERE fabricante.nombre = 'Lenovo'
);
SELECT*
FROM producto
WHERE producto.precio = (
	SELECT MAX(producto.precio)
    FROM producto
    WHERE producto.codigo_fabricante IN(
    SELECT fabricante.codigo
    FROM fabricante
    WHERE fabricante.nombre = 'Lenovo')
);
SELECT *
FROM producto
INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
WHERE fabricante.nombre = 'Lenovo'
ORDER BY precio DESC
LIMIT 1
;
SELECT *
FROM producto
INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
WHERE fabricante.nombre = 'Hewlett-Packard'
ORDER BY precio asc
LIMIT 1
;
SELECT*
FROM producto
WHERE producto.precio >= (
	SELECT MAX(producto.precio)
    FROM producto
    WHERE producto.codigo_fabricante IN(
    SELECT fabricante.codigo
    FROM fabricante
    WHERE fabricante.nombre = 'Lenovo')
);
SELECT*
FROM producto
WHERE producto.precio >=(
	SELECT AVG(producto.precio )
    FROM producto
    WHERE producto.codigo_fabricante IN(
    SELECT fabricante.codigo
    FROM fabricante
    WHERE fabricante.nombre = 'Asus')
);











