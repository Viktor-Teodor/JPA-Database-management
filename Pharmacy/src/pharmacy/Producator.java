package pharmacy;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;
import java.util.ArrayList;

import static javax.persistence.GenerationType.AUTO;


/**
 * Entity implementation class for Entity: Producator
 *
 */

@Entity
public class Producator implements Serializable {
	
	@Id
	@GeneratedValue(strategy = AUTO)
	private int id;
	private String nume;
	private String locatie;
	@OneToMany(mappedBy = "idProducator")
	private List<Produse> listaProduse=new ArrayList<>();
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Produse> getListaProduse() {
		return listaProduse;
	}

	public void setListaProduse(List<Produse> listaProduse) {
		this.listaProduse = listaProduse;
	}

	@Override
	public String toString() {
		return "Producator [id=" + id + ", nume=" + nume + ", locatie=" + locatie + "]";
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getLocatie() {
		return locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	private static final long serialVersionUID = 1L;

	public Producator() {
		super();
		this.nume="";
		this.locatie="";
	}
   
	public Producator(String nume, String locatie) {
		super();
		this.nume=nume;
		this.locatie=locatie;
	}
	
	
}
