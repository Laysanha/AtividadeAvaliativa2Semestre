package laysasantiagoalfredo;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		String menu = "1 - Cadastrar rodovia"
					+ "\n2 - Cadastrar acidentes"
					+ "\n3 - Listar acidente"
					+ "\n4 - Rodovia com mais acidentes e vitimas"
					+ "\n5 - Quantidade de acidentes";
		int op = 0;
		while(op != 6) {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		}
	}

}
