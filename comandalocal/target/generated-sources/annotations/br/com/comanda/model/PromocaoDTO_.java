package br.com.comanda.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PromocaoDTO.class)
public abstract class PromocaoDTO_ {

	public static volatile SingularAttribute<PromocaoDTO, Integer> idPromocao;
	public static volatile ListAttribute<PromocaoDTO, ProdutoDTO> tabProdutos;
	public static volatile SingularAttribute<PromocaoDTO, Timestamp> dataFim;
	public static volatile SingularAttribute<PromocaoDTO, BigDecimal> valor;
	public static volatile SingularAttribute<PromocaoDTO, String> nome;
	public static volatile SingularAttribute<PromocaoDTO, Timestamp> dataInicio;
	public static volatile SingularAttribute<PromocaoDTO, EstabelecimentoDTO> tabEstabelecimento;
	public static volatile SingularAttribute<PromocaoDTO, String> descricao;

}

