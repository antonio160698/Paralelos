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
public class multiplicar {
    escribir e = new escribir();
    guardar g = new guardar();
    public void multiplicar(){
        g = (guardar)e.lector_objetos("datos.dat");
        BigInteger hola = g.getFa();
        BigInteger ant = g.getAntFa();
        if(ant==null){
            ant=BigInteger.valueOf(1);
        }
        try {
            ant = ant.multiply(hola);
            g.setAntFa(ant);
            e.escritor_objectos(g);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
