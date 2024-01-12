USE universidad;
SELECT apellido1, apellido2, nombre
FROM `persona`
WHERE tipo = 'alumno'
ORDER BY nombre, apellido1, apellido2 DESC;

SELECT apellido1, apellido2, nombre FROM persona
WHERE tipo = 'alumno' AND telefono IS NULL
ORDER BY nombre, apellido1, apellido2;
SELECT * FROM persona
WHERE fecha_nacimiento >= '1999-01-01' and fecha_nacimiento <= '2000-01-01' AND tipo = 'alumno';

SELECT * FROM persona
WHERE tipo = 'profesor' AND telefono IS NULL AND nif LIKE '%_K%';

SELECT*  FROM asignatura
WHERE cuatrimestre = '1' AND curso = '3'AND id_grado = '7'; 

SELECT persona.apellido1, persona.apellido2, persona.nombre, departamento.nombre 
FROM persona
INNER JOIN profesor ON persona.id = id_profesor
INNER JOIN departamento ON profesor.id_departamento = departamento.id
ORDER BY persona.apellido1, persona.apellido2, persona.nombre
;

SELECT asignatura.nombre, ce.anyo_inicio, ce.anyo_fin
FROM asignatura
INNER JOIN alumno_se_matricula_asignatura am ON asignatura.id = am.id_asignatura
INNER JOIN persona ON am.id_alumno =persona.id
INNER JOIN curso_escolar ce ON am.id_curso_escolar = ce.id
WHERE persona.nif = '26902806M'
;

SELECT ps.nombre, ps.apellido1, dep.nombre AS dep_Nombre, gr.nombre
FROM departamento dep
INNER JOIN profesor prof ON  dep.id = prof.id_profesor
INNER JOIN persona ps ON prof.id_profesor = ps.id
INNER JOIN asignatura asi ON prof.id_profesor = asi.id
INNER JOIN grado gr ON asi.id = gr.id
WHERE gr.nombre = 'Grado en Ingeniería Electrónica Industrial (Plan 2010)';

SELECT ps.tipo, ps.nombre, ce.anyo_inicio, ce.anyo_fin
FROM persona ps
INNER JOIN alumno_se_matricula_asignatura ams ON  ps.id = ams.id_alumno
INNER JOIN curso_escolar ce ON ams.id_alumno = ce.id
WHERE YEAR(ce.anyo_inicio) = 2018 AND YEAR(ce.anyo_fin) = 2019;






                                                                                 
