package br.com.comanda.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EnderecoDTO.class)
public abstract class EnderecoDTO_ {

	public static volatile SingularAttribute<EnderecoDTO, String> complemento2;
	public static volatile SingularAttribute<EnderecoDTO, String> complemento1;
	public static volatile SingularAttribute<EnderecoDTO, String> uf;
	public static volatile ListAttribute<EnderecoDTO, EstabelecimentoDTO> tabEstabelecimentos;
	public static volatile SingularAttribute<EnderecoDTO, String> cidade;
	public static volatile SingularAttribute<EnderecoDTO, String> estado;
	public static volatile SingularAttribute<EnderecoDTO, Integer> numero;
	public static volatile SingularAttribute<EnderecoDTO, Integer> idEndereco;
	public static volatile SingularAttribute<EnderecoDTO, String> bairro;
	public static volatile SingularAttribute<EnderecoDTO, String> logradouro;
	public static volatile SingularAttribute<EnderecoDTO, String> tipoLogradouro;
	public static volatile SingularAttribute<EnderecoDTO, String> cep;

}

