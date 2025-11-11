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

		Usuario nuevoUsuario = new Usuario("String", "String", "String");
		
		while (true) {
			System.out.println("- Por favor ingrese el nombre del Usuario que desea ingresar: ");
			nuevoUsuario.nombre = sc.nextLine();		
			if (!nuevoUsuario.nombre.isEmpty() && (nuevoUsuario.nombre.matches("^[A-Za-z]{4,10}$"))) {
				System.out.println("---------------------------------------");
				System.out.println(" --- Nombre ingresado correctamente ---"  );
				System.out.println("---------------------------------------");
				System.out.println("");
				break;
			}
		
	}	
		while (true) {
			System.out.println("- Por favor ingrese el email del Usuario ingresado: ");
			nuevoUsuario.correo = sc.nextLine();		
			if (nuevoUsuario.correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
				System.out.println("---------------------------------------");
				System.out.println(" --- Nombre ingresado correctamente ---"  );
				System.out.println("---------------------------------------");
				System.out.println("");
				break;
			}
		
	}	
		while (true) {
			System.out.println("-Ingrese la contraseña (Debe contener al menos una letra mayúscula, una minúscula, un número y al menos 8 caracteres): ");
			nuevoUsuario.contraseña = sc.nextLine();		
			if (!nuevoUsuario.contraseña.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%]).{8,}$")) {
				System.out.println("---------------------------------------");
				System.out.println(" --- Contraseña ingresada correctamente ---"  );
				System.out.println("---------------------------------------");
				System.out.println("");
				lista.add(nuevoUsuario);
				break;
			}
		
	}	
		
		for (Usuario usuarios : lista) {
			usuarios.mostrarInfo();
		}
		
		
		sc.close();
	}

}
