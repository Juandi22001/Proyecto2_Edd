
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Serializable;
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
public class Avl implements Serializable {

    NodoAvl Raiz;
    PosOrden a = new PosOrden();
    PreOrden a2 = new PreOrden();
    InOrden a3 = new InOrden();
    //devolver altura de cualquier nodo del arbol

    String dot;

    public Avl() {

    }

    int altura(NodoAvl alv) {
        if (alv == null) {
            return 0;
        } else {
            return alv.getAltura();

        }
    }

    int Mayor(int x, int x2) {
        return (x > x2) ? x : x2;
    }

    NodoAvl RootDer(NodoAvl alv) {
        NodoAvl aux = alv.left;
        NodoAvl aux2 = aux.right;

        aux.right = alv;
        alv.left = aux2;

        alv.altura = Mayor(altura(alv.left), altura(alv.right)) + 1;
        aux.altura = Mayor(altura(aux.left), altura(aux.right)) + 1;
        return aux;
    }

    NodoAvl RootIzq(NodoAvl alv) {
        NodoAvl aux = alv.right;
        NodoAvl aux2 = alv.left;

        alv.right = aux;
        aux.left = aux2;

        alv.altura = Mayor(altura(alv.left), altura(alv.right)) + 1;
        aux.altura = Mayor(altura(aux.left), altura(aux.right)) + 1;
        return aux;
    }

    int balance(NodoAvl alv) {
        if (alv == null) {
            return 0;

        }
        
        
        return altura(alv.left) - altura(alv.right);
    }

    void Insertar(String as ,String A) {

    Raiz=   Agregar(Raiz, as,A);
     
          
    }

    private void ToDotGenerator(String cadena) {

        File f;
        FileWriter wr;
        try {
            f = new File("TodotAvl" + ".txt");
            wr = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(wr);
            PrintWriter salida = new PrintWriter(bw);
            salida.write(cadena + "\n");
            salida.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " no es posible escribir");
        }
        try {
            ProcessBuilder pbuilder;
            pbuilder = new ProcessBuilder("dot", "-Tpng", "-o", "TodotAvl" + ".png", "TodotAvl" + ".txt");
            pbuilder.redirectErrorStream(true);
            pbuilder.start();
            JOptionPane.showMessageDialog(null, "reporte Generado con exitoooo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La imagen no se genero correctamente");
        }

        File miArchivo = new File("TodotAvl" + ".png");
        try {
            Desktop.getDesktop().open(miArchivo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se encuentra la ruta de la imagen"
                    + "");
        }

    }

    void Ver() {

NodoAvl alv= Raiz;
    PosOrden(alv);
        Preorden(alv);
        Inorden(alv);
        a.Grafo();
        a2.Grafo();
        a3.Grafo();
        Grafo(alv);
        ToDotGenerator(dot);

    }

    void Grafo(NodoAvl alv) {
        NodoAvl alv2 ;
        NodoAvl alv3;

        dot = "digraph G{ \n"
                + "\n"
                + "		   subgraph cluster_0 { \n"
                + "			color = 	azure2;\n"
                + "	node[shape=Msquare  color = darkslategray text=white gradientangle=90];\n";

        while (alv.left != null) {

        

                dot +=alv.getKey() + "->";
                dot += alv.left.getKey() + "\n";

                if (alv.right != null) {

                    alv2 = alv;
                    while (alv.right != null) {
                            
                                            
                                          dot +=   alv.getKey()+ "->";
                        dot +=   alv.right.getKey() + "\n";
                                            
                        alv = alv.right;
                    }

             alv=alv2;
            }

            alv = alv.left;
        }

        
        alv=Raiz;
        while (alv.right != null) {

           
                dot +=  alv.getKey() + "->";
                dot +=   alv.right.getKey() + "\n";

                if (alv.left != null) {
           
                    alv3 = alv;
                    while (alv.left != null) {
         
                        if (alv.left!=null) {
                            
                        dot += alv.getKey() + "->";
                        dot +=  alv.left.getKey() + "\n";

                        }
                        alv = alv.left;
                    }
alv=alv3;
                
            }

            alv = alv.right;
        }
        dot += "}";

        dot += "}";

    }

    void Preorden(NodoAvl alv) {

        if (alv != null) {
            a2.Agregar(alv.getKey());
            System.out.println(alv.key);
            Preorden(alv.left);
            Preorden(alv.right);
        }
    }

    void PosOrden(NodoAvl alv) {

        if (alv != null) {

            PosOrden(alv.left);
            PosOrden(alv.right);
            a.Agregar(alv.getKey());
            System.out.println(alv.getKey());

        }
    }

    void Inorden(NodoAvl alv) {

        if (alv != null) {

            Inorden(alv.left);
            
            a3.Agregar(alv.getKey());
          
            Inorden(alv.right);

        }
    }

    NodoAvl Agregar(NodoAvl alv, String dato, String A) {
        if (alv == null) {
            
          alv= new NodoAvl(dato,A);
        } else if (alv!=null) {
             String aux=alv.getKey();
            if (dato.compareTo(aux) < 0) {
                alv.left = Agregar(alv.left, dato,A);

            } else if (dato.compareTo(aux) > 0) {
                alv.right = Agregar(alv.right, dato,A);
            }
        
            return alv;
        }
 
            /**/
 
            
            alv.altura = 1 + Mayor(altura(alv.left), altura(alv.right));
            int balanceo = balance(alv);
            if (balanceo > 1 && dato.compareTo(alv.getKey()) < 0) {
                return RootDer(alv);
            } else if (balanceo < -1 && dato.compareTo(alv.getKey()) > 0) {
                return RootIzq(alv);

            } else if (balanceo > 1 && dato.compareTo(alv.getKey()) > 0) {
                alv.left = RootIzq(alv);
                return RootDer(alv);
            } else if (balanceo < -1 && dato.compareTo(alv.getKey()) < 0) {
                return RootIzq(alv);

            }

            return alv;
        
    }

    NodoAvl Min(NodoAvl alv) {

        NodoAvl aux = alv;

        while (aux.left != null) {
            aux = aux.left;

        }
        return alv;
    }
    
