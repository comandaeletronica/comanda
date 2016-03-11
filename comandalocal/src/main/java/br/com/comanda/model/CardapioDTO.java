package br.com.comanda.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the tab_cardapio database table.
 * 
 */
@Entity
@Table(name="tab_cardapio")
@NamedQuery(name="CardapioDTO.findAll", query="SELECT c FROM CardapioDTO c")
public class CardapioDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TAB_CARDAPIO_IDCARDAPIO_GENERATOR", sequenceName="SEQ_PK_ID_CARDAPIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAB_CARDAPIO_IDCARDAPIO_GENERATOR")
	@Column(name="id_cardapio")
	private Integer idCardapio;

	@Column(name="data_fim")
	private Timestamp dataFim;

	@Column(name="data_inicio")
	private Timestamp dataInicio;

	private byte[] foto;

	//bi-directional many-to-one association to EstabelecimentoDTO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_id_estabelecimento")
	private EstabelecimentoDTO tabEstabelecimento;

	//bi-directional many-to-many association to ProdutoDTO
	@ManyToMany(mappedBy="tabCardapios")
	private List<ProdutoDTO> tabProdutos;

	public CardapioDTO() {
	}

	public Integer getIdCardapio() {
		return this.idCardapio;
	}

	public void setIdCardapio(Integer idCardapio) {
		this.idCardapio = idCardapio;
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

	

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public EstabelecimentoDTO getTabEstabelecimento() {
		return this.tabEstabelecimento;
	}

	public void setTabEstabelecimento(EstabelecimentoDTO tabEstabelecimento) {
		this.tabEstabelecimento = tabEstabelecimento;
	}

	public List<ProdutoDTO> getTabProdutos() {
		return this.tabProdutos;
	}

	public void setTabProdutos(List<ProdutoDTO> tabProdutos) {
		this.tabProdutos = tabProdutos;
	}

}