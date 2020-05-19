/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**     
 *
 * @author JUAN DIEGO ALVARADO
 */
//456

public class ListaHash {
    NodoHash Inicio;
    NodoHash Fin;
    /*h*/
    
public ListaHash() {
        Inicio = null;
        Fin=null;
    }
    
public void Agregar(int carne,String Nombre,String Apellido,String password, String Carrera){
   NodoHash Hash = new NodoHash();
   Hash.setCarne(carne);
   Hash.setCarrera(Carrera);
   Hash.setNombre(Nombre);
   Hash.setPassword(password);
   Hash.setApellido(Apellido);
 if (Inicio == null) {
       Inicio =Hash;
            
        } else {
           Fin.setSiguiente(Hash);
            Fin = Hash;
        }

}

  
}

