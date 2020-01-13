package pharmacy;

import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
public class Client implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = AUTO)
	private int idClient;
	
	private String nume;
	private String prenume;
	private String numarTelefon;
	private String adresaEmail;
	private String adresa;
	private String CNP;
	
	@OneToMany(mappedBy = "idClient", targetEntity = pharmacy.Abonament.class)
	private List<Integer> abonamenteClient=new ArrayList<>();
	
	public Client() {
		super();
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getNumarTelefon() {
		return numarTelefon;
	}

	public void setNumarTelefon(String numarTelefon) {
		this.numarTelefon = numarTelefon;
	}

	public String getAdresaEmail() {
		return adresaEmail;
	}

	public void setAdresaEmail(String adresaEmail) {
		this.adresaEmail = adresaEmail;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nume=" + nume + ", prenume=" + prenume + ", numarTelefon="
				+ numarTelefon + ", adresaEmail=" + adresaEmail + ", adresa=" + adresa + ", CNP=" + CNP + "]";
	}
	
   
}
