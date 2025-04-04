package Controller;




import Model.Libros;
import Model.Prestamos;
import Model.TipoDeUsuario;
import Model.Usuarios;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Clase Biblioteca que gestiona el sistema de una biblioteca.
 * Permite registrar, eliminar, actualizar y buscar libros y usuarios,
 * así como gestionar préstamos y devoluciones.
 */

public class Biblioteca {

    /** Lista de libros registrados en la biblioteca */
     private ArrayList<Libros> libros;
     /** Lista de usarios registrados en la biblioteca */
    private ArrayList<Usuarios> usuarios;
     /** Lista de prestados registrados en la biblioteca */
    private ArrayList<Prestamos> prestamos;



    


     /** Constructor por defecto que inicializa las listas vacías */
    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

     /**
     * Constructor con parámetros
     * @param libros Lista de libros
     * @param usuarios Lista de usuarios
     * @param prestamos Lista de préstamos
     */

    public Biblioteca(ArrayList<Libros> libros, ArrayList<Usuarios> usuarios, ArrayList<Prestamos> prestamos) {
        this.libros = libros;
        this.usuarios = usuarios;
        this.prestamos = prestamos;
    }

     // Getters y Setters con JavaDoc omitido por brevedad
    public ArrayList<Libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.libros = libros;
    }

    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }


    public ArrayList<Prestamos> getPrestamos() {
        return prestamos;
    }


    public void setPrestamos(ArrayList<Prestamos> prestamos) {
        this.prestamos = prestamos;
    }

     /**
     * Registra un nuevo libro en la biblioteca si no existe ya el ISBN.
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param anhoPublicacion Año de publicación
     * @param ISBN Código ISBN
     * @param ejemplaresDisponibles Número de ejemplares disponibles
     * @return Mensaje de confirmación o error
     */

    public String RegistarLibro(String titulo, String autor, String anhoPublicacion,String ISBN, int ejemplaresDisponibles){

        for (Libros libroAux : libros) {
            if (libroAux.getISBN().equals(ISBN)) {
               
                return "El usuario ingresado ya existe";
            }
        }


        Libros nuevoLibro = new Libros(titulo, autor, anhoPublicacion, ISBN, ejemplaresDisponibles);
    libros.add(nuevoLibro);
     return "Libro agregado existosamente";   
    }

      /**
     * Devuelve una lista con los libros registrados en la biblioteca
     * @return Información detallada de los libros o mensaje si no hay libros
     */
     
    
    public String mostrarLibros() {
        if (libros.isEmpty()) {
            return "No hay libros registrados en la biblioteca.";
        }
    
        StringBuilder librosString = new StringBuilder();
        for (Libros libro : libros) {
            librosString.append("\nTítulo: ").append(libro.getTitulo())
                        .append("\nAutor: ").append(libro.getAutor())
                        .append("\nAño de Publicación: ").append(libro.getAnhoPublicacion())
                        .append("\nISBN: ").append(libro.getISBN())
                        .append("\nEjemplares Disponibles: ").append(libro.getEjemplaresDisponibles())
                        .append("\n---------------------------------\n");
        }
        return librosString.toString();
    }
    
      /**
     * Elimina un libro según su ISBN.
     * @param ISBNE ISBN del libro a eliminar
     * @return Mensaje de confirmación o error
     */


    public String eliminarLibroPorISBN(String ISBNE){

        if (libros.isEmpty()) {
            return  "No hay libros registrados en la biblioteca.";
        }

        for (int i = 0; i < libros.size(); i++) {
            if (ISBNE.equals(libros.get(i).getISBN())) {
                Libros libroEliminado = libros.remove(i);
                return "Libro  "+ libroEliminado.getTitulo() +" ha sido eliminado";
            }
        }
        return "Libro no encontrado";
    }

      /**
     * Busca un libro por su ISBN
     * @param ISBN ISBN del libro a buscar
     * @return Información del libro o mensaje de error
     */


    public String buscarLibroPorISBN(String ISBN) {
        for (Libros libro : libros) {
            if (libro.getISBN().equals(ISBN)) {
                return "Libro encontrado:\n" +
                       "Título: " + libro.getTitulo() + "\n" +
                       "Autor: " + libro.getAutor() + "\n" +
                       "Año de Publicación: " + libro.getAnhoPublicacion() + "\n" +
                       "ISBN: " + libro.getISBN() + "\n" +
                       "Ejemplares Disponibles: " + libro.getEjemplaresDisponibles();
            }
        }
        return "Libro no encontrado con ISBN: " + ISBN;
    }

     /**
     * Actualiza la información de un libro existente.
     * @param ISBNO ISBN del libro a actualizar
     * @param nuevoTitulo Nuevo título
     * @param nuevoAutor Nuevo autor
     * @param nuevoAnhoPublicacion Nuevo año de publicación
     * @param nuevoISBN Nuevo ISBN
     * @param nuevaCantidad Nueva cantidad de ejemplares
     * @return Mensaje de confirmación o error
     */

    public String ActualizarLibro(String ISBNO, String nuevoTitulo, String nuevoAutor, String nuevoAnhoPublicacion , String nuevoISBN, int nuevaCantidad){

        if (libros.isEmpty()) {
            return  "No hay libros registrados en la biblioteca.";
        }

        for (Libros libro : libros){

            if (libro.getISBN().equals(ISBNO)){
                libro.setTitulo(nuevoTitulo);
                libro.setAutor(nuevoAutor);
                libro.setAnhoPublicacion(nuevoAnhoPublicacion);
                libro.setISBN(nuevoISBN);
                libro.setEjemplaresDisponibles(nuevaCantidad);

                return "Libro actualizado correctamente";


            }
        }
        return "Libro no encontrado";
    }


   
    /**
     * Registra un nuevo usuario.
     * @param nombre Nombre del usuario
     * @param Cedula Cédula del usuario
     * @param tipoDeUsuario Tipo (estudiante, profesor, etc.)
     * @return Mensaje de confirmación o error
     */



    public String RegistrarUsuario(String nombre , String Cedula, TipoDeUsuario tipoDeUsuario){

        for (Usuarios usuariosAux : usuarios) {
            if (usuariosAux.getNombre().equals(nombre)) {
               
                return "El LIbro ingresado ya existe";
            }
        }


        Usuarios nuevoUsuario = new Usuarios(nombre, Cedula, tipoDeUsuario);
    usuarios.add(nuevoUsuario);

     return "Libro agregado existe";   
    }

      /**
     * Elimina un usuario por cédula.
     * @param cedulaE Cédula del usuario
     * @return Mensaje de confirmación o error
     */


    public String eliminarUsuarioPorCedula(String cedulaE){

        if (usuarios.isEmpty()) {
            return  "No hay usuarios registrados en la biblioteca.";
        }

        for (int i = 0; i < usuarios.size(); i++) {
            if (cedulaE.equals(usuarios.get(i).getCedula())) {
                Usuarios usuarioEliminado = usuarios.remove(i);
                return "Usuario  "+ usuarioEliminado.getNombre() +" ha sido eliminado";
            }
        }
        return "Usuario no encontrado";
    }

     /**
     * Busca un usuario por su cédula.
     * @param cedulaI Cédula del usuario
     * @return Información del usuario o mensaje de error
     */

    public String buscarUsuarioPorCedula(String cedulaI){

        if (usuarios.isEmpty()) {
            return  "No hay usuarios registrados en la biblioteca.";
        }

        for (int i = 0; i < usuarios.size(); i++) {
            if (cedulaI.equals(usuarios.get(i).getCedula())) {
                String mostrarUsuario = "Nombre: "+ usuarios.get(i).getNombre()+
                " Cedula: "+ usuarios.get(i).getCedula() + " Tipo De persona: "+  usuarios.get(i).getTipoDeUsuario();
                return mostrarUsuario;
                
            }
        }
        return "Usuario no encontrado";
    }

     /**
     * Actualiza el tipo de usuario (Ej. de estudiante a profesor).
     * @param CedulaO Cédula del usuario
     * @param nuevoTipoDeUsuario Nuevo tipo de usuario
     * @return Mensaje de confirmación o error
     */


    public String ActualizarTipoDeUsuario(String CedulaO, TipoDeUsuario nuevoTipoDeUsuario){

        if (usuarios.isEmpty()) {
            return  "No hay usuarios registrados en la biblioteca.";
        }

        for (Usuarios usuarios : usuarios){

            if (usuarios.getCedula().equals(CedulaO)){
                usuarios.setTipoDeUsuario(nuevoTipoDeUsuario);
                

                return "Tipo de usuario actualizado correctamente";


            }
        }
        return "usuario no encontrado";
    }

    /**
     * Solicita un préstamo de libro a un usuario.
     * @param Cedulap Cédula del usuario
     * @param ISBNp ISBN del libro
     * @param ejemplaresDisponibles Cantidad disponible
     * @param diasDePrestamo Días de préstamo
     * @return Mensaje de confirmación o error
     */

    public String solicitarPrestamo(String Cedulap, String ISBNp, int ejemplaresDisponibles , int diasDePrestamo){

        Usuarios usuarioEncontrado = null;
        for (Usuarios usuario : usuarios) {
            if (usuario.getCedula().equals(Cedulap)) {
                usuarioEncontrado = usuario;
                break;
            }
        }

        if (usuarioEncontrado == null) {
            return " Error: No se encontró un usuario con la cedula " + Cedulap ;
        }

        Libros libroEncontrado = null;
        for (Libros libro : libros) {
            if (libro.getISBN().equals(ISBNp)) {
                libroEncontrado = libro;
                break;
            }
        }

        if (libroEncontrado == null) {

            return " Error: No se encontró un libro con ISBN " + ISBNp;
        }

        if (libroEncontrado.getEjemplaresDisponibles() <= 0) {
        
            return  " Error: No hay ejemplares disponibles para el libro " + libroEncontrado.getTitulo();        
        }


         LocalDate fechaDevolucion = LocalDate.now().plusDays(diasDePrestamo);

         Prestamos nuevoPrestamo = new Prestamos(usuarioEncontrado, libroEncontrado, fechaDevolucion, fechaDevolucion, false);
         prestamos.add(nuevoPrestamo);


         libroEncontrado.setEjemplaresDisponibles(libroEncontrado.getEjemplaresDisponibles() - 1);

         return "Prestamo hecho exitosamente";

    }

            /**
     * Registra la devolución de un libro por parte de un usuario.
     * @param cedulaUsuario Cédula del usuario
     * @param isbnLibro ISBN del libro
     * @return Mensaje de confirmación o error
     */


         public String registrarDevolucion(String cedulaUsuario, String isbnLibro) {
           
            Prestamos prestamoEncontrado = null;
            for (Prestamos prestamo : prestamos) {
                if (prestamo.getUsuario().getCedula().equals(cedulaUsuario) && 
                    prestamo.getLibro().getISBN().equals(isbnLibro) && 
                    !prestamo.isDevuelto()) {
                    prestamoEncontrado = prestamo;
                    break;
                }
            }
        
           
            if (prestamoEncontrado == null) {
                return "Error: No se encontró un préstamo activo para el usuario con cédula " + cedulaUsuario + 
                       " y el libro con ISBN " + isbnLibro;
            }
        
            
            prestamoEncontrado.setDevuelto(true);
            
           
            prestamoEncontrado.setFechaDevolucion(LocalDate.now());
            
           
            Libros libroDevuelto = prestamoEncontrado.getLibro();
            libroDevuelto.setEjemplaresDisponibles(libroDevuelto.getEjemplaresDisponibles() + 1);
        
            return "Devolución registrada: El libro \"" + libroDevuelto.getTitulo() + 
                   "\" ha sido devuelto por " + prestamoEncontrado.getUsuario().getNombre();
        }

          /**
     * Busca libros por título o autor, sin importar mayúsculas/minúsculas.
     * @param criterioBusqueda Palabra clave
     * @return Libros que coincidan o mensaje de error
     */


        public String buscarLibrosPorTituloOAutor(String criterioBusqueda) {
            if (libros.isEmpty()) {
                return "No hay libros registrados en la biblioteca.";
            }
        
            
            ArrayList<Libros> librosEncontrados = new ArrayList<>();
        
           
            for (Libros libro : libros) {
                
                if (libro.getTitulo().toLowerCase().contains(criterioBusqueda.toLowerCase()) || 
                    libro.getAutor().toLowerCase().contains(criterioBusqueda.toLowerCase())) {
                    librosEncontrados.add(libro);
                }
            }
        
           
            if (librosEncontrados.isEmpty()) {
                return "No se encontraron libros que coincidan con: " + criterioBusqueda;
            }
        
           
            StringBuilder resultado = new StringBuilder("Libros encontrados:\n");
            
            for (Libros libro : librosEncontrados) {
                resultado.append("\nTítulo: ").append(libro.getTitulo())
                         .append("\nAutor: ").append(libro.getAutor())
                         .append("\nAño de Publicación: ").append(libro.getAnhoPublicacion())
                         .append("\nISBN: ").append(libro.getISBN())
                         .append("\nEjemplares Disponibles: ").append(libro.getEjemplaresDisponibles())
                         .append("\nDisponibilidad: ").append(libro.getEjemplaresDisponibles() > 0 ? "Disponible" : "No disponible")
                         .append("\n---------------------------------");
            }
            
            return resultado.toString();
        }










         
    



        
    }



   



    








    


















    






   














    








    

    


    








    

