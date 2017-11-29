import java.util.Scanner;

import javax.swing.JOptionPane;

public class MostrarTexto {
	
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Hola Mundo");
		/*Para que salga un cuadro de dialogo.*/
		JOptionPane.showMessageDialog(null, "Bienvenido a Java");
		System.out.println("Introduce un numero");
		Scanner teclado = new Scanner(System.in);
		numero = teclado.nextInt();
		System.out.println("El numero por 5 es "+ numero * 5);	
	}
}