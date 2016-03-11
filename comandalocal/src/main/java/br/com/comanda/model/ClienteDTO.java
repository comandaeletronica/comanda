package br.com.comanda.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the tab_cliente database table.
 * 
 */
@Entity
@Table(name="tab_cliente")
@NamedQuery(name="ClienteDTO.findAll", query="SELECT c FROM ClienteDTO c")
public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TAB_CLIENTE_IDCLIENTE_GENERATOR", sequenceName="SEQ_PK_ID_CLIENTE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAB_CLIENTE_IDCLIENTE_GENERATOR")
	@Column(name="id_cliente")
	private Integer idCliente;

	@Column(name="data_nascimento")
	private Timestamp dataNascimento;

	private String email;

	private byte[] foto;

	private String nome;

	private String telefone;

	//bi-directional many-to-one association to UsuarioDTO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_id_usuario")
	private UsuarioDTO tabUsuario;

	//bi-directional many-to-one association to PedidoDTO
	@OneToMany(mappedBy="tabCliente")
	private List<PedidoDTO> tabPedidos;

	public ClienteDTO() {
	}

	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Timestamp getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Timestamp dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
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

	public UsuarioDTO getTabUsuario() {
		return this.tabUsuario;
	}

	public void setTabUsuario(UsuarioDTO tabUsuario) {
		this.tabUsuario = tabUsuario;
	}

	public List<PedidoDTO> getTabPedidos() {
		return this.tabPedidos;
	}

	public void setTabPedidos(List<PedidoDTO> tabPedidos) {
		this.tabPedidos = tabPedidos;
	}

	public PedidoDTO addTabPedido(PedidoDTO tabPedido) {
		getTabPedidos().add(tabPedido);
		tabPedido.setTabCliente(this);

		return tabPedido;
	}

	public PedidoDTO removeTabPedido(PedidoDTO tabPedido) {
		getTabPedidos().remove(tabPedido);
		tabPedido.setTabCliente(null);

		return tabPedido;
	}

}