package br.com.comanda.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the tab_funcionario database table.
 * 
 */
@Entity
@Table(name = "tab_funcionario")
@NamedQuery(name = "FuncionarioDTO.findAll", query = "SELECT f FROM FuncionarioDTO f")
public class FuncionarioDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "TAB_FUNCIONARIO_IDFUNCIONARIO_GENERATOR", sequenceName = "SEQ_PK_ID_FUNCIONARIO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TAB_FUNCIONARIO_IDFUNCIONARIO_GENERATOR")
	@Column(name = "id_funcionario")
	private Integer idFuncionario;

	private String cpf;

	private String email;

	@Column(name = "flg_adm")
	private Boolean flgAdm;

	private byte[] foto;

	private String nome;

	private String telefone;

	// bi-directional many-to-one association to EstabelecimentoDTO
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_id_estabelecimento")
	private EstabelecimentoDTO tabEstabelecimento;

	// bi-directional many-to-one association to UsuarioDTO
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_id_usuario")
	private UsuarioDTO tabUsuario;

	public FuncionarioDTO() {
	}

	public Integer getIdFuncionario() {
		return this.idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getFlgAdm() {
		return this.flgAdm;
	}

	public void setFlgAdm(Boolean flgAdm) {
		this.flgAdm = flgAdm;
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

	public EstabelecimentoDTO getTabEstabelecimento() {
		return this.tabEstabelecimento;
	}

	public void setTabEstabelecimento(EstabelecimentoDTO tabEstabelecimento) {
		this.tabEstabelecimento = tabEstabelecimento;
	}

	public UsuarioDTO getTabUsuario() {
		return this.tabUsuario;
	}

	public void setTabUsuario(UsuarioDTO tabUsuario) {
		this.tabUsuario = tabUsuario;
	}

}