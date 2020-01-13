package pharmacy;

import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Abonament
 *
 */
@Entity
public class Abonament implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = AUTO)
	private int idAbonament;
	
	private Date dataInceputAbonament;
	@ManyToOne(targetEntity = pharmacy.Farmacie.class)
	private int idFarmacie;
	
	@ManyToOne(targetEntity = pharmacy.Client.class)
	private int idClient;
	
	public Abonament() {
		super();
	}

	public int getIdAbonament() {
		return idAbonament;
	}

	public Date getDataInceputAbonament() {
		return dataInceputAbonament;
	}

	public void setDataInceputAbonament(Date dataInceputAbonament) {
		this.dataInceputAbonament = dataInceputAbonament;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	@Override
	public String toString() {
		return "Abonament [idAbonament=" + idAbonament + ", dataInceputAbonament=" + dataInceputAbonament
				+ ", idClient=" + idClient + "]";
	}
   
	
	
}
