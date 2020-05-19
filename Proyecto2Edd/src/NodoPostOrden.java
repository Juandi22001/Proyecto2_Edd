/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class NodoPostOrden {
    private String Nombre;
    NodoPostOrden sig;

    public NodoPostOrden() {
    }

    public NodoPostOrden(String Nombre) {
        this.Nombre = Nombre;
   
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
   
}
