select count(cp.id_cp) as 'Quantitat Beguda Venuda'
from comandes_productes cp
join producte p on cp.producte_id = p.id_producte
join comanda c on cp.comanda_id = c.id_comanda
join client cl on c.client_id = cl.id_client
join localitat lt on cl.localitat_id = lt.id_localitat
where p.tipus = 'beguda' and lt.nom = 'Barcelona';