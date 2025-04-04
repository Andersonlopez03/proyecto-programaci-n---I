package Model;


/**
 * Representa un libro dentro del sistema de la biblioteca.
 * Contiene información sobre el título, autor, año de publicación,
 * ISBN y la cantidad de ejemplares disponibles.
 */


public class Libros {

     /** Título del libro */
    private String titulo;
     /** Autor del libro */
    private String autor;
     /** Año de publicacion */
    private String anhoPublicacion;
     /** ISBN del libro */
    private String ISBN;
     /** Numero de ejemplares disponibles  */
    private int ejemplaresDisponibles;



     /**
     * Constructor vacío para la clase Libros.
     */
    public Libros() {
    }

     /**
     * Constructor con parámetros para inicializar un libro.
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param anhoPublicacion Año de publicación del libro
     * @param iSBN Código ISBN del libro
     * @param ejemplaresDisponibles Cantidad de ejemplares disponibles
     */

    public Libros(String titulo, String autor, String anhoPublicacion, String iSBN, int ejemplaresDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.anhoPublicacion = anhoPublicacion;
        ISBN = iSBN;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

          /**
     * Obtiene el título del libro.
     * @return Título del libro
     */

    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     * @param titulo Nuevo título del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

     /**
     * Obtiene el autor del libro.
     * @return Autor del libro
     */


    public String getAutor() {
        return autor;
    }
      /**
     * Establece el autor del libro.
     * @param autor Nuevo autor del libro
     */


    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el año de publicación del libro.
     * @return Año de publicación
     */


    public String getAnhoPublicacion() {
        return anhoPublicacion;
    }
     /**
     * Establece el año de publicación del libro.
     * @param anhoPublicacion Nuevo año de publicación
     */


    public void setAnhoPublicacion(String anhoPublicacion) {
        this.anhoPublicacion = anhoPublicacion;
    }
     /**
     * Obtiene el código ISBN del libro.
     * @return ISBN del libro
     */


    public String getISBN() {
        return ISBN;
    }
      /**
     * Establece el código ISBN del libro.
     * @param iSBN Nuevo código ISBN del libro
     */


    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    /**
     * Obtiene la cantidad de ejemplares disponibles del libro.
     * @return Número de ejemplares disponibles
     */


    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }
     /**
     * Establece la cantidad de ejemplares disponibles del libro.
     * @param ejemplaresDisponibles Nueva cantidad de ejemplares disponibles
     */


    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }


    


    

    
}
