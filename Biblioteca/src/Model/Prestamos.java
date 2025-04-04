package Model;

import java.time.LocalDate;


/**
 * Representa un préstamo de un libro en la biblioteca.
 * Contiene información sobre el usuario que solicita el préstamo,
 * el libro prestado, la fecha de préstamo, la fecha de devolución
 * y si el libro ha sido devuelto.
 */


public class Prestamos{
    /** Usuario que realiza el préstamo */
    private Usuarios usuario;
    /** Libro que se está prestando */
    private Libros libro;
    /** Fecha en la que se realizó el préstamo */
    private LocalDate fechaPrestamo;
     /** Fecha en la que se debe devolver el libro */
    private LocalDate fechaDevolucion;
     /** Indica si el libro ha sido devuelto */
    private boolean devuelto;


    
    /**
     * Constructor vacío para la clase Prestamos.
     */
    public Prestamos() {
    }


    /**
     * Constructor con parámetros para inicializar un préstamo.
     * @param usuario Usuario que realiza el préstamo
     * @param libro Libro prestado
     * @param fechaPrestamo Fecha en que se realizó el préstamo
     * @param fechaDevolucion Fecha límite de devolución
     * @param devuelto Estado del préstamo (true si el libro ha sido devuelto)
     */


    public Prestamos(Usuarios usuario, Libros libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion,
            boolean devuelto) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.devuelto = devuelto;
    }

    /**
     * Obtiene el usuario que realizó el préstamo.
     * @return Usuario del préstamo
     */


    public Usuarios getUsuario() {
        return usuario;
    }

      /**
     * Establece el usuario que realizó el préstamo.
     * @param usuario Nuevo usuario del préstamo
     */


    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

     /**
     * Obtiene el libro prestado.
     * @return Libro prestado
     */


    public Libros getLibro() {
        return libro;
    }

      /**
     * Establece el libro prestado.
     * @param libro Nuevo libro del préstamo
     */


    public void setLibro(Libros libro) {
        this.libro = libro;
    }

    /**
     * Obtiene la fecha en la que se realizó el préstamo.
     * @return Fecha de préstamo
     */


    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * Establece la fecha en la que se realizó el préstamo.
     * @param fechaPrestamo Nueva fecha de préstamo
     */


    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * Obtiene la fecha en la que se debe devolver el libro.
     * @return Fecha de devolución
     */


    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Establece la fecha de devolución del préstamo.
     * @param fechaDevolucion Nueva fecha de devolución
     */


    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

     /**
     * Verifica si el libro ha sido devuelto.
     * @return true si el libro ha sido devuelto, false en caso contrario
     */


    public boolean isDevuelto() {
        return devuelto;
    }
    /**
     * Cambia el estado del préstamo (devuelto o no).
     * @param devuelto Nuevo estado del préstamo
     */


    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }
    
    /**
     * Devuelve una representación en cadena del préstamo.
     * @return Cadena con la información del préstamo
     */


    @Override
    public String toString() {
        return "Prestamos [usuario=" + usuario + ", libro=" + libro + ", fechaPrestamo=" + fechaPrestamo
                + ", fechaDevolucion=" + fechaDevolucion + ", devuelto=" + devuelto + "]";
    }

}
  