public NodoAvl Buscar(String aux){
      NodoAvl alv= Raiz;
      boolean a= false;
      
      while (!a && alv!=null) {
 
          if (aux.equals(alv.getKey())) {
              a=true;
                     System.out.println("siuu encontrado");
                     return alv;
          }
          else if (aux.compareTo(alv.getKey())<0) {
           
              System.out.println(alv.getKey());
              alv=alv.left;
          }else{
              
              System.out.println(alv.getKey());
              alv= alv.right;
          }
          
    }
      
      return  alv;
    }
    public boolean Buscars(String aux){
      NodoAvl alv= Raiz;
      boolean a= false;
      
      while (!a && alv!=null) {
 
          if (aux.equals(alv.getKey())) {
              a=true;
                     System.out.println("siuu encontrado");
                    
          }
          else if (aux.compareTo(alv.getKey())<0) {
           
              System.out.println(alv.getKey());
              alv=alv.left;
          }else{
              
              System.out.println(alv.getKey());
              alv= alv.right;
          }

          
    }
      
      return  a;
    }
    
     public boolean Buscars2(String aux , String aux2){
      NodoAvl alv= Raiz;
      boolean a= false;
      
      while (!a && alv!=null) {
 
          if (aux2.equals(alv.getUsario())) {
              a=true;
                     System.out.println("siuu encontrado");
                    
          }
          else if (aux.compareTo(alv.getKey())<0) {
           
              System.out.println(alv.getKey());
              alv=alv.left;
          }else{
              
              System.out.println(alv.getKey());
              alv= alv.right;
          }

          
    }
      
      return  a;
    }
void Eliminar(String alv){

    Raiz= Borrar(Raiz, alv);
    Preorden(Raiz);
}
    NodoAvl Borrar(NodoAvl alv, String key) {
        if (alv == null) {
            return alv;
        } else if (key.compareTo(alv.getKey()) < 0) {
         
            System.out.println("siuu2"+alv.getKey());
            alv.left = Borrar(alv.left,
                    key);
        } else if (key.compareTo(alv.getKey()) > 0) {
          
            
            System.out.println("siuu3"+alv.getKey());
            alv.right = Borrar(alv.right, key);
        } else { System.out.println("siuuu4");
            if (alv.left == null || alv.right == null) {
                NodoAvl aux = null;

                if (aux == alv.left) {
                    aux = alv.right;
                } else {
                    aux = alv.left;
                }

                if (aux == null) {
                    aux = alv;
                    alv = null;
                } else {
                    alv = aux;
                }
            } else {
                NodoAvl aux = Min(alv);
                alv.key = aux.key;
                alv.right = Borrar(alv.right, aux.getKey());
            }  }
        if (alv == null) {
            return alv;
        }
        alv.altura = Mayor(altura(alv.left), altura(alv.right)) + 1;
        int balance = balance(alv);
        if (balance > 1 && balance(alv.left) >= 0) {
            return RootDer(alv);
        } else if (balance > 1 && balance(alv.left) < 0) {
            alv.left = RootIzq(alv);
            return RootDer(alv);
        } else if (balance < -1 && balance(alv.right) > 0) {
            alv.right = RootDer(alv.right);
            return RootIzq(alv);
        }
        return alv;
    }

}
