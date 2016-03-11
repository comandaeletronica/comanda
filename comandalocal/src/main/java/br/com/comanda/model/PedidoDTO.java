package br.com.comanda.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the tab_pedido database table.
 * 
 */
@Entity
@Table(name="tab_pedido")
@NamedQuery(name="PedidoDTO.findAll", query="SELECT p FROM PedidoDTO p")
public class PedidoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TAB_PEDIDO_IDPEDIDO_GENERATOR", sequenceName="SEQ_PK_ID_PEDIDO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAB_PEDIDO_IDPEDIDO_GENERATOR")
	@Column(name="id_pedido")
	private Integer idPedido;

	@Column(name="data_pedido")
	private Timestamp dataPedido;

	private String status;

	@Column(name="valor_aberto")
	private BigDecimal valorAberto;

	@Column(name="valor_total")
	private BigDecimal valorTotal;

	//bi-directional many-to-one association to ItemPedido
	@OneToMany(mappedBy="tabPedido")
	private List<ItemPedido> tabItemPedidos;

	//bi-directional many-to-one association to ClienteDTO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_id_cliente")
	private ClienteDTO tabCliente;

	//bi-directional many-to-one association to EstabelecimentoDTO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_id_estabelecimento")
	private EstabelecimentoDTO tabEstabelecimento;

	//bi-directional many-to-one association to MesaDTO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_id_mesa")
	private MesaDTO tabMesa;

	public PedidoDTO() {
	}

	public Integer getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public Timestamp getDataPedido() {
		return this.dataPedido;
	}

	public void setDataPedido(Timestamp dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getValorAberto() {
		return this.valorAberto;
	}

	public void setValorAberto(BigDecimal valorAberto) {
		this.valorAberto = valorAberto;
	}

	public BigDecimal getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<ItemPedido> getTabItemPedidos() {
		return this.tabItemPedidos;
	}

	public void setTabItemPedidos(List<ItemPedido> tabItemPedidos) {
		this.tabItemPedidos = tabItemPedidos;
	}

	public ItemPedido addTabItemPedido(ItemPedido tabItemPedido) {
		getTabItemPedidos().add(tabItemPedido);
		tabItemPedido.setTabPedido(this);

		return tabItemPedido;
	}

	public ItemPedido removeTabItemPedido(ItemPedido tabItemPedido) {
		getTabItemPedidos().remove(tabItemPedido);
		tabItemPedido.setTabPedido(null);

		return tabItemPedido;
	}

	public ClienteDTO getTabCliente() {
		return this.tabCliente;
	}

	public void setTabCliente(ClienteDTO tabCliente) {
		this.tabCliente = tabCliente;
	}

	public EstabelecimentoDTO getTabEstabelecimento() {
		return this.tabEstabelecimento;
	}

	public void setTabEstabelecimento(EstabelecimentoDTO tabEstabelecimento) {
		this.tabEstabelecimento = tabEstabelecimento;
	}

	public MesaDTO getTabMesa() {
		return this.tabMesa;
	}

	public void setTabMesa(MesaDTO tabMesa) {
		this.tabMesa = tabMesa;
	}

}