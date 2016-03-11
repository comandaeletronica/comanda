package br.com.comanda.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the tab_promocao database table.
 * 
 */
@Entity
@Table(name="tab_promocao")
@NamedQuery(name="PromocaoDTO.findAll", query="SELECT p FROM PromocaoDTO p")
public class PromocaoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TAB_PROMOCAO_IDPROMOCAO_GENERATOR", sequenceName="SEQ_PK_ID_PROMOCAO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAB_PROMOCAO_IDPROMOCAO_GENERATOR")
	@Column(name="id_promocao")
	private Integer idPromocao;

	@Column(name="data_fim")
	private Timestamp dataFim;

	@Column(name="data_inicio")
	private Timestamp dataInicio;

	private String descricao;

	private String nome;

	private BigDecimal valor;

	//bi-directional many-to-many association to ProdutoDTO
	@ManyToMany
	@JoinTable(
		name="tab_item_promocao"
		, joinColumns={
			@JoinColumn(name="fk_id_promocao")
			}
		, inverseJoinColumns={
			@JoinColumn(name="fk_id_produto")
			}
		)
	private List<ProdutoDTO> tabProdutos;

	//bi-directional many-to-one association to EstabelecimentoDTO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_id_estabelecimento")
	private EstabelecimentoDTO tabEstabelecimento;

	public PromocaoDTO() {
	}

	public Integer getIdPromocao() {
		return this.idPromocao;
	}

	public void setIdPromocao(Integer idPromocao) {
		this.idPromocao = idPromocao;
	}

	public Timestamp getDataFim() {
		return this.dataFim;
	}

	public void setDataFim(Timestamp dataFim) {
		this.dataFim = dataFim;
	}

	public Timestamp getDataInicio() {
		return this.dataInicio;
	}

	public void setDataInicio(Timestamp dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public List<ProdutoDTO> getTabProdutos() {
		return this.tabProdutos;
	}

	public void setTabProdutos(List<ProdutoDTO> tabProdutos) {
		this.tabProdutos = tabProdutos;
	}

	public EstabelecimentoDTO getTabEstabelecimento() {
		return this.tabEstabelecimento;
	}

	public void setTabEstabelecimento(EstabelecimentoDTO tabEstabelecimento) {
		this.tabEstabelecimento = tabEstabelecimento;
	}

}