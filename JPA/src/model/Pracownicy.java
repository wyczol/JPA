package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PRACOWNICY database table.
 * 
 */
@Entity
@Table(name="PRACOWNICY")
@NamedQuery(name="Pracownicy.findAll", query="SELECT p FROM Pracownicy p")
public class Pracownicy implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nazwisko;
	private BigDecimal nrDzialu;
	private BigDecimal nrPrac;
	private String pesel;
	private BigDecimal szef;

	public Pracownicy() {
	}


	public String getNazwisko() {
		return this.nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}


	@Column(name="NR_DZIALU")
	public BigDecimal getNrDzialu() {
		return this.nrDzialu;
	}

	public void setNrDzialu(BigDecimal nrDzialu) {
		this.nrDzialu = nrDzialu;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="NR_PRAC", precision=2)
	public BigDecimal getNrPrac() {
		return this.nrPrac;
	}

	public void setNrPrac(BigDecimal nrPrac) {
		this.nrPrac = nrPrac;
	}


	public String getPesel() {
		return this.pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}


	public BigDecimal getSzef() {
		return this.szef;
	}

	public void setSzef(BigDecimal szef) {
		this.szef = szef;
	}

}