
import java.io.Serializable;
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class Hash  implements  Serializable{

    public NodoHash[] arreglo;
    int size, alv;
public Hash(){
    
    
}
    public Hash(int tam) {

        this.size = tam;
        arreglo = new NodoHash[tam];

    }

    void functionHash(int carne, String Nombre, String Apellido, String password, String Carrera, NodoHash[] Nodos) {
        ListaHash Lista = new ListaHash();
       
        NodoHash Fin=null;
        Lista.Agregar(carne, Nombre, Apellido, password, Carrera);
        int indice = carne % 45;
        System.out.println("el indice es" + indice);

        if (Nodos[indice] != null) {
 NodoHash Inicio=Nodos[indice];
 NodoHash Final=Nodos[indice];
            
 System.out.println("colision");
            if (Inicio.siguiente == null) {
               
           
                System.out.println("agregando");
          Inicio.siguiente=Nodos[indice].siguiente;
               Nodos[indice].siguiente = Lista.Inicio;
                   Inicio=Nodos[indice].siguiente;
              Inicio = Lista.Inicio;
                
            }    
            
            else if (Inicio.siguiente.siguiente==null) {
               
         Inicio.siguiente.siguiente=Lista.Inicio;
                
                System.out.println("siuuuu");
            }
               else if (Inicio.siguiente.siguiente.siguiente==null) {
               
         Inicio.siguiente.siguiente.siguiente=Lista.Inicio;
                
                System.out.println("siuuuu");
            }
            
             else if (Inicio.siguiente.siguiente.siguiente.siguiente==null) {
               
         Inicio.siguiente.siguiente.siguiente.siguiente=Lista.Inicio;
                
                System.out.println("siuuuu");
            }
              else if (Inicio.siguiente.siguiente.siguiente.siguiente.siguiente==null) {
               
         Inicio.siguiente.siguiente.siguiente.siguiente.siguiente=Lista.Inicio;
                
                System.out.println("siuuuu");
            }
                          else if (Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente==null) {
               
         Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente=Lista.Inicio;
                
                System.out.println("siuuuu");
            }
                          else if (Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente==null) {
               
         Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente=Lista.Inicio;
                
                System.out.println("siuuuu");
            }
            
                          else if (Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente==null) {
               
         Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente=Lista.Inicio;
                
                System.out.println("siuuuu");
            }
            
                          else if (Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente==null) {
               
         Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente=Lista.Inicio;
                
                System.out.println("siuuuu");
            }
            
                          else if (Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente==null) {
               
         Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente=Lista.Inicio;
                
                System.out.println("siuuuu");
            }            
            
            
                          else if (Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente==null) {
                           
            
         Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente=Lista.Inicio;
                
                System.out.println("siuuuu");
            }

            
                          else if (Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente==null) {
                           
            
         Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente=Lista.Inicio;
                
                System.out.println("siuuuu");
            }

                          else if (Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente==null) {
                           
            
         Inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente=Lista.Inicio;
                
                System.out.println("siuuuu");
            }
            
            
            
            
            
            
            

        } else {
            Nodos[indice] = Lista.Inicio;
        }

    }

    String Mostrar() {
        String grafo = "";

        grafo += "digraph G{ \n"
                + "\n"
                + "		   subgraph cluster_0 { \n"
                + "			color = 	azure2;\n"
                + "	node[shape=Msquare  color = darkslategray text=white gradientangle=90];\n";

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] != null) {
                       
                grafo += "Nodo" + arreglo[i].hashCode() + "[label = \"  " + arreglo[i].getNombre() + "-" + arreglo[i].getCarne() + "\"" + "];"
                        + "\n";
                if (arreglo[i].siguiente != null) {
                    while (arreglo[i] != null) {
           
                        grafo += "Nodo" + arreglo[i].hashCode() + "[label = \"  " + arreglo[i].getNombre() + "-" + arreglo[i].getCarne() + "\"" + "];"
                                + "\n";
                        if (arreglo[i].siguiente != null) {       
                            grafo += "Nodo" + arreglo[i].hashCode() + "->";
                            grafo += "Nodo" + arreglo[i].siguiente.hashCode() + "\n";
                        }
                        arreglo[i] = arreglo[i].siguiente;
                    }

                }

            }

        }

        grafo += "}";

        grafo += "}";
        System.out.println("grafo---------------------------" + grafo);
        return grafo;

    }

    boolean Buscar(String alv, String alv2) {
        boolean a = false;
        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] != null) {

                if (arreglo[i].getNombre().equals(alv) && arreglo[i].getPassword().equals(alv2)) {
  
            System.out.println("siuuuuuuuuuuuuuuuuuuuuu");     return true;
                }
                else  if (arreglo[i].siguiente != null) {
                    while (arreglo[i] != null) {

                        if (arreglo[i].getNombre().equals(alv) && arreglo[i].getPassword().equals(alv2)) {
                       }
                    }
                    arreglo[i] = arreglo[i].siguiente;

                }

            }

        }

        return a;
    }
    
    
    
    
    
    
    
