package laysasantiagoalfredo;

import javax.swing.JOptionPane;

public class Acidentes {
	private Rodovia rodovia;
	private Veiculo veiculo;
	private int qtdVitimas;
	
	//tava pensando que era aqui que deveria ser o array de veiculo, não?
	
	public Rodovia getRodovia() {
		return rodovia;
	}

	public void setRodovia(Rodovia rodovia) {
		this.rodovia = rodovia;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public int getQtdVitimas() {
		return qtdVitimas;
	}

	public void setQtdVitimas(int qtdVitimas) {
		this.qtdVitimas = qtdVitimas;
	}
	
	public Acidentes() {
//		this.rodovia = rodovia;
//		this.veiculo = veiculo;
		this.qtdVitimas = 0;
	}
	
	public void registraAcidente(){
		setQtdVitimas(Integer.parseInt(JOptionPane.showInputDialog("Quantas vitimas fatais:")));
	}
	
	@Override
	public String toString() {
		return "Acidentes [rodovia=" + rodovia + ", veiculo=" + veiculo + ", qtdVitimas=" + qtdVitimas + "]";
	}
}
