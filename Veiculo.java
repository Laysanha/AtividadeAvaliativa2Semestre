package laysasantiagoalfredo;

import javax.swing.JOptionPane;

public class Veiculo {
	
	Condutor condutor;
	String anoFabric;
	
	public Veiculo() {
		this.condutor = new Condutor();
		this.anoFabric = "";
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
	
	public void cadastraVeiculo() {
		condutor.cadastra();
		anoFabric = JOptionPane.showInputDialog("Ano de fabricação:");
	}

	@Override
	public String toString() {
		return "veiculo [anoFabric=" + anoFabric + "]";
	}

}
