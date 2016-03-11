package br.com.comanda.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.List;


/**
 * The persistent class for the tab_estabelecimento database table.
 * 
 */
@Entity
@Table(name="tab_estabelecimento")
@NamedQuery(name="EstabelecimentoDTO.findAll", query="SELECT e FROM EstabelecimentoDTO e")
public class EstabelecimentoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TAB_ESTABELECIMENTO_IDESTABELECIMENTO_GENERATOR", sequenceName="SEQ_PK_ID_ESTABELECIMENTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAB_ESTABELECIMENTO_IDESTABELECIMENTO_GENERATOR")
	@Column(name="id_estabelecimento")
	private Integer idEstabelecimento;

	private String descricao;

	@Column(name="hora_abertura")
	private Time horaAbertura;

	@Column(name="hora_fechamento")
	private Time horaFechamento;

	private String nome;

	private String telefone;

	//bi-directional many-to-one association to CardapioDTO
	@OneToMany(mappedBy="tabEstabelecimento")
	private List<CardapioDTO> tabCardapios;

	//bi-directional many-to-one association to EnderecoDTO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_id_endereco")
	private EnderecoDTO tabEndereco;

	//bi-directional many-to-one association to FuncionarioDTO
	@OneToMany(mappedBy="tabEstabelecimento")
	private List<FuncionarioDTO> tabFuncionarios;

	//bi-directional many-to-one association to PedidoDTO
	@OneToMany(mappedBy="tabEstabelecimento")
	private List<PedidoDTO> tabPedidos;

	//bi-directional many-to-one association to PromocaoDTO
	@OneToMany(mappedBy="tabEstabelecimento")
	private List<PromocaoDTO> tabPromocaos;

	public EstabelecimentoDTO() {
	}

	public Integer getIdEstabelecimento() {
		return this.idEstabelecimento;
	}

	public void setIdEstabelecimento(Integer idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Time getHoraAbertura() {
		return this.horaAbertura;
	}

	public void setHoraAbertura(Time horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	public Time getHoraFechamento() {
		return this.horaFechamento;
	}

	public void setHoraFechamento(Time horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<CardapioDTO> getTabCardapios() {
		return this.tabCardapios;
	}

	public void setTabCardapios(List<CardapioDTO> tabCardapios) {
		this.tabCardapios = tabCardapios;
	}

	public CardapioDTO addTabCardapio(CardapioDTO tabCardapio) {
		getTabCardapios().add(tabCardapio);
		tabCardapio.setTabEstabelecimento(this);

		return tabCardapio;
	}

	public CardapioDTO removeTabCardapio(CardapioDTO tabCardapio) {
		getTabCardapios().remove(tabCardapio);
		tabCardapio.setTabEstabelecimento(null);

		return tabCardapio;
	}

	public EnderecoDTO getTabEndereco() {
		return this.tabEndereco;
	}

	public void setTabEndereco(EnderecoDTO tabEndereco) {
		this.tabEndereco = tabEndereco;
	}

	public List<FuncionarioDTO> getTabFuncionarios() {
		return this.tabFuncionarios;
	}

	public void setTabFuncionarios(List<FuncionarioDTO> tabFuncionarios) {
		this.tabFuncionarios = tabFuncionarios;
	}

	public FuncionarioDTO addTabFuncionario(FuncionarioDTO tabFuncionario) {
		getTabFuncionarios().add(tabFuncionario);
		tabFuncionario.setTabEstabelecimento(this);

		return tabFuncionario;
	}

	public FuncionarioDTO removeTabFuncionario(FuncionarioDTO tabFuncionario) {
		getTabFuncionarios().remove(tabFuncionario);
		tabFuncionario.setTabEstabelecimento(null);

		return tabFuncionario;
	}

	public List<PedidoDTO> getTabPedidos() {
		return this.tabPedidos;
	}

	public void setTabPedidos(List<PedidoDTO> tabPedidos) {
		this.tabPedidos = tabPedidos;
	}

	public PedidoDTO addTabPedido(PedidoDTO tabPedido) {
		getTabPedidos().add(tabPedido);
		tabPedido.setTabEstabelecimento(this);

		return tabPedido;
	}

	public PedidoDTO removeTabPedido(PedidoDTO tabPedido) {
		getTabPedidos().remove(tabPedido);
		tabPedido.setTabEstabelecimento(null);

		return tabPedido;
	}

	public List<PromocaoDTO> getTabPromocaos() {
		return this.tabPromocaos;
	}

	public void setTabPromocaos(List<PromocaoDTO> tabPromocaos) {
		this.tabPromocaos = tabPromocaos;
	}

	public PromocaoDTO addTabPromocao(PromocaoDTO tabPromocao) {
		getTabPromocaos().add(tabPromocao);
		tabPromocao.setTabEstabelecimento(this);

		return tabPromocao;
	}

	public PromocaoDTO removeTabPromocao(PromocaoDTO tabPromocao) {
		getTabPromocaos().remove(tabPromocao);
		tabPromocao.setTabEstabelecimento(null);

		return tabPromocao;
	}

}