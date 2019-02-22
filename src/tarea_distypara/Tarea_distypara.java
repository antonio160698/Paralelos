package tarea_distypara;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tarea_distypara {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        escribir e = new escribir();
        guardar g = new guardar();
        archivo arch = new archivo();
        g.setAntFa(BigInteger.valueOf(1));
        g.setFa(BigInteger.valueOf(1));
        e.escritor_objectos(g);
        System.out.println("Inserta cuantos hilos se usaran");
        int num = 5000;
        int hilos = sc.nextInt();
        long a = System.currentTimeMillis();
        Hilo h1 = new Hilo(1, (num)/hilos);
        h1.run();
        //System.out.println("desde "+ 1 +"hasta "+(num/hilos));
        for(int i=1; i<hilos; i++){
            //System.out.println("desde "+(((num)*(i))/(hilos))+"hasta "+(((i+1)*(num))/hilos));
            Hilo h2 = new Hilo((((num)*(i))/(hilos)), (((i+1)*(num))/hilos));
            h2.run();
        }
        /*Hilo h1 = new Hilo(1, ((num-2)/2));
        Hilo h2 = new Hilo(((num-2)/2), num+1);
        h1.run();
        h2.run();*/
        g =(guardar)e.lector_objetos("datos.dat");
        /*BigInteger fac = BigInteger.valueOf(1);
        for(long i = 2; i <= num; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }*/
        long b = System.currentTimeMillis();
        //System.out.println(fac);
        BigInteger ultnum = BigInteger.valueOf(num);
        System.out.println(ultnum.multiply(g.getAntFa()));
        ultnum = (ultnum.multiply(g.getAntFa()));
        arch.archivo(ultnum);
        System.out.println(b-a);
    }
    
}
