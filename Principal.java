package laysasantiagoalfredo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	private static ArrayList<Rodovia> rodovias = new ArrayList<Rodovia>();
	
	public static void main(String[] args) {
		String menu = "1 - Cadastrar rodovias"
					+ "\n2 - Cadastrar Acidentes"
					+ "\n3 - Listar todos os acidentes(embriagado)"
					+ "\n4 - Rodovia com mais acidentes fatais"
					+ "\n5 - Quantidade de acidentes por rodovia";
		int op = 0;
		
		while(op != 6) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (op == 1) {
				cadastraRodovia();
			}
//			if (op == 2) {
//				cadastraAcidente();
//			}
//			if (op == 3) {
//				listaAcidenteEmbriagado();
//			}
//			if (op == 4) {
//				rodoviaCom();
//			}
		}
	}
	
	private static void cadastraRodovia() {
		Rodovia r = new Rodovia();
		r.cadastra();
		rodovias.add(r);
		System.out.println(rodovias);
	}
}
