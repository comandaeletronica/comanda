package br.com.comanda.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UsuarioDTO.class)
public abstract class UsuarioDTO_ {

	public static volatile SingularAttribute<UsuarioDTO, String> senha;
	public static volatile ListAttribute<UsuarioDTO, FuncionarioDTO> tabFuncionarios;
	public static volatile SingularAttribute<UsuarioDTO, Integer> idUsuario;
	public static volatile ListAttribute<UsuarioDTO, ClienteDTO> tabClientes;
	public static volatile SingularAttribute<UsuarioDTO, String> usuario;
	public static volatile SingularAttribute<UsuarioDTO, String> status;

}

