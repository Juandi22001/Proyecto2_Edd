/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN DIEGO ALVARADO
 */


public class LlaveEntero extends Ordenable {

    private Integer mLlave = null;

    public LlaveEntero(int pValor) {
        mLlave = new Integer(pValor);
    }

    public LlaveEntero(Integer pValor) {
        mLlave = pValor;
    }

    public Object getKey() {
        return mLlave;
    }
    
    public boolean igualA(Ordenable pObjeto) {
        return mLlave.equals(pObjeto.getKey());
    }

    public boolean menorQue(Ordenable pObjeto) {
        return mLlave.compareTo((Integer)pObjeto.getKey()) < 0;
    }
    
    public boolean mayorQue(Ordenable pObjeto) {
        return mLlave.compareTo((Integer)pObjeto.getKey()) > 0;
    }
    
    public boolean menorOIgualQue(Ordenable pObjeto) {
        return mLlave.compareTo((Integer)pObjeto.getKey()) <= 0;
    }
  
    public boolean mayorOIgualQue(Ordenable pObjeto) {
        return mLlave.compareTo((Integer)pObjeto.getKey()) >= 0;
    }
    
    public Ordenable minKey() {
        return new LlaveEntero(Integer.MIN_VALUE);
    }

}

