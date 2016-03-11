package br.com.comanda.data;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.comanda.model.ProdutoDTO;

@ApplicationScoped
public class ProdutoRepository {

	@Inject
	private EntityManager em;

	public ProdutoDTO findById(Long id) {
		return em.find(ProdutoDTO.class, id);
	}

	public List<ProdutoDTO> findAllOrderedByName() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<ProdutoDTO> criteria = cb.createQuery(ProdutoDTO.class);
		Root<ProdutoDTO> produto = criteria.from(ProdutoDTO.class);
		criteria.select(produto).orderBy(cb.asc(produto.get("nome")));
		return em.createQuery(criteria).getResultList();
	}
}
