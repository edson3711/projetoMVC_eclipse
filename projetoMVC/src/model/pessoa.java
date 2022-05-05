package model;

import java.util.Calendar;

public class pessoa {
	private int codPes;
	private String nome;
	private Calendar dtNasc;
	private String cpf;
	private String email;

	public pessoa(String nome, Calendar dtNasc, String cpf, String email) {
		super();
		this.nome = nome;
		this.dtNasc = dtNasc;
		this.cpf = cpf;
		this.email = email;
	}

	public pessoa(int codPes, String nome, Calendar dtNasc, String cpf, String email) {
		super();
		this.codPes = codPes;
		this.nome = nome;
		this.dtNasc = dtNasc;
		this.cpf = cpf;
		this.email = email;
	}

	public int getCodPes() {
		return codPes;
	}

	public void setCodPes(int codPes) {
		this.codPes = codPes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Calendar dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
