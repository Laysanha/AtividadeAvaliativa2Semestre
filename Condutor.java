package laysasantiagoalfredo;

import javax.swing.JOptionPane;

public class Condutor {
	
	private String nome;
	private char sexo;
	private int idade;
	private boolean embriagado;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean getEmbriagado() {
		return embriagado;
	}

	public void setEmbriagado(char embriagado) {	
		
		if (embriagado == 'S') {
			this.embriagado =  true; 
		} else if(embriagado == 'N') {
			this.embriagado = false; 
		}
	}
	
	public Condutor() {
		this.nome = "";
		this.sexo = ' ';
		this.idade = 0;
		this.embriagado = false;
	}
	
	public void cadastraCondutor() { 
		setNome(JOptionPane.showInputDialog("Nome do condutor:"));
		setSexo(JOptionPane.showInputDialog("Sexo do condutor(M/F):").toUpperCase().charAt(0));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade co condutor:")));
		setEmbriagado(JOptionPane.showInputDialog("Embriagado(S/N):").toUpperCase().charAt(0));
	}

	@Override
	public String toString() {
		return "Condutor [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", embriagado=" + embriagado + "]";
	}
}
