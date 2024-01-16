USE universidad;
-- 1
SELECT apellido1, apellido2, nombre
FROM `persona`
WHERE tipo = 'alumno'
ORDER BY nombre, apellido1, apellido2 DESC;
-- 2
SELECT apellido1, apellido2, nombre FROM persona
WHERE tipo = 'alumno' AND telefono IS NULL
ORDER BY nombre, apellido1, apellido2;
-- 3
SELECT * FROM persona
WHERE fecha_nacimiento >= '1999-01-01' and fecha_nacimiento <= '2000-01-01' AND tipo = 'alumno';
-- 4
SELECT * FROM persona
WHERE tipo = 'profesor' AND telefono IS NULL AND nif LIKE '%_K%';
-- 5
SELECT*  FROM asignatura
WHERE cuatrimestre = '1' AND curso = '3'AND id_grado = '7'; 
-- 6
SELECT persona.apellido1, persona.apellido2, persona.nombre, departamento.nombre 
FROM persona
INNER JOIN profesor ON persona.id = id_profesor
INNER JOIN departamento ON profesor.id_departamento = departamento.id
ORDER BY persona.apellido1, persona.apellido2, persona.nombre
;
-- 7
SELECT asignatura.nombre, ce.anyo_inicio, ce.anyo_fin
FROM asignatura
INNER JOIN alumno_se_matricula_asignatura am ON asignatura.id = am.id_asignatura
INNER JOIN persona ON am.id_alumno =persona.id
INNER JOIN curso_escolar ce ON am.id_curso_escolar = ce.id
WHERE persona.nif = '26902806M'
;
-- 8
SELECT ps.nombre, ps.apellido1, dep.nombre AS dep_Nombre, gr.nombre
FROM departamento dep
INNER JOIN profesor prof ON  dep.id = prof.id_profesor
INNER JOIN persona ps ON prof.id_profesor = ps.id
INNER JOIN asignatura asi ON prof.id_profesor = asi.id
INNER JOIN grado gr ON asi.id = gr.id
WHERE gr.nombre = 'Grado en Ingeniería Electrónica Industrial (Plan 2010)';
-- 9
SELECT ps.tipo, ps.nombre, ce.anyo_inicio, ce.anyo_fin
FROM persona ps
INNER JOIN alumno_se_matricula_asignatura ams ON  ps.id = ams.id_alumno
INNER JOIN curso_escolar ce ON ams.id_alumno = ce.id
WHERE YEAR(ce.anyo_inicio) = 2018 AND YEAR(ce.anyo_fin) = 2019;

-- Resol les 6 següents consultes utilitzant les clàusules LEFT JOIN i RIGHT JOIN.
-- 1
SELECT dep.nombre AS dep_nombre, ps.apellido1, ps.apellido2, ps.nombre
FROM profesor prof
right JOIN persona ps ON prof.id_profesor = ps.id 
left JOIN departamento dep ON prof.id_profesor = dep.id
ORDER BY dep.nombre, ps.apellido1, apellido2, ps.nombre ;
-- 2
SELECT dep.nombre AS dep_nombre, ps.apellido1, ps.apellido2, ps.nombre
FROM profesor prof
right JOIN persona ps ON prof.id_profesor = ps.id 
LEFT JOIN departamento dep ON prof.id_profesor = dep.id
WHERE dep.id IS NULL;
-- 3
SELECT*
FROM departamento dep
left join profesor prof on dep.id = prof.id_profesor
where prof.id_profesor IS NULL;
-- 4
SELECT asi.nombre, prof.id_profesor
FROM asignatura asi
left JOIN  profesor prof ON asi.id = prof.id_profesor
where prof.id;
-- 5
SELECT dep.nombre,  ams.id_curso_escolar
FROM departamento dep
LEFT JOIN profesor prof ON dep.id = prof.id_profesor
LEFT JOIN asignatura asi ON prof.id_profesor = asi.id
LEFT JOIN `alumno_se_matricula_asignatura` ams ON asi.id = ams.id_curso_escolar
WHERE ams.id_curso_escolar IS NULL;
-- 6

select distinct departamento.nombre
from departamento
left join profesor on departamento.id = profesor.id_departamento
left join asignatura on profesor.id_profesor = asignatura.id_profesor
where asignatura.id is null;


--  consultes resum:
-- 1
SELECT COUNT(ps.id) AS total_alunos
FROM persona ps
WHERE tipo = 'alumno' and ps.id IS NOT NULL;
-- 2
SELECT COUNT(ps.id)
FROM persona  ps
WHERE YEAR (ps.fecha_nacimiento)  = 1999 ;
-- 3
SELECT dep.nombre, COUNT(prof.id_profesor) AS numero_de_profesor
FROM profesor prof
inner JOIN departamento dep ON prof.id_profesor = dep.id
GROUP BY dep.id
ORDER BY numero_de_profesor DESC;
-- 4
SELECT dep.nombre, COUNT(prof.id_profesor) AS numero_de_profesor
FROM profesor prof
right JOIN departamento dep ON prof.id_profesor = dep.id
GROUP BY dep.id;

-- 5
SELECT grado.nombre AS nombre_grado, COUNT(asi.id) AS numero_asignaturas
FROM grado
LEFT JOIN asignatura asi ON grado.id = asi.id_grado
GROUP BY grado.id
ORDER BY COUNT(asi.id)DESC;
-- 6
SELECT grado.nombre AS nombre_grado, COUNT(asi.id) AS numero_asignaturas
FROM grado
LEFT JOIN asignatura asi ON grado.id = asi.id_grado
GROUP BY grado.id
HAVING COUNT(asi.id) > 40;
-- 7
SELECT gr.nombre, asi.tipo, COUNT(asi.creditos)
FROM grado gr
RIGHT JOIN asignatura asi ON gr.id = asi.id_grado
GROUP BY gr.id, asi.tipo
;
-- 8
SELECT  ce.anyo_inicio, COUNT(asm.id_asignatura)
FROM `alumno_se_matricula_asignatura` asm
RIGHT JOIN curso_escolar ce ON asm.id_curso_escolar = ce.id
INNER JOIN asignatura asi ON asm.id_asignatura = asi.id
GROUP BY ce.id;
-- 9
select p.id, p.nombre, p.apellido1, p.apellido2, COUNT(a.id) 
from asignatura a 
right join profesor pr ON pr.id_profesor = a.id_profesor 
join persona p on p.id = pr.id_profesor 
group by p.id 
order by COUNT(a.id) desc;

-- 10
select * 
from persona 
where tipo = 'alumno' 
order by fecha_nacimiento desc 
limit 1;

-- 11
select p.* 
from persona p 
join profesor prof on prof.id_profesor = p.id 
join departamento d on d.id = prof.id_departamento 
left join asignatura a on a.id_profesor = prof.id_profesor 
where a.id is null;
