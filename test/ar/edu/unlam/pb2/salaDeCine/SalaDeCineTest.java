package ar.edu.unlam.pb2.salaDeCine;

import java.util.Scanner;

public class SalaDeCineTest {
	public static void main(String[] args) {
		SalaDeCine salaCine = null;

		Scanner scanner = new Scanner(System.in);
		int opcionSeleccionada;

		do {
			System.out.println("Por favor seleccione una opcion:");
			System.out.println("1. Crear una sala");
			System.out.println("2. Ocupar un butaca");
			System.out.println("3. Mostrar la cantidad de butacas ocupadas");
			System.out.println("4. Consultar si la sala esta vacia");
			System.out.println("5. Consultar lugar para un grupo");
			System.out.println("0. Cerrar");
			opcionSeleccionada = scanner.nextInt();

			switch (opcionSeleccionada) {
			case 1:
				System.out.println("Ingrese el nombre de la sala:");
				scanner.nextLine();
				String nombreSala = scanner.nextLine();

				System.out.println("Numero butacas:");
				Integer cantidadDeButacas = scanner.nextInt();

				System.out.println("Cantidad filas:");
				Integer cantidadDeFilas = scanner.nextInt();

				salaCine = new SalaDeCine(cantidadDeButacas, cantidadDeFilas, nombreSala);
				break;
			case 2:
				System.out.println("Numero fila:");
				Integer fila = scanner.nextInt();

				System.out.println("Numero columna:");
				Integer columna = scanner.nextInt();
				salaCine.ocuparButaca(fila, columna);
				break;
			case 3:
				System.out.println(salaCine.informarButacasOcupadas());
				break;
			case 4:
				String resultado = "Si";
				if (!salaCine.seEncuentraVacia()) {
					resultado = "No";
				}
				System.out.println(resultado);
				break;

			case 5:
				
				System.out.println("Ingrese numero integrantes:");
				
				String resultadoEspacio = "No";
				if (salaCine.hayEspacioPara(scanner.nextInt())) {
					resultadoEspacio = "Si";
				}
				System.out.println(resultadoEspacio);
				break;

			case 0:
				System.out.println("Cerrando el Cine...");
				break;
			default:
				System.out.println("Opcion incorrecta. Intente nuevamente.");
			}
		} while (opcionSeleccionada != 0);

	}
}
