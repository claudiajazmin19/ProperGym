package ff;

import java.util.Scanner;

public class vers1 {

	public static int menuPrincipal(Scanner sc) {
		System.out.println("Bienfkwfkwebfwe");
		System.out.println("Digite el numero de su elecci�n:");
		System.out.println("1. Administrador");
		System.out.println("2. Cliente");
		System.out.println("3. Visualizar");
		int opcion = 0;
		boolean logA = false;
		boolean logC = false;
		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			logA=loginAdministrador(sc);
			opcion = sc.nextInt();
			if(opcion == 2) {
				menuPrincipal(sc);
			}
			break;
		case 2:
			logC=loginCliente(sc);
			opcion = sc.nextInt();
			if(opcion == 2) {
				opcion = menuPrincipal(sc);
			}
			break;
		case 3:
			visualizarActiv();
			System.out.println("Digite el numero de su elecci�n:");
			System.out.println("1. Registrarse/Membres�a");
			System.out.println("2. Atr�s");
			opcion = sc.nextInt();
			if(opcion == 2) {
				opcion = menuPrincipal(sc);
			}else {
				registro();
			}
			break;
		}
		return opcion;
		
	}
	
	public static void registro() {
		System.out.println("Ingrese datos");
		System.out.println("Ingrese datos");
		System.out.println("Ingrese datos");
		System.out.println("Ingrese datos");
		System.out.println("Ingrese datos");
		System.out.println("Ingrese datos");
	}
	
	public static boolean loginAdministrador(Scanner sc) {
		boolean logeado = true;
		String usuarioA = "";
		String contrase�aA = "";
		System.out.println("Login Administrador");
		System.out.println("Usuario");
		usuarioA = sc.nextLine();
		System.out.println("Contrase�a");
		contrase�aA = sc.nextLine();
		System.out.println("2. Atr�s");
		
		return logeado;
	}
	
	public static boolean loginCliente(Scanner sc) {
		boolean logeado = true;
		String usuarioC = "";
		String contrase�aC = "";
		System.out.println("Login Cliente");
		System.out.println("Usuario");
		usuarioC = sc.nextLine();
		System.out.println("Contrase�a");
		contrase�aC = sc.nextLine();
		System.out.println("2. Atr�s");
		return logeado;
	}
	
	public static void visualizarActiv() {
		System.out.println("Actividades del Gimnasio");
		System.out.println("Actividades del Gimnasio");
		System.out.println("Actividades del Gimnasio");
		System.out.println("Actividades del Gimnasio");
		System.out.println("Actividades del Gimnasio");
		System.out.println("Actividades del Gimnasio");
		System.out.println("Actividades del Gimnasio");
	}
	
	public static void main(String[] args) {
		String usuarioA = "";
		String contrase�aA = "";
		String usuarioC = "";
		String contrase�aC = "";
		boolean logA = false;
		boolean logC = false;
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		opcion = menuPrincipal(sc);
		
	}
}
