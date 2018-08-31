package br.com.alura.hibernate.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private String agencia;
	private String numero;
	private String banco;
	
	
	public Conta(String agencia,String numero,String banco){
		this.agencia = agencia;
		this.numero = numero;
		this.banco = banco;
	}


	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getBanco() {
		return banco;
	}


	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	
}
