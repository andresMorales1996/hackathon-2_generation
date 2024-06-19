//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Agenda agenda = new Agenda();

    while (true) {
      mostrarMenu();
      int opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1:
          System.out.println("Ingrese el nombre del contacto: ");
          String nombre = scanner.nextLine();
          System.out.println("Ingrese el teléfono del contacto: ");
          String telefono = scanner.nextLine();
          Contactos nuevoContacto = new Contactos(nombre, telefono);
          agenda.añadirContacto(nuevoContacto);
          break;
        case 2:
          System.out.println("Ingrese el nombre del contacto a buscar: ");
          String nombreBuscar = scanner.nextLine();
          Contactos contactoEncontrado = agenda.buscarContacto(nombreBuscar);
          if (contactoEncontrado != null) {
            System.out.println("Contacto encontrado: " + contactoEncontrado);
          } else {
            System.out.println("Contacto no encontrado.");
          }
          break;
        case 3:
          System.out.println("Listado de contactos: ");
          agenda.listarContactos();
          break;
        case 4:
          System.out.println("Ingrese el nombre del contacto a eliminar: ");
          String nombreEliminar = scanner.nextLine();
          agenda.eliminarContacto(nombreEliminar);
          break;
        case 5:
          if (agenda.agendaLlena()) {
            System.out.println("La agenda está llena.");
          } else {
            System.out.println("La agenda tiene " + agenda.espaciosLibres() + " espacios libres.");
          }
          break;
        case 6:
          System.out.println("Ingrese el nombre del contacto a verificar: ");
          String nombreVerificar = scanner.nextLine();
          boolean contactoExiste = agenda.existeContacto(nombreVerificar);
          if (contactoExiste) {
            System.out.println("El contacto " + nombreVerificar + " Sí existe en la agenda.");
          } else {
            System.out.println("El contacto " + nombreVerificar + " No existe en la agenda.");
          }
          break;
        case 7:
          System.out.println("Saliendo del programa...");
          scanner.close();
          return;
        default:
          System.out.println("Por favor, ingrese una opción válida.");
      }
    }
  }

  private static void mostrarMenu() {
    System.out.println("\nMenú Principal de Agenda:");
    System.out.println("******************************");
    System.out.println("1. Agregar contacto.");
    System.out.println("2. Buscar contacto.");
    System.out.println("3. Mostrar todos los contactos");
    System.out.println("4. Eliminar contacto.");
    System.out.println("5. Verificar espacio en agenda");
    System.out.println("6. Verificar si un contacto existe.");
    System.out.println("7. Salir");
    System.out.println("******************************");
    System.out.println("Ingrese la opcion deseada:\n");
  }
} //Cierre clase Main