void Eliminar (String alv) {
        boolean a = false;
        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] != null) {

                if (arreglo[i].getNombre().equals(alv) ) {
  
                  arreglo[i]=null;
                }
                else  if (arreglo[i].siguiente != null) {
                    while (arreglo[i] != null) {

                        if (arreglo[i].getNombre().equals(alv) ) {
                       
                           arreglo[i].siguiente=null;
                            
                          
                            
                        
                        }
                    }
                    arreglo[i] = arreglo[i].siguiente;

                }

            }

        }

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  void Editar(String alv) {
        boolean a = false;
        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] != null) {

                if (arreglo[i].getNombre().equals(alv) ) {
                   
                        int EditarNombre = JOptionPane.showConfirmDialog(null, "Desea Editar su nombre del usuario: [" + arreglo[i].getNombre() + "]del estudiante con  carne: " + arreglo[i].getCarne(), "Editar Nombre", JOptionPane.YES_NO_OPTION);
                    if (EditarNombre == JOptionPane.YES_OPTION) {
                        String NuevoNombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente", "-");
                        arreglo[i].setNombre(NuevoNombre);
                    }
                    
                      int EditarApellido = JOptionPane.showConfirmDialog(null, "Desea Editar el apellido del estudiante: [" +arreglo[i].getApellido()+ "]del estudiante con  carne: " + arreglo[i].getCarne(), "Editar Apellido", JOptionPane.YES_NO_OPTION);
                    if (EditarApellido == JOptionPane.YES_OPTION) {
                        String NuevoApellido = JOptionPane.showInputDialog("Ingrese el Apellido del cliente","-");
                   arreglo[i].setApellido(NuevoApellido);
                    }
                    
                    
                      int EditarCarrera = JOptionPane.showConfirmDialog(null, "Desea Editar la carrera del estudiante: [" +arreglo[i].getCarrera()+ "]del estudiante con  carne: " + arreglo[i].getCarne(), "Editar Carrera", JOptionPane.YES_NO_OPTION);
                    if (EditarCarrera == JOptionPane.YES_OPTION) {
                        String NuevoApellido = JOptionPane.showInputDialog("Ingrese la nueva carrera del cliente","-");
                   arreglo[i].setCarrera(NuevoApellido);
                    }
                         
                      int EditarCarne = JOptionPane.showConfirmDialog(null, "Desea Editar el carne del estudiante: [" +arreglo[i].getNombre()+ "]del estudiante con  carne: " + arreglo[i].getCarne(), "Editar Carne", JOptionPane.YES_NO_OPTION);
                    if (EditarCarne == JOptionPane.YES_OPTION) {
                        String NuevoApellido = JOptionPane.showInputDialog("Ingrese el nuevo carne","-");
                   arreglo[i].setCarne(Integer.parseInt(NuevoApellido));
                    }
                    
                    
                    Mostrar();
                }
                else  if (arreglo[i].siguiente != null) {
                    while (arreglo[i] != null) {

                        if (arreglo[i].getNombre().equals(alv) ) {
                         
                            
                               int EditarNombre = JOptionPane.showConfirmDialog(null, "Desea Editar su nombre del usuario: [" + arreglo[i].getNombre() + "]del estudiante con  carne: " + arreglo[i].getCarne(), "Editar Nombre", JOptionPane.YES_NO_OPTION);
                    if (EditarNombre == JOptionPane.YES_OPTION) {
                        String NuevoNombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente", "-");
                        arreglo[i].setNombre(NuevoNombre);
                    }
                    
                      int EditarApellido = JOptionPane.showConfirmDialog(null, "Desea Editar el apellido del estudiante: [" +arreglo[i].getApellido()+ "]del estudiante con  carne: " + arreglo[i].getCarne(), "Editar Apellido", JOptionPane.YES_NO_OPTION);
                    if (EditarApellido == JOptionPane.YES_OPTION) {
                        String NuevoApellido = JOptionPane.showInputDialog("Ingrese el Apellido del cliente","-");
                   arreglo[i].setApellido(NuevoApellido);
                    }
                    
                    
                      int EditarCarrera = JOptionPane.showConfirmDialog(null, "Desea Editar la carrera del estudiante: [" +arreglo[i].getCarrera()+ "]del estudiante con  carne: " + arreglo[i].getCarne(), "Editar Carrera", JOptionPane.YES_NO_OPTION);
                    if (EditarCarrera == JOptionPane.YES_OPTION) {
                        String NuevoApellido = JOptionPane.showInputDialog("Ingrese la nueva carrera del cliente","-");
                   arreglo[i].setCarrera(NuevoApellido);
                    }
                         
                      int EditarCarne = JOptionPane.showConfirmDialog(null, "Desea Editar el carne del estudiante: [" +arreglo[i].getNombre()+ "]del estudiante con  carne: " + arreglo[i].getCarne(), "Editar Carne", JOptionPane.YES_NO_OPTION);
                    if (EditarCarne == JOptionPane.YES_OPTION) {
                        String NuevoApellido = JOptionPane.showInputDialog("Ingrese el nuevo carne","-");
                   arreglo[i].setCarne(Integer.parseInt(NuevoApellido));
                    }
                    
                    
                    Mostrar();

                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                        }
                    }
                    arreglo[i] = arreglo[i].siguiente;

                }

            }

        }

    }
}
