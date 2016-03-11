package br.com.comanda.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the tab_produto database table.
 * 
 */
@Entity
@Table(name="tab_produto")
@NamedQuery(name="ProdutoDTO.findAll", query="SELECT p FROM ProdutoDTO p")
public class ProdutoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TAB_PRODUTO_IDPRODUTO_GENERATOR", sequenceName="SEQ_PK_ID_PRODUTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAB_PRODUTO_IDPRODUTO_GENERATOR")
	@Column(name="id_produto")
	private Integer idProduto;

	private String descricao;

	private byte[] imagem;

	private String nome;

	private BigDecimal valor;

	//bi-directional many-to-one association to IngredienteDTO
	@OneToMany(mappedBy="tabProduto")
	private List<IngredienteDTO> tabIngredientes;

	//bi-directional many-to-many association to CardapioDTO
	@ManyToMany
	@JoinTable(
		name="tab_item_cardapio"
		, joinColumns={
			@JoinColumn(name="fk_id_produto")
			}
		, inverseJoinColumns={
			@JoinColumn(name="fk_id_cardapio")
			}
		)
	private List<CardapioDTO> tabCardapios;

	//bi-directional many-to-one association to ItemPedido
	@OneToMany(mappedBy="tabProduto")
	private List<ItemPedido> tabItemPedidos;

	//bi-directional many-to-many association to PromocaoDTO
	@ManyToMany(mappedBy="tabProdutos")
	private List<PromocaoDTO> tabPromocaos;

	public ProdutoDTO() {
	}

	public Integer getIdProduto() {
		return this.idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
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

	public List<IngredienteDTO> getTabIngredientes() {
		return this.tabIngredientes;
	}

	public void setTabIngredientes(List<IngredienteDTO> tabIngredientes) {
		this.tabIngredientes = tabIngredientes;
	}

	public IngredienteDTO addTabIngrediente(IngredienteDTO tabIngrediente) {
		getTabIngredientes().add(tabIngrediente);
		tabIngrediente.setTabProduto(this);

		return tabIngrediente;
	}

	public IngredienteDTO removeTabIngrediente(IngredienteDTO tabIngrediente) {
		getTabIngredientes().remove(tabIngrediente);
		tabIngrediente.setTabProduto(null);

		return tabIngrediente;
	}

	public List<CardapioDTO> getTabCardapios() {
		return this.tabCardapios;
	}

	public void setTabCardapios(List<CardapioDTO> tabCardapios) {
		this.tabCardapios = tabCardapios;
	}

	public List<ItemPedido> getTabItemPedidos() {
		return this.tabItemPedidos;
	}

	public void setTabItemPedidos(List<ItemPedido> tabItemPedidos) {
		this.tabItemPedidos = tabItemPedidos;
	}

	public ItemPedido addTabItemPedido(ItemPedido tabItemPedido) {
		getTabItemPedidos().add(tabItemPedido);
		tabItemPedido.setTabProduto(this);

		return tabItemPedido;
	}

	public ItemPedido removeTabItemPedido(ItemPedido tabItemPedido) {
		getTabItemPedidos().remove(tabItemPedido);
		tabItemPedido.setTabProduto(null);

		return tabItemPedido;
	}

	public List<PromocaoDTO> getTabPromocaos() {
		return this.tabPromocaos;
	}

	public void setTabPromocaos(List<PromocaoDTO> tabPromocaos) {
		this.tabPromocaos = tabPromocaos;
	}

}