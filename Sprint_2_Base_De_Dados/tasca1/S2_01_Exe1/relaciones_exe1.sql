   -- Llista el total de factures d'un client/a en un període determinat.
USE CullDampolla;
SELECT COUNT(cliente_id) AS total_factura
FROM ventas
WHERE fecha_venta IS NULL;

   -- Llista els diferents models d'ulleres que ha venut un empleat/da durant un any.
SELECT gafas.marca
FROM gafas
INNER JOIN ventas ON gafas.id_gafas = ventas.gafas_id_gafas
WHERE ventas.empleado_id_empleado = 1 and YEAR(ventas.fecha_venta) = 2023;

   -- Llista els diferents proveïdors que han subministrat ulleres venudes amb èxit per l'òptica.
SELECT empleado.nombre
FROM gafas
INNER JOIN ventas ON gafas.id_gafas = ventas.gafas_id_gafas
INNER JOIN empleado ON ventas.empleado_id_empleado = empleado.id_empleado;