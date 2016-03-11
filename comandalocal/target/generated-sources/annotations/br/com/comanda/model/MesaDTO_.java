package br.com.comanda.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MesaDTO.class)
public abstract class MesaDTO_ {

	public static volatile SingularAttribute<MesaDTO, Integer> idMesa;
	public static volatile SingularAttribute<MesaDTO, Integer> nroMesa;
	public static volatile SingularAttribute<MesaDTO, String> status;
	public static volatile ListAttribute<MesaDTO, PedidoDTO> tabPedidos;

}

