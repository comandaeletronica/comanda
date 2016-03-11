package br.com.comanda.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PedidoDTO.class)
public abstract class PedidoDTO_ {

	public static volatile ListAttribute<PedidoDTO, ItemPedido> tabItemPedidos;
	public static volatile SingularAttribute<PedidoDTO, BigDecimal> valorTotal;
	public static volatile SingularAttribute<PedidoDTO, BigDecimal> valorAberto;
	public static volatile SingularAttribute<PedidoDTO, ClienteDTO> tabCliente;
	public static volatile SingularAttribute<PedidoDTO, MesaDTO> tabMesa;
	public static volatile SingularAttribute<PedidoDTO, Timestamp> dataPedido;
	public static volatile SingularAttribute<PedidoDTO, Integer> idPedido;
	public static volatile SingularAttribute<PedidoDTO, EstabelecimentoDTO> tabEstabelecimento;
	public static volatile SingularAttribute<PedidoDTO, String> status;

}

