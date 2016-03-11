package br.com.comanda.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ItemPedido.class)
public abstract class ItemPedido_ {

	public static volatile SingularAttribute<ItemPedido, PedidoDTO> tabPedido;
	public static volatile SingularAttribute<ItemPedido, Integer> idItemPedido;
	public static volatile SingularAttribute<ItemPedido, BigDecimal> valor;
	public static volatile SingularAttribute<ItemPedido, ProdutoDTO> tabProduto;
	public static volatile SingularAttribute<ItemPedido, Integer> quantidade;

}

