package br.com.comanda.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FuncionarioDTO.class)
public abstract class FuncionarioDTO_ {

	public static volatile SingularAttribute<FuncionarioDTO, String> telefone;
	public static volatile SingularAttribute<FuncionarioDTO, byte[]> foto;
	public static volatile SingularAttribute<FuncionarioDTO, String> cpf;
	public static volatile SingularAttribute<FuncionarioDTO, Boolean> flgAdm;
	public static volatile SingularAttribute<FuncionarioDTO, String> nome;
	public static volatile SingularAttribute<FuncionarioDTO, Integer> idFuncionario;
	public static volatile SingularAttribute<FuncionarioDTO, EstabelecimentoDTO> tabEstabelecimento;
	public static volatile SingularAttribute<FuncionarioDTO, String> email;
	public static volatile SingularAttribute<FuncionarioDTO, UsuarioDTO> tabUsuario;

}

