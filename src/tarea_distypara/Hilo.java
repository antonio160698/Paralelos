/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_distypara;

import java.math.BigInteger;

/**
 *
 * @author anton_000
 */
public class Hilo extends Thread{
    int desde;
    int hasta;
    public Hilo(int desde,int hasta){
        this.desde = desde;
        this.hasta = hasta;
    }
    @Override
    public void run(){
        guardar g = new guardar();
        escribir s = new escribir();
        g = (guardar)s.lector_objetos("datos.dat");
        multiplicar m = new multiplicar();
        BigInteger fac = BigInteger.valueOf(1);
        for (int i = desde; i < hasta; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        g.setFa(fac);
        BigInteger temp = g.getAntFa();
        g.setAntFa(temp);
        s.escritor_objectos(g);
        m.multiplicar();
    }
}
