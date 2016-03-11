package br.com.comanda.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tab_mesa database table.
 * 
 */
@Entity
@Table(name="tab_mesa")
@NamedQuery(name="MesaDTO.findAll", query="SELECT m FROM MesaDTO m")
public class MesaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TAB_MESA_IDMESA_GENERATOR", sequenceName="SEQ_PK_ID_MESA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAB_MESA_IDMESA_GENERATOR")
	@Column(name="id_mesa")
	private Integer idMesa;

	@Column(name="nro_mesa")
	private Integer nroMesa;

	private String status;

	//bi-directional many-to-one association to PedidoDTO
	@OneToMany(mappedBy="tabMesa")
	private List<PedidoDTO> tabPedidos;

	public MesaDTO() {
	}

	public Integer getIdMesa() {
		return this.idMesa;
	}

	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}

	public Integer getNroMesa() {
		return this.nroMesa;
	}

	public void setNroMesa(Integer nroMesa) {
		this.nroMesa = nroMesa;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PedidoDTO> getTabPedidos() {
		return this.tabPedidos;
	}

	public void setTabPedidos(List<PedidoDTO> tabPedidos) {
		this.tabPedidos = tabPedidos;
	}

	public PedidoDTO addTabPedido(PedidoDTO tabPedido) {
		getTabPedidos().add(tabPedido);
		tabPedido.setTabMesa(this);

		return tabPedido;
	}

	public PedidoDTO removeTabPedido(PedidoDTO tabPedido) {
		getTabPedidos().remove(tabPedido);
		tabPedido.setTabMesa(null);

		return tabPedido;
	}

}