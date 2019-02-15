package tarea_distypara;

import java.math.BigInteger;
import java.util.Scanner;

public class Tarea_distypara {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        escribir e = new escribir();
        guardar g = new guardar();
        g.setAntFa(BigInteger.valueOf(1));
        g.setFa(BigInteger.valueOf(1));
        e.escritor_objectos(g);
        System.out.println("Inserta");
        int num = sc.nextInt();
        long a = System.currentTimeMillis();
        Hilo h1 = new Hilo(1, ((num-2)/2));
        Hilo h2 = new Hilo(((num-2)/2), num+1);
        h1.run();
        h2.run();
        g =(guardar)e.lector_objetos("datos.dat");
        /*BigInteger fac = BigInteger.valueOf(1);
        for(long i = 2; i <= num; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }*/
        long b = System.currentTimeMillis();
        //System.out.println(fac);
        System.out.println(g.getAntFa());
        System.out.println(b-a);
    }
    
}
