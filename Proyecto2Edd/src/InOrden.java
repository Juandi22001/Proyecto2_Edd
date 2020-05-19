
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
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
public class InOrden {
NodoInorden Inicio;
NodoInorden Final;
String dot;
    public InOrden() {
    
    this.Inicio = null;
        this.Final = null;
    }

    public InOrden(NodoInorden Inicio, NodoInorden Final) {
        this.Inicio = null;
        this.Final = null;
    }
    
    void Agregar(String N){
        
    NodoInorden alv= new NodoInorden( N);
        
        alv.setNombre(N);
        
        if (Inicio==null) {
            
        Final=alv;
            
         Inicio=alv;
            
        }else{
            
            Final.sig=alv;
            Final=alv;
            
            alv.sig=null;
            
        }
  
        
    }
              void Grafo(){
          NodoInorden alv= Inicio;
                   dot = "digraph G{ \n"
                + "\n"
                + "		   subgraph cluster_0 { \n"
                + "			color = 	azure2;\n"
                + "	node[shape=Msquare  color = darkslategray text=white gradientangle=90];\n";

                  while (alv!=null) {
                           dot += "nodo" + alv.hashCode() + "[label = \"  " + alv.getNombre() + "\"" + "];";
                      if (alv.sig!=null) {
                                     dot += "nodo" + alv.hashCode() + "->";
                dot += "nodo" + alv.sig.hashCode() + "\n";

                          
                      }
                      
                      alv=alv.sig;
                  }
               dot += "}";
        dot += "}";
        System.out.println(dot);
        ToDotGenerator(dot);
              
              }
              
    

private void ToDotGenerator(String cadena) {

        File f;
        FileWriter wr;
        try {
            f = new File("TodotInOrden" + ".txt");
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
            pbuilder = new ProcessBuilder("dot", "-Tpng", "-o", "TodotInOrden" + ".png", "TodotInOrden" + ".txt");
            pbuilder.redirectErrorStream(true);
            pbuilder.start();
            JOptionPane.showMessageDialog(null, "reporte Generado con exitoooo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La imagen no se genero correctamente");
        }

        File miArchivo = new File("TodotInOrden" + ".png");
        try {
            Desktop.getDesktop().open(miArchivo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se encuentra la ruta de la imagen"
                    + "");
        }

    }
           
}
    

