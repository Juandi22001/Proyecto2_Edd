/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class NodoAvl {
public String key;
public NodoAvl right;
public ArbolB arbol = new ArbolB(2);
public NodoAvl left;
private String Usario;

public  int altura;
    public NodoAvl() {
    }

    public NodoAvl(String key ,String User ) {
        this.key = key;
      this.Usario=User;
        this.altura = 1;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the right
     */
    public NodoAvl getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(NodoAvl right) {
        this.right = right;
    }

    /**
     * @return the left
     */
    public NodoAvl getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(NodoAvl left) {
        this.left = left;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the Usario
     */
    public String getUsario() {
        return Usario;
    }

    /**
     * @param Usario the Usario to set
     */
    public void setUsario(String Usario) {
        this.Usario = Usario;
    }
    
}
