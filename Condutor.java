package laysasantiagoalfredo;

import javax.swing.JOptionPane;

public class Condutor {
	
	private String nome;
	private Integer idade;
	private char sexo;
	private boolean embriaguez;
	

	public Condutor() {
		this.nome = "";
		this.idade = 0;
		this.sexo = ' ';
		this.embriaguez = false;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean getEmbriaguez() {
		return embriaguez;
	}

	public void setEmbriaguez(char embriaguez) {
		
		if (embriaguez == 'S') {
			this.embriaguez = true;
		} 
		else if (embriaguez == 'N') {
			this.embriaguez = false;
		}
	}
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome do condutor:"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do condutor:")));
		setSexo(JOptionPane.showInputDialog("Seu sexo(F/M):").charAt(0));
		setEmbriaguez(JOptionPane.showInputDialog("Possui embriaguez (S/N)").toUpperCase().charAt(0));
	}
	
	@Override
	public String toString() {
		return "condutor [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", embriaguez=" + embriaguez + "]";
	}

}
