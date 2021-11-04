package laysasantiagoalfredo;

import javax.swing.JOptionPane;

public class Rodovia {

	private String nomeRodovia;
	private String quilTotal;

	public Rodovia() {
		this.nomeRodovia = "";
		this.quilTotal = "";
	}

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
	
	public void cadastra() {
		setNomeRodovia(JOptionPane.showInputDialog("Nome da rodovia:"));
		setQuilTotal(JOptionPane.showInputDialog("Nome da quilometragem total"));
	}
	
	@Override
	public String toString() {
		return "rodovia [nomeRodovia=" + nomeRodovia + ", quilTotal=" + quilTotal + "]";
	}
	
}
