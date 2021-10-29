package laysasantiagoalfredo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Veiculo {
	
	ArrayList<Veiculo> veiculos;
	private String anoFabric;
	private Condutor condutor;
	
	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public String getAnoFabric() {
		return anoFabric;
	}

	public void setAnoFabric(String anoFabric) {
		this.anoFabric = anoFabric;
	}

	public Condutor getCondutor() {
		return condutor;
	}

	public void setCondutor(Condutor condutor) {
		this.condutor = condutor;
	}

	public Veiculo() {
		this.veiculos =  new ArrayList<>();
		this.anoFabric = "";
		this.condutor = new Condutor();
	}
	
	public void cadastraVeiculo() {
		condutor.cadastra();
		anoFabric = JOptionPane.showInputDialog("Ano de fabricação:");
	}

	@Override
	public String toString() {
		return "Veiculo [anoFabric=" + anoFabric + "]";
	}
}
