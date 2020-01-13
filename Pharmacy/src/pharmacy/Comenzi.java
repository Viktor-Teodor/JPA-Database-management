package pharmacy;

import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Entity implementation class for Entity: comenzi
 *
 */
@Entity
public class Comenzi implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = AUTO)
	private int idComanda;
	
	@ManyToOne(targetEntity = pharmacy.Farmacie.class)
	private int idFarmacie;
	
	@OneToMany(mappedBy = "idComanda")
	private List<Lot> produseleUneiComenzi=new ArrayList<>();
	private Date dataAchizitiei;
	
	public Comenzi() {
		super();
	}
	
	public Comenzi(Date dataAchizitiei) {
		super();
		this.dataAchizitiei=dataAchizitiei;
	}

	public int getIdComanda() {
		return idComanda;
	}

	public int getIdFarmacie() {
		return idFarmacie;
	}

	public void setIdFarmacie(int idFarmacie) {
		this.idFarmacie = idFarmacie;
	}

	public List<Lot> getProduseleUneiComenzi() {
		return produseleUneiComenzi;
	}

	public void setProduseleUneiComenzi(List<Lot> produseleUneiComenzi) {
		this.produseleUneiComenzi = produseleUneiComenzi;
	}

	public Date getDataAchizitiei() {
		return dataAchizitiei;
	}

	public void setDataAchizitiei(Date dataAchizitiei) {
		this.dataAchizitiei = dataAchizitiei;
	}

	@Override
	public String toString() {
		return "Comenzi [idComanda=" + idComanda + ", idFarmacie=" + idFarmacie + ", produseleUneiComenzi="
				+ produseleUneiComenzi + ", dataAchizitiei=" + dataAchizitiei + "]";
	}
 
	
	
}
