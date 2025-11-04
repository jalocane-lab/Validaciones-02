package validaciones;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<Usuario> lista = new ArrayList<>();

		System.out.println("-------------------------------------"  );
		System.out.println("-- Sistema de gestión de usuarios --"  );
		System.out.println("-------------------------------------"  );
		System.out.println("");

		
		lista.add(new Usuario ("Ricardo","ricardo@yahoo.com", "123456"));
		lista.add(new Usuario ("Maria","maria@yahoo.com", "abcdef"));
		
		for (Usuario usuarios : lista) {
			usuarios.mostrarInfo();
		}
		
		
		sc.close();
	}

}
