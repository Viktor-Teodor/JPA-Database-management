package pharmacy;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.TemporalType.DATE;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: lot
 *
 */
@Entity

public class Lot implements Serializable {

	@Temporal(value = DATE)
	private Date dataFabricatie;
	@Temporal(value = DATE)
	private Date dataExpirare;
	
	@Id
	@GeneratedValue(strategy = AUTO)
	private int idLot;
	
	@ManyToOne(targetEntity = pharmacy.Produse.class)
	private int idProd;
	
	@ManyToOne(targetEntity = pharmacy.Comenzi.class)
	private int idComanda;
	private static final long serialVersionUID = 1L;
	private int cantitate;
	
	public Lot() {
		super();
	}
	
	public Lot(Date dataFabricatie, Date dataExpirare, int cantitate) {
		super();
		this.dataFabricatie=dataFabricatie;
		this.dataExpirare=dataExpirare;
		this.cantitate=cantitate;
	}

	public Date getDataFabricatie() {
		return dataFabricatie;
	}

	public void setDataFabricatie(Date dataFabricatie) {
		this.dataFabricatie = dataFabricatie;
	}

	public Date getDataExpirare() {
		return dataExpirare;
	}

	public void setDataExpirare(Date dataExpirare) {
		this.dataExpirare = dataExpirare;
	}

	public int getIdLot() {
		return idLot;
	}

	public void setIdLot(int idLot) {
		this.idLot = idLot;
	}

	public int getIdProd() {
		return idProd;
	}

	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	@Override
	public String toString() {
		return "Lot [dataFabricatie=" + dataFabricatie + ", dataExpirare=" + dataExpirare + ", idLot=" + idLot
				+ ", idProd=" + idProd + ", cantitate=" + cantitate + "]";
	}
   
	
	
}
