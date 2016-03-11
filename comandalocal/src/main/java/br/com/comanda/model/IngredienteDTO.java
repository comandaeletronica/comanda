package br.com.comanda.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tab_ingrediente database table.
 * 
 */
@Entity
@Table(name="tab_ingrediente")
@NamedQuery(name="IngredienteDTO.findAll", query="SELECT i FROM IngredienteDTO i")
public class IngredienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TAB_INGREDIENTE_IDINGREDIENTE_GENERATOR", sequenceName="SEQ_PK_ID_INGREDIENTE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAB_INGREDIENTE_IDINGREDIENTE_GENERATOR")
	@Column(name="id_ingrediente")
	private Integer idIngrediente;

	private String descricao;

	@Column(name="flg_secreto")
	private Boolean flgSecreto;

	private String medida;

	private String nome;

	private Integer quantidade;

	//bi-directional many-to-one association to ProdutoDTO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_id_produto")
	private ProdutoDTO tabProduto;

	public IngredienteDTO() {
	}

	public Integer getIdIngrediente() {
		return this.idIngrediente;
	}

	public void setIdIngrediente(Integer idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getFlgSecreto() {
		return this.flgSecreto;
	}

	public void setFlgSecreto(Boolean flgSecreto) {
		this.flgSecreto = flgSecreto;
	}

	public String getMedida() {
		return this.medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public ProdutoDTO getTabProduto() {
		return this.tabProduto;
	}

	public void setTabProduto(ProdutoDTO tabProduto) {
		this.tabProduto = tabProduto;
	}

}