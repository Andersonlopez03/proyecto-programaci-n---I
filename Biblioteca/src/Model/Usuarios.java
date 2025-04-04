package Model;


/**
 * Representa un usuario dentro del sistema de la biblioteca.
 * Cada usuario tiene un nombre, una cédula y un tipo de usuario
 * que puede ser estudiante, profesor o ciudadano.
 */


public class Usuarios {
      /** Nombre del usuario */
    private String nombre;
      /** Cedula del usuario */
    private String Cedula;
      /** Tipo de usuario(ESTUDIANTE, PROFESOR, CIUDADANO) */
    private TipoDeUsuario tipoDeUsuario;



     /**
     * Constructor vacío para la clase Usuarios.
     */
    public Usuarios() {
    }

        /**
     * Constructor con parámetros para inicializar un usuario.
     * @param nombre Nombre del usuario
     * @param cedula Cédula del usuario
     * @param tipoDeUsuario Tipo de usuario (ESTUDIANTE, PROFESOR, CIUDADANO)
     */



    public Usuarios(String nombre, String cedula, TipoDeUsuario tipoDeUsuario) {
        this.nombre = nombre;
        Cedula = cedula;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    /**
     * Obtiene el nombre del usuario.
     * @return Nombre del usuario
     */

    public String getNombre() {
        return nombre;
    }
     /**
     * Establece el nombre del usuario.
     * @param nombre Nuevo nombre del usuario
     */


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene la cédula del usuario.
     * @return Cédula del usuario
     */


    public String getCedula() {
        return Cedula;
    }

    /**
     * Establece la cédula del usuario.
     * @param cedula Nueva cédula del usuario
     */


    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    /**
     * Obtiene el tipo de usuario.
     * @return Tipo de usuario (ESTUDIANTE, PROFESOR, CIUDADANO)
     */


    public TipoDeUsuario getTipoDeUsuario() {
        return tipoDeUsuario;
    }
    /**
     * Establece el tipo de usuario.
     * @param tipoDeUsuario Nuevo tipo de usuario
     */


    public void setTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
    
     /**
     * Devuelve una representación en cadena del usuario.
     * @return Cadena con la información del usuario
     */


    @Override
    public String toString() {
        return "Usuarios [nombre=" + nombre + ", Cedula=" + Cedula + ", tipoDeUsuario=" + tipoDeUsuario + "]";
    }   
}
