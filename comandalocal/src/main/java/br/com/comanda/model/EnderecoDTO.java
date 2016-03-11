package br.com.comanda.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tab_endereco database table.
 * 
 */
@Entity
@Table(name="tab_endereco")
@NamedQuery(name="EnderecoDTO.findAll", query="SELECT e FROM EnderecoDTO e")
public class EnderecoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TAB_ENDERECO_IDENDERECO_GENERATOR", sequenceName="SEQ_PK_ID_ENDERECO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAB_ENDERECO_IDENDERECO_GENERATOR")
	@Column(name="id_endereco")
	private Integer idEndereco;

	private String bairro;

	private String cep;

	private String cidade;

	private String complemento1;

	private String complemento2;

	private String estado;

	private String logradouro;

	private Integer numero;

	@Column(name="tipo_logradouro")
	private String tipoLogradouro;

	private String uf;

	//bi-directional many-to-one association to EstabelecimentoDTO
	@OneToMany(mappedBy="tabEndereco")
	private List<EstabelecimentoDTO> tabEstabelecimentos;

	public EnderecoDTO() {
	}

	public Integer getIdEndereco() {
		return this.idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento1() {
		return this.complemento1;
	}

	public void setComplemento1(String complemento1) {
		this.complemento1 = complemento1;
	}

	public String getComplemento2() {
		return this.complemento2;
	}

	public void setComplemento2(String complemento2) {
		this.complemento2 = complemento2;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTipoLogradouro() {
		return this.tipoLogradouro;
	}

	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public List<EstabelecimentoDTO> getTabEstabelecimentos() {
		return this.tabEstabelecimentos;
	}

	public void setTabEstabelecimentos(List<EstabelecimentoDTO> tabEstabelecimentos) {
		this.tabEstabelecimentos = tabEstabelecimentos;
	}

	public EstabelecimentoDTO addTabEstabelecimento(EstabelecimentoDTO tabEstabelecimento) {
		getTabEstabelecimentos().add(tabEstabelecimento);
		tabEstabelecimento.setTabEndereco(this);

		return tabEstabelecimento;
	}

	public EstabelecimentoDTO removeTabEstabelecimento(EstabelecimentoDTO tabEstabelecimento) {
		getTabEstabelecimentos().remove(tabEstabelecimento);
		tabEstabelecimento.setTabEndereco(null);

		return tabEstabelecimento;
	}

}