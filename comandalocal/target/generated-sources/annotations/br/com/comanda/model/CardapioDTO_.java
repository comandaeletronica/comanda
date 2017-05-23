package br.com.comanda.model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CardapioDTO.class)
public abstract class CardapioDTO_ {

	public static volatile ListAttribute<CardapioDTO, ProdutoDTO> tabProdutos;
	public static volatile SingularAttribute<CardapioDTO, byte[]> foto;
	public static volatile SingularAttribute<CardapioDTO, Timestamp> dataFim;
	public static volatile SingularAttribute<CardapioDTO, Timestamp> dataInicio;
	public static volatile SingularAttribute<CardapioDTO, EstabelecimentoDTO> tabEstabelecimento;
	public static volatile SingularAttribute<CardapioDTO, Integer> idCardapio;

}

