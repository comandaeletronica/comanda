package br.com.comanda.model;

import java.sql.Time;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EstabelecimentoDTO.class)
public abstract class EstabelecimentoDTO_ {

	public static volatile SingularAttribute<EstabelecimentoDTO, EnderecoDTO> tabEndereco;
	public static volatile ListAttribute<EstabelecimentoDTO, FuncionarioDTO> tabFuncionarios;
	public static volatile SingularAttribute<EstabelecimentoDTO, Integer> idEstabelecimento;
	public static volatile SingularAttribute<EstabelecimentoDTO, String> telefone;
	public static volatile ListAttribute<EstabelecimentoDTO, PromocaoDTO> tabPromocaos;
	public static volatile SingularAttribute<EstabelecimentoDTO, Time> horaAbertura;
	public static volatile SingularAttribute<EstabelecimentoDTO, Time> horaFechamento;
	public static volatile SingularAttribute<EstabelecimentoDTO, String> nome;
	public static volatile ListAttribute<EstabelecimentoDTO, CardapioDTO> tabCardapios;
	public static volatile SingularAttribute<EstabelecimentoDTO, String> descricao;
	public static volatile ListAttribute<EstabelecimentoDTO, PedidoDTO> tabPedidos;

}

