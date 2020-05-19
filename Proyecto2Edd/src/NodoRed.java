/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class NodoRed {
    private String Ip;
 public NodoRed sig;
    public NodoRed() {
    }

    public NodoRed(String Ip) {
        this.Ip = Ip;
    }

    /**
     * @return the Ip
     */
    public String getIp() {
        return Ip;
    }

    /**
     * @param Ip the Ip to set
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }
    
}
