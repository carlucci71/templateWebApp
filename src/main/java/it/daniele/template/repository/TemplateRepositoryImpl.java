package it.daniele.template.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TemplateRepositoryImpl implements TemplateExtendedRepository{

	@PersistenceContext
	EntityManager em;

	/*
	@Override
	public List<Object[]> cercaTutti() {
		String sql = "select id,nome, domanda, soluzione, allegato, encode(allegato, 'hex') AS allegatoHEX, allegato_soluzione,encode(allegato_soluzione, 'hex') AS allegato_soluzione_hex, tipo_Quiz, eliminato from quiz order by id";
		return em.createNativeQuery(sql).getResultList();
	}
*/

}
