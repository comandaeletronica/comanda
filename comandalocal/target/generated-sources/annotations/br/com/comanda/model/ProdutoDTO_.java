package br.com.comanda.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProdutoDTO.class)
public abstract class ProdutoDTO_ {

	public static volatile ListAttribute<ProdutoDTO, IngredienteDTO> tabIngredientes;
	public static volatile SingularAttribute<ProdutoDTO, Integer> idProduto;
	public static volatile ListAttribute<ProdutoDTO, ItemPedido> tabItemPedidos;
	public static volatile ListAttribute<ProdutoDTO, PromocaoDTO> tabPromocaos;
	public static volatile SingularAttribute<ProdutoDTO, byte[]> imagem;
	public static volatile SingularAttribute<ProdutoDTO, BigDecimal> valor;
	public static volatile SingularAttribute<ProdutoDTO, String> nome;
	public static volatile ListAttribute<ProdutoDTO, CardapioDTO> tabCardapios;
	public static volatile SingularAttribute<ProdutoDTO, String> descricao;

}

