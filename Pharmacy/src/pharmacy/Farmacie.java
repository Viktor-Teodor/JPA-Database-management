package pharmacy;

import static javax.persistence.GenerationType.AUTO;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.Serializable;
import javax.persistence.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
/**
 * Entity implementation class for Entity: farmacie
 *
 */
@Entity

public class Farmacie implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = AUTO)
	private int idFarmacie;
	private String nume;
	private String adresa;
	
	@OneToMany(mappedBy="idFarmacie")
	private List<Comenzi> comenziFarmacie = new ArrayList<>();
	
	private Queue<Lot> comenziInProcesare=new LinkedList<>();
	private Map<Integer,Integer> stocFarmacie=new HashMap<>();
	
	@OneToMany(mappedBy = "idFarmacie")
	private List<Abonament> listaAbonamente = new ArrayList<>();
	
	public Farmacie() {
		super();
	}
   
	public Farmacie(String nume, String adresa) {
		super();
		this.nume=nume;
		this.adresa=adresa;
	}
	
	public List<Comenzi> getcomenziFarmacie(){
		return this.comenziFarmacie;
	}
	public int getIdFarmacie() {
		return idFarmacie;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Queue<Lot> getComenziInProcesare() {
		return comenziInProcesare;
	}

	public void setComenziInProcesare(Queue<Lot> comenziInProcesare) {
		this.comenziInProcesare = comenziInProcesare;
	}
	
	public void adaugaComandaPentruProcesare(Lot lotCareTrebuieAdaugat) {
		this.comenziInProcesare.add(lotCareTrebuieAdaugat);
	}
	
	public void executaComenzileInAsteptare() {
		if (this.comenziInProcesare.size()==0) {
			return;
		}
		else {
			for(Lot procesareLot:this.comenziInProcesare) {
				this.stocFarmacie.put(
							this.stocFarmacie.getOrDefault(procesareLot.getIdProd(), 
														   procesareLot.getCantitate()),0);
			}
			this.comenziInProcesare=new LinkedList<>();
		}
	}
	
	public Map<Integer, Integer> getStocFarmacie() {
		return stocFarmacie;
	}

	@Override
	public String toString() {
		return "Farmacie [idFarmacie=" + idFarmacie + ", nume=" + nume + ", adresa=" + adresa + ", comenziFarmacie="
				+ comenziFarmacie + ", comenziInProcesare=" + comenziInProcesare + ", stocFarmacie=" + stocFarmacie
				+ ", listaAbonamente=" + listaAbonamente + "]";
	}

	
	
}
