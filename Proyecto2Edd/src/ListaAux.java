/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class ListaAux {
    
    NodoListaAux Inicio;
    NodoListaAux Final;

    public ListaAux() {
        Inicio=null;
        Final=null;
    }

    public ListaAux(NodoListaAux Inicio, NodoListaAux Final) {
        this.Inicio = null;
        this.Final = null;
    }
    
        void Agregar (int Isbn, String Titulo , String Autor, String Editorial, String anio,String Edicion, String Categoria,String Idioma){
        
        NodoListaAux aux= new NodoListaAux();
       aux.setIsbn(Isbn);
        aux.setAnio(anio);
     aux.setAutor(Autor);
     aux.setCategoria(Categoria);
     aux.setEdicion(Edicion);
     aux.setEditorial(Editorial);
     aux.setIdioma(Idioma);

     aux.setNombre(Autor);
     aux.setTitulo(Titulo);

        if (Inicio==null) {
            
            Inicio= aux;
            Inicio.sig=null;
            Inicio.ant=null;
            Final=Inicio;
            
        }
        else    
        {
            Final.sig=aux;
            aux.ant=Final;
            aux.sig=null;
            Final=aux;
        }
        
        
        
    }
        
       NodoListaAux Buscar(int isbn){
              NodoListaAux aux= Inicio;
              while (aux!=null){
                  if (isbn==aux.getIsbn()) {
                   return aux;
                  }
                  
                  aux=aux.sig;
        }
              return aux;
        }
       
       
     boolean BuscarCategoria(String isbn){
              NodoListaAux aux= Inicio;
           boolean a= false;
              while (aux!=null){
                  if (isbn.equals(aux.getCategoria())) {
                  a=true;
                  }
                  
                  aux=aux.sig;
        }
              return a;
        }
void ver(){
    
    NodoListaAux aux= Inicio;
    while  (aux!=null){
        
        System.out.println(aux.getIsbn());
        aux= aux.sig;
    }
    
}
      void EliminarIsbn(int isbn){
              NodoListaAux aux= Inicio;
              while (aux!=null){
                  if (isbn==aux.getIsbn()) {
             
                    
                if (Inicio==aux) {
                                System.out.println("encontrado1");              
                    Inicio=aux.sig;
                   

                }
                else if (aux.sig==null) {
                                System.out.println("encontrado2");              
                    
              Final    = aux.ant;
                    
                    
                }
                else if (aux.sig!=null){            System.out.println("encontrado3");              
                    
                    aux.sig.ant=aux.ant;
                    aux.ant.sig=aux.sig;
                }
                      
                      
                  }
                  
                  aux=aux.sig;
        }
           
        }
      
           void EliminarNombre(String Nombre){
              NodoListaAux aux= Inicio;
              while (aux!=null){
                  if (Nombre.equals(aux.getTitulo())) {
             
                             System.out.println("encontrado");
                
                  
                if (Inicio==aux) {
                                System.out.println("encontrado1");              
                    Inicio=aux.sig;
                   

                }
                else if (aux.sig==null) {
                                System.out.println("encontrado2");              
                    
              Final    = aux.ant;
                    
                    
                }
                else{            System.out.println("encontrado3");              
                    
                    aux.sig.ant=aux.ant;
                    aux.ant.sig=aux.sig;
                }
                         
                      
                  }
                  
                  aux=aux.sig;
        }
           
        }
      
      
}
