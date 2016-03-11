package br.com.comanda.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tab_item_pedido database table.
 * 
 */
@Entity
@Table(name="tab_item_pedido")
@NamedQuery(name="ItemPedido.findAll", query="SELECT i FROM ItemPedido i")
public class ItemPedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TAB_ITEM_PEDIDO_IDITEMPEDIDO_GENERATOR", sequenceName="SEQ_PK_ID_ITEM_PEDIDO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAB_ITEM_PEDIDO_IDITEMPEDIDO_GENERATOR")
	@Column(name="id_item_pedido")
	private Integer idItemPedido;

	private Integer quantidade;

	private BigDecimal valor;

	//bi-directional many-to-one association to PedidoDTO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_id_pedido")
	private PedidoDTO tabPedido;

	//bi-directional many-to-one association to ProdutoDTO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_id_produto")
	private ProdutoDTO tabProduto;

	public ItemPedido() {
	}

	public Integer getIdItemPedido() {
		return this.idItemPedido;
	}

	public void setIdItemPedido(Integer idItemPedido) {
		this.idItemPedido = idItemPedido;
	}

	public Integer getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public PedidoDTO getTabPedido() {
		return this.tabPedido;
	}

	public void setTabPedido(PedidoDTO tabPedido) {
		this.tabPedido = tabPedido;
	}

	public ProdutoDTO getTabProduto() {
		return this.tabProduto;
	}

	public void setTabProduto(ProdutoDTO tabProduto) {
		this.tabProduto = tabProduto;
	}

}