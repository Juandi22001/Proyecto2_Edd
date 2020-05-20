
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class NodoHash  implements  Serializable {

    //hola
public NodoHash siguiente;
    private int carne;
    private String Nombre;
    private String Apellido;
    private String Carrera;
    private String Password;

    public NodoHash() {
        siguiente=null;
    }

    public NodoHash(int carne, String Nombre, String Apellido, String Carrera, String Password) {
        this.carne = carne;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Carrera = Carrera;
        this.Password = Password;
    }

    /**
     * @return the carne
     */
    public int getCarne() {
        return carne;
    }

    /**
     * @param carne the carne to set
     */
    public void setCarne(int carne) {
        this.carne = carne;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Carrera
     */
    public String getCarrera() {
        return Carrera;
    }

    /**
     * @param Carrera the Carrera to set
     */
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the siguiente
     */
    public NodoHash getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoHash siguiente) {
        this.siguiente = siguiente;
    }

}
