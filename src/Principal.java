import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar nuestra variables

		// Realizar nuevo proyecto
		// ProyectoHotel
		// Clase: Habitaciones
		// Atributos: int numHab, String tipo, float precio, boleano disponible
		// Constructor
		// tosTring
		// Encapsulamiento
		// Clase Principal
		// Ocupar: Scanner, Lista, Validaciones, Excepcion de errores
		// Realizar el crud basico
		// Editar---numHab y precio

		Scanner lectura = null;

		String matricula, nombre, genero;
		long numCel;

		Alumnos alumno;

		List<Alumnos> registrosLista = new ArrayList<Alumnos>();

		int menuPrincipal, subMenu, indice;

		// Menu principal
		do {
			System.out.println("BIENVENIDO AL SISTEMA");
			System.out.println("1--ALTA");
			System.out.println("2--MOSTRAR");
			System.out.println("3--BUSCAR");
			System.out.println("4---EDITAR"); // subMenu: nombre y numCel
			System.out.println("5----ELIMINAR");
			System.out.println("6---BUSCAR POR NOMBRE");
			System.out.println("7---BUSCAR POR GENERO");
			System.out.println("8---ELIMINAR BUSCANDO POR NOMBRE");
			System.out.println("9---SALIR");

			lectura = new Scanner(System.in);
			menuPrincipal = lectura.nextInt();

			switch (menuPrincipal) {
			case 1:
				try {
					System.out.println("Ingrese la matricula");
					lectura = new Scanner(System.in);
					matricula = lectura.nextLine();

					System.out.println("Ingresa el nombre");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();

					System.out.println("Ingrese el numero de celular");
					lectura = new Scanner(System.in);
					numCel = lectura.nextLong();

					System.out.println("Ingrese el genero");
					lectura = new Scanner(System.in);
					genero = lectura.nextLine();

					// Crear el objeto con todos los atributos
					alumno = new Alumnos(matricula, nombre, numCel, genero);

					// Agregar a la lista
					registrosLista.add(alumno);
					System.out.println("Se agrego el alumno");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;
			case 2:
				System.out.println(registrosLista);
				break;
			case 3:
				// Excepcion de errores
				try {
					// Validaciones
					if (registrosLista.size() > 0) {
						System.out.println("Ingrese el indice del registro a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// Buscar
						alumno = registrosLista.get(indice);
						System.out.println("Se encontro el registro " + alumno);
					} else
						System.out.println("No hay registros en la lista");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar " + e.getMessage());
				}
				break;
			case 4:
				try {
					if (registrosLista.size() > 0) {
						System.out.println("Ingrese el indie del registro para editar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// Buscar
						alumno = registrosLista.get(indice);
						System.out.println("Se encontro el alumno " + alumno.getNombre());

						do {
							System.out.println("SUBMENU PARA EDITAR");
							System.out.println("1---NOMBRE");
							System.out.println("2---NUM. CELULAR");
							System.out.println("3---REGRESAR");

							lectura = new Scanner(System.in);
							subMenu = lectura.nextInt();

							switch (subMenu) {
							case 1:
								System.out.println("Ingrese el nuevo nombre");
								lectura = new Scanner(System.in);
								nombre = lectura.nextLine();

								// Actualizar el objeto
								alumno.setNombre(nombre);
								System.out.println("Registro edito con exito");
								break;
							case 2:
								break;
							case 3:
								break;
							}

						} while (subMenu < 3);

					} else
						System.out.println("No hay registros en la lista");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No existe ese registro");
				}
				break;
			case 5:
				try {
					System.out.println("Ingrese el indice del registro a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Eliminar
					registrosLista.remove(indice);
					System.out.println("Se elimino");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No existe ese registro");
				}
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			}

			// La condicional trabaja con boleanos: true(si) o false(no)---cuando sea este
			// caso se termina el ciclo
		} while (menuPrincipal < 9);

	}

}
