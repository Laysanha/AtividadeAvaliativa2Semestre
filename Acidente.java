package laysasantiagoalfredo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Acidente {
	
	private ArrayList<Veiculo> veiculos;
	Rodovia rodovia;
	private int qtd;
	
	public Acidente() {
		super();
		this.veiculos = new ArrayList<Veiculo>();
		this.rodovia = new Rodovia();
		this.qtd = 0;
	}
	
	public void cadastraCarros () {
		int totalCadastro = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos carros:"));
		for(int i = 0; i == totalCadastro; i++) {
			Veiculo v = new Veiculo();
			v.cadastraVeiculo();
			veiculos.add(v);	
		}
	}
	
	public void cadastraAcidente() {
		setQtd( Integer.parseInt(JOptionPane.showInputDialog("Quantas v�timas fatais:")));	
		cadastraCarros();
	}

	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public Rodovia getRodovia() {
		return rodovia;
	}

	public void setRodovia(Rodovia rodovia) {
		this.rodovia = rodovia;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	@Override
	public String toString() {
		return "Acidente [veiculos=" + veiculos + ", rodovia=" + rodovia + ", qtd=" + qtd + "]";
	} 
	
}
