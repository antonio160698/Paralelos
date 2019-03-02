/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_distypara;

import java.io.Serializable;
import java.math.BigInteger;

/**
 *
 * @author anton_000
 */
public class guardar implements Serializable{
    private BigInteger fa;
    private BigInteger antfa; 
    public guardar(BigInteger fa){
        this.fa = fa;
    }
    public BigInteger getFa(){
        return fa;
    }
    public void setFa(BigInteger fa){
        this.fa = fa;
    }
    public BigInteger getAntFa(){
        return antfa;
    }
    public void setAntFa(BigInteger antfa){
        this.antfa = antfa;
    }
    public guardar(){
        
    }
}
