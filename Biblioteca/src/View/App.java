package View;
import java.util.Scanner;

import Controller.Biblioteca;
import Model.TipoDeUsuario;


/**
 * Clase principal de la aplicación.
 * Proporciona un menú interactivo para gestionar una biblioteca:
 * registrar libros, buscar, eliminar, registrar usuarios, préstamos, etc.
 */

public class App {


     /**
     * Método principal que ejecuta el menú de opciones para el usuario.
     * 
     * @param args Argumentos de línea de comandos (no utilizados aquí)
     * @throws Exception en caso de errores imprevistos
     */

    public static void main(String[] args) throws Exception {
         // Se crea una instancia de la biblioteca
        Biblioteca sogamosoBiblioteca = new Biblioteca();
         // Se inicializa el Scanner para la entrada de datos
         Scanner sc = new Scanner(System.in);

         int opcion = 0;

          // Menú principal, se repite hasta que el usuario elija salir (opción 13)
         while (opcion != 13) {
            System.out.println(" 1. Registrar Libros \n 2. Ver informacion de los Libros \n 3. Buscar Libro por ISBN \n 4. Eliminar Libro por ISBN \n 5. Actualizar informacion de libro \n 6. Registrar Usuarios \n 7. Eliminar Usuarios por Cedula  8. Buscar Usuarios Por cedula \n 9. Actualizar tipo usuario \n 10. Solicitar Prestamos\n 11. Registrar la devolucion \n 12. Buscar Libros por titulo o autor \n 13. Salir \n ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:

                 // Registro de libro

                System.out.print("Ingrese el título: ");
                String titulo = sc.nextLine();
    
                System.out.print("Ingrese el autor: ");
                String autor = sc.nextLine();
    
                System.out.print("Ingrese el año de publicación: ");
                String anho = sc.nextLine();
    
                System.out.print("Ingrese el ISBN: ");
                String isbn = sc.nextLine();
    
                System.out.print("Ingrese el número de ejemplares: ");
                int ejemplares = Integer.parseInt(sc.nextLine());
    
                String mensaje = sogamosoBiblioteca.RegistarLibro(titulo, autor, anho, isbn, ejemplares);
                System.out.println(mensaje);
                break;

            case 2:

                 // Mostrar todos los libros registrados
                System.out.println("--- Libros Registrados ---");
                System.out.println(sogamosoBiblioteca.mostrarLibros());
                break;

            case 3:
                 // Buscar libro por ISBN
                System.out.println("Ingrese el ISBN del libro a buscar:");
                String isbnBuscar = sc.nextLine();
                System.out.println(sogamosoBiblioteca.buscarLibroPorISBN(isbnBuscar));
                break;

            case 4:
                 // Eliminar libro por ISBN
                System.out.println("Ingrese el ISBN del libro a eliminar:");
                String isbnEliminar = sc.nextLine();
                System.out.println(sogamosoBiblioteca.eliminarLibroPorISBN(isbnEliminar));
                break;

            case 5:
             // Actualizar información del libro
            System.out.println("Ingrese el Isbn del libro que deseas actualizar");
            String ISBNO = sc.nextLine();
            System.out.println("Ingrese el nuevo titulo");
            String nuevoTitulo = sc.nextLine();
            System.out.println("Ingrese el nuevo autor");
            String nuevoAutor = sc.nextLine();
            System.out.println("Ingrese el nuevo año de publicacion");
            String nuevoAnhoPublicacion = sc.nextLine();
            System.out.println("Ingrese el nuevo ISBN");
            String nuevoISBN = sc.nextLine();
            System.out.println("Ingrese el nuevo Ejemplares Disponibles");
            int nuevaCantidad  = Integer.parseInt(sc.nextLine());


            String mensaje2 = sogamosoBiblioteca.ActualizarLibro(ISBNO, nuevoTitulo, nuevoAutor, nuevoAnhoPublicacion, nuevoISBN, nuevaCantidad );


            System.out.println("\n " + mensaje2);  
            
                break;

            case 6:

            // Registro de nuevo usuario
            System.out.println("\n REGISTRO DE NUEVO USUARIO");



            System.out.println("Ingrese el nombre");
            String nombre  = sc.nextLine();
            System.out.println("Ingrese la cedula");
            String cedula = sc.nextLine();
            System.out.println(" Tipo de Usuario:");
            System.out.println("1. ESTUDIANTE");
            System.out.println("2. PROFESOR");
            System.out.print(" Seleccione una opción (1,2,3): ");
            int opcion2 = Integer.parseInt(sc.nextLine());

            TipoDeUsuario tipoDeUsuario;
            if (opcion2 == 1) {
                tipoDeUsuario = TipoDeUsuario.ESTUDIANTE;
            } else if (opcion2 == 2) {
                tipoDeUsuario = TipoDeUsuario.PROFESOR;
            } else if (opcion2 == 3) {
                tipoDeUsuario = TipoDeUsuario.CIUDADANO;
            } else {
                System.out.println(" Opción inválida. Se asignará ESTUDIANTE por defecto.");
                tipoDeUsuario = TipoDeUsuario.ESTUDIANTE;
            }


            String registroUsuario = sogamosoBiblioteca.RegistrarUsuario(nombre, cedula, tipoDeUsuario);

            System.out.println("\n " + registroUsuario);


                break;
                    
                

        case 7:

        // Eliminar usuario por cédula

                 System.out.println("Ingrese la cedula a eliminar");
                 String cedulaE = sc.nextLine();
 
 
                 String eliminar = sogamosoBiblioteca.eliminarUsuarioPorCedula(cedulaE);
                 System.out.println(eliminar);
 
 
                 break;

        case 8:

          // Buscar usuario por cédula
                 System.out.println("Ingrese la cedula del usuario que desea buscar");
                 String cedulaI = sc.nextLine();
 
 
                 String buscarCedula = sogamosoBiblioteca.buscarUsuarioPorCedula(cedulaI);
                 System.out.println(buscarCedula);
 
                 break;

        case 9:

         // Actualizar tipo de usuario
                 System.out.println("Ingrese la cedula del usuario al que desea actualizar el tipo de usuario");
                 String CedulaO = sc.nextLine();
                 
                 System.out.println("🔹 Nuevo Tipo de Usuario:");
                 System.out.println("1. ESTUDIANTE");
                 System.out.println("2. PROFESOR");
                 System.out.println("3. INVITADO");
                 System.out.print(" Seleccione una opción (1, 2 o 3): ");
                 int opcion4 = Integer.parseInt(sc.nextLine());
 
                 TipoDeUsuario nuevoTipoDeUsuario;
                 if (opcion4 == 1) {
                     nuevoTipoDeUsuario = TipoDeUsuario.ESTUDIANTE;
                 } else if (opcion4== 2) {
                     nuevoTipoDeUsuario = TipoDeUsuario.PROFESOR;
                 } else if (opcion4 == 3) {
                     nuevoTipoDeUsuario = TipoDeUsuario.CIUDADANO;
                 } else {
                     System.out.println(" Opción inválida. Se asignará ESTUDIANTE por defecto.");
                     nuevoTipoDeUsuario = TipoDeUsuario.ESTUDIANTE;
                 }
 
                 
 
 
                 String actualizar = sogamosoBiblioteca.ActualizarTipoDeUsuario( CedulaO , nuevoTipoDeUsuario );
                 
 
 
                 System.out.println("\n " + actualizar);  
                 
                     break;
 
 

                 case 10:

                  // Solicitar préstamo de libro

                 System.out.println("\n SOLICITAR PRÉSTAMO DE LIBRO");

                 // 1. Solicitar la cédula del usuario
                 System.out.print(" Ingrese la cédula del usuario: ");
                 String cedulap = sc.nextLine();
         
                 // 2. Solicitar el ISBN del libro
                 System.out.print(" Ingrese el ISBN del libro: ");
                 String ISBNP = sc.nextLine();
 
                 System.out.print(" ¿Por cuántos días desea el préstamo?: ");
                 int diasDePrestamo = Integer.parseInt(sc.nextLine());
 
                 
 
 
                 String prestamoRealizado = sogamosoBiblioteca.solicitarPrestamo(cedulap, ISBNP, 0, diasDePrestamo);
 
 
                 System.out.println("\n " + prestamoRealizado);
 
 
                 break;


                  

                 case 11:
                  // Registrar devolución de libro

                 System.out.println("\n REGISTRAR DEVOLUCIÓN DE LIBRO");
                 System.out.println("Ingrese la cédula del usuario");
                 String cedulaDevolucion = sc.nextLine();
                 System.out.println("Ingrese el ISBN del libro a devolver");
                 String isbnDevolucion = sc.nextLine();
                 
                 String resultadoDevolucion = sogamosoBiblioteca.registrarDevolucion(cedulaDevolucion, isbnDevolucion);
                 System.out.println(resultadoDevolucion);
                 break;


                

                 case 12:
                    // Buscar libros por título o autor

                 System.out.println("\n BUSCAR LIBROS POR TÍTULO O AUTOR");
                 System.out.println("Ingrese el título o autor a buscar:");
                 String criterioBusqueda = sc.nextLine();
                 
                 String resultadoBusqueda = sogamosoBiblioteca.buscarLibrosPorTituloOAutor(criterioBusqueda);
                 System.out.println(resultadoBusqueda);
                 break;
 
 
                   

                 case 13:


                     System.out.println("Saliendo del programa...");
                     break;

                 default:
                     System.out.println("Opción inválida. Intente de nuevo.");
             }
        } 
        // Cerramos el Scanner para liberar los recursos del sistema
        sc.close(); 
    }
}




















        