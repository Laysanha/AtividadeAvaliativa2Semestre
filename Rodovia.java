package laysasantiagoalfredo;

import javax.swing.JOptionPane;

public class Rodovia {
	
	private String nomeRodovia;
	private String quilTotal;
	
	public String getNomeRodovia() {
		return nomeRodovia;
	}

	public void setNomeRodovia(String nomeRodovia) {
		this.nomeRodovia = nomeRodovia;
	}

	public String getQuilTotal() {
		return quilTotal;
	}

	public void setQuilTotal(String quilTotal) {
		this.quilTotal = quilTotal;
	}
	
	public Rodovia() {
		this.nomeRodovia = "";
		this.quilTotal = "";
	}
	
	public void cadastra() {
		setNomeRodovia(JOptionPane.showInputDialog("Nome do rodovia:"));
		setQuilTotal(JOptionPane.showInputDialog("A quilometragem total:"));
	}

	@Override
	public String toString() {
		return "Rodovia [nomeRodovia=" + nomeRodovia + ", quilTotal=" + quilTotal + "]";
	}	
}

