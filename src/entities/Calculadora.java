package entities;

import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class Calculadora implements Serializable {

	private static final long serialVersionUID = 1L;
	private Double somar;
	private Double subtrair;
	private Double dividir;
	private Double multiplicar;
	
	public Calculadora() {
		
	}

	public Calculadora(Double somar, Double subtrair, Double dividir, Double multiplicar) {
		super();
		this.somar = somar;
		this.subtrair = subtrair;
		this.dividir = dividir;
		this.multiplicar = multiplicar;
	}

	public Double getSomar() {
		return somar;
	}

	public void setSomar(Double somar) {
		this.somar = somar;
	}

	public Double getSubtrair() {
		return subtrair;
	}

	public void setSubtrair(Double subtrair) {
		this.subtrair = subtrair;
	}

	public Double getDividir() {
		return dividir;
	}

	public void setDividir(Double dividir) {
		this.dividir = dividir;
	}

	public Double getMultiplicar() {
		return multiplicar;
	}

	public void setMultiplicar(Double multiplicar) {
		this.multiplicar = multiplicar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dividir == null) ? 0 : dividir.hashCode());
		result = prime * result + ((multiplicar == null) ? 0 : multiplicar.hashCode());
		result = prime * result + ((somar == null) ? 0 : somar.hashCode());
		result = prime * result + ((subtrair == null) ? 0 : subtrair.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (dividir == null) {
			if (other.dividir != null)
				return false;
		} else if (!dividir.equals(other.dividir))
			return false;
		if (multiplicar == null) {
			if (other.multiplicar != null)
				return false;
		} else if (!multiplicar.equals(other.multiplicar))
			return false;
		if (somar == null) {
			if (other.somar != null)
				return false;
		} else if (!somar.equals(other.somar))
			return false;
		if (subtrair == null) {
			if (other.subtrair != null)
				return false;
		} else if (!subtrair.equals(other.subtrair))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calculadora [somar=" + somar + ", subtrair=" + subtrair + ", dividir=" + dividir + ", multiplicar="
				+ multiplicar + "]";
	}

	
	
	
	
	
}
