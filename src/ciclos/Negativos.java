package ciclos;

import javax.swing.JOptionPane;

public class Negativos {

	public static void main(String[] args) {
		
		int contador=0;
		float numeros;
		
		for(int i=1; i<=10; i++) {
			
		numeros= Float.parseFloat(JOptionPane.showInputDialog("Digita el número "+i));
		
		if(numeros<0) {
			contador++;
		}
		
		System.out.println("El número "+i+" es: "+numeros);

	}
		
		System.out.println("Hay "+contador+" números negativos");

}}
