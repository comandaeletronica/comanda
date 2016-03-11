package br.com.comanda.model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ClienteDTO.class)
public abstract class ClienteDTO_ {

	public static volatile SingularAttribute<ClienteDTO, String> telefone;
	public static volatile SingularAttribute<ClienteDTO, Integer> idCliente;
	public static volatile SingularAttribute<ClienteDTO, byte[]> foto;
	public static volatile SingularAttribute<ClienteDTO, String> nome;
	public static volatile SingularAttribute<ClienteDTO, Timestamp> dataNascimento;
	public static volatile SingularAttribute<ClienteDTO, String> email;
	public static volatile SingularAttribute<ClienteDTO, UsuarioDTO> tabUsuario;
	public static volatile ListAttribute<ClienteDTO, PedidoDTO> tabPedidos;

}

