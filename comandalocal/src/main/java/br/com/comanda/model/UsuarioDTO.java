package br.com.comanda.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tab_usuario database table.
 * 
 */
@Entity
@Table(name="tab_usuario")
@NamedQuery(name="UsuarioDTO.findAll", query="SELECT u FROM UsuarioDTO u")
public class UsuarioDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TAB_USUARIO_IDUSUARIO_GENERATOR", sequenceName="SEQ_PK_ID_USUARIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAB_USUARIO_IDUSUARIO_GENERATOR")
	@Column(name="id_usuario")
	private Integer idUsuario;

	private String senha;

	private String status;

	private String usuario;

	//bi-directional many-to-one association to ClienteDTO
	@OneToMany(mappedBy="tabUsuario")
	private List<ClienteDTO> tabClientes;

	//bi-directional many-to-one association to FuncionarioDTO
	@OneToMany(mappedBy="tabUsuario")
	private List<FuncionarioDTO> tabFuncionarios;

	public UsuarioDTO() {
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<ClienteDTO> getTabClientes() {
		return this.tabClientes;
	}

	public void setTabClientes(List<ClienteDTO> tabClientes) {
		this.tabClientes = tabClientes;
	}

	public ClienteDTO addTabCliente(ClienteDTO tabCliente) {
		getTabClientes().add(tabCliente);
		tabCliente.setTabUsuario(this);

		return tabCliente;
	}

	public ClienteDTO removeTabCliente(ClienteDTO tabCliente) {
		getTabClientes().remove(tabCliente);
		tabCliente.setTabUsuario(null);

		return tabCliente;
	}

	public List<FuncionarioDTO> getTabFuncionarios() {
		return this.tabFuncionarios;
	}

	public void setTabFuncionarios(List<FuncionarioDTO> tabFuncionarios) {
		this.tabFuncionarios = tabFuncionarios;
	}

	public FuncionarioDTO addTabFuncionario(FuncionarioDTO tabFuncionario) {
		getTabFuncionarios().add(tabFuncionario);
		tabFuncionario.setTabUsuario(this);

		return tabFuncionario;
	}

	public FuncionarioDTO removeTabFuncionario(FuncionarioDTO tabFuncionario) {
		getTabFuncionarios().remove(tabFuncionario);
		tabFuncionario.setTabUsuario(null);

		return tabFuncionario;
	}

}