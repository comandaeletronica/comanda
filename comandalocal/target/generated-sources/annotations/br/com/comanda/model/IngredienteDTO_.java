package br.com.comanda.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(IngredienteDTO.class)
public abstract class IngredienteDTO_ {

	public static volatile SingularAttribute<IngredienteDTO, String> medida;
	public static volatile SingularAttribute<IngredienteDTO, String> nome;
	public static volatile SingularAttribute<IngredienteDTO, ProdutoDTO> tabProduto;
	public static volatile SingularAttribute<IngredienteDTO, Boolean> flgSecreto;
	public static volatile SingularAttribute<IngredienteDTO, Integer> quantidade;
	public static volatile SingularAttribute<IngredienteDTO, Integer> idIngrediente;
	public static volatile SingularAttribute<IngredienteDTO, String> descricao;

}

