/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class NodoListaAux {
    private int Isbn;
    private String Nombre;
    private String Categoria;
    private String Titulo;
    NodoListaAux sig;
    NodoListaAux ant;
    
    private String Autor;
    private String Editorial;
    private String Anio;
    private String Edicion;
    private String Idioma;
    private String Usuario;

    /**
     * @return the Isbn
     */

    public NodoListaAux(int Isbn, String Nombre, String Categoria, String Titulo, String Autor, String Editorial, String Anio, String Edicion, String Idioma, String Usuario) {
        this.Isbn = Isbn;
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Titulo = Titulo;
     
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.Anio = Anio;
        this.Edicion = Edicion;
        this.Idioma = Idioma;
        this.Usuario = Usuario;
    }

    public NodoListaAux() {
    }

    public int getIsbn() {
        return Isbn;
    }

    /**
     * @param Isbn the Isbn to set
     */
    public void setIsbn(int Isbn) {
        this.Isbn = Isbn;
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
     * @return the Categoria
     */
    public String getCategoria() {
        return Categoria;
    }

    /**
     * @param Categoria the Categoria to set
     */
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     * @return the Editorial
     */
    public String getEditorial() {
        return Editorial;
    }

    /**
     * @param Editorial the Editorial to set
     */
    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    /**
     * @return the Anio
     */
    public String getAnio() {
        return Anio;
    }

    /**
     * @param Anio the Anio to set
     */
    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

    /**
     * @return the Edicion
     */
    public String getEdicion() {
        return Edicion;
    }

    /**
     * @param Edicion the Edicion to set
     */
    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    /**
     * @return the Idioma
     */
    public String getIdioma() {
        return Idioma;
    }

    /**
     * @param Idioma the Idioma to set
     */
    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
}
