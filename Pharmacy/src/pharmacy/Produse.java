package pharmacy;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.AUTO;
import java.util.List;
import java.util.ArrayList;

/**
 * Entity implementation class for Entity: Produse
 *
 */
@Entity

public class Produse implements Serializable {
	@Id
	@GeneratedValue(strategy = AUTO)
	private int id;
	
	@ManyToOne(targetEntity = pharmacy.Producator.class)
	private int idProducator;
	private String nume;
	private String greutate;
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "idProd")
	private List<Lot> lotsOfThisProduct=new ArrayList<>();
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdProducator() {
		return idProducator;
	}

	public void setIdProducator(int idProducator) {
		this.idProducator = idProducator;
	}

	public List<Lot> getLotsOfThisProduct() {
		return lotsOfThisProduct;
	}

	public void setLotsOfThisProduct(List<Lot> lotsOfThisProduct) {
		this.lotsOfThisProduct = lotsOfThisProduct;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getGreutate() {
		return greutate;
	}

	public void setGreutate(String greutate) {
		this.greutate = greutate;
	}

	public Produse() {
		super();
		nume="";
		greutate="";
	}
	
	public Produse(String nume, String greutate) {
		super();
		this.nume=nume;
		this.greutate=greutate;
	}

	@Override
	public String toString() {
		return "Produse [id=" + id + ", idProducator=" + idProducator + ", nume=" + nume + ", greutate=" + greutate
				+ ", lotsOfThisProduct=" + lotsOfThisProduct + "]";
	}
   
}
