package laysasantiagoalfredo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	private static ArrayList<Rodovia> rodovias = new ArrayList<Rodovia>();
	private static ArrayList<Acidente> acidentes = new ArrayList<Acidente>();
	
	public static void main(String[] args) {
		String menu = "1 - Cadastrar rodovia"
					+ "\n2 - Cadastrar acidentes"
					+ "\n3 - Listar acidente (Embreagado)"
					+ "\n4 - Rodovia com mais acidentes vitimas"
					+ "\n5 - Quantidade de acidentes";
		int op = 0;
		while(op != 6) {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				cadastraRodovia();
			}	
			if (op == 2) {
				cadastraAcidente();
			}	
			if (op == 3) {
				listaAcidente();
			}	
			if (op == 4) {
				rodoviaMairAcidenteVitima();
			}	
			if (op == 5) {
				qtdAcidente();
			}	
		}
	}
	private static void cadastraRodovia() {
		Rodovia r = new Rodovia();
		r.cadastra();
		rodovias.add(r);
		System.out.println(rodovias);
	}
	
	private static void cadastraAcidente() {
		String rodoviaProcura = JOptionPane.showInputDialog("Pesquise da rodovia:");
		for (Rodovia r: rodovias) {
			if (r.getNomeRodovia().equals(rodoviaProcura)) {
				Acidente a = new Acidente();
				a.cadastraAcidente(r);
				acidentes.add(a);
				System.out.println(acidentes);
			} else {
				JOptionPane.showMessageDialog(null, "Rodovia não encontrada...");
			}
		}
	}
	
	private static void listaAcidente() {
		String lista = "";
		for (Acidente a: acidentes) {
			for (Veiculo v: a.getVeiculos()) { 
				if (v.condutor.getEmbriaguez() == true) {
					lista += a.getRodovia()  + " " + a.getVeiculos() + "\n";
				}
				JOptionPane.showMessageDialog(null, lista);
			}
		}
	}
	
	private static void rodoviaMairAcidenteVitima() {
		
		int maiorQtd = 0;
		Rodovia maiorRodovia = new Rodovia();
		
		for (Acidente a: acidentes) {
			for (Rodovia r: rodovias) {
				if (a.getRodovia() == r) {
					if(maiorQtd == 0) {
						maiorQtd = a.getQtd();
						maiorRodovia = r;
					} else if(a.getQtd() > maiorQtd) {
						maiorQtd = a.getQtd();
						maiorRodovia = r;
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, "O maio é:" + maiorRodovia);
	}
	
	private static void qtdAcidente() {
		String lista = "";
		
		for (Rodovia r: rodovias) {
			int contRodovia = 0;
			
			for (Acidente a: acidentes) {
				if (a.getRodovia() == r) {
					contRodovia++;
				}
			}
			lista +=  "A rodovia "+ r.getNomeRodovia() + " teve " + contRodovia + " acidente(s)";
		}
		JOptionPane.showMessageDialog(null, lista);
	}
}
