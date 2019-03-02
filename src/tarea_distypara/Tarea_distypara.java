package tarea_distypara;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Tarea_distypara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        escribir e = new escribir();
        guardar g = new guardar();
        archivo arch = new archivo();
        g.setAntFa(BigInteger.valueOf(1));
        g.setFa(BigInteger.valueOf(1));
        e.escritor_objectos(g);
        System.out.println("Inserta cuantos hilos se usaran");
        int num = 3000;
        ArrayList arregloTiempo = new ArrayList();
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        JFrame f = new JFrame();
        ArrayList arregloHilo = new ArrayList();
        //int hilos = sc.nextInt();
        /*long a = System.currentTimeMillis();
        
        Hilo h1 = new Hilo(1, (num)/hilos);
        h1.run();
        h1.join();
        long b = System.currentTimeMillis();
        System.out.println(b-a);*/
        //System.out.println("desde "+ 1 +"hasta "+(num/hilos));
        try {
            for (int hilo = 0; hilo <= 10 ; hilo++) {
                long c = System.currentTimeMillis();
                for (int i = 0; i <hilo; i++) {
                    //System.out.println("desde "+(((num)*(i))/(hilos))+"hasta "+(((i+1)*(num))/hilos));
                    Hilo h2 = new Hilo((((num) * (i)) / (hilo)), (((i + 1) * (num)) / hilo));
                    h2.run();
                    h2.join();

                }
                long d = System.currentTimeMillis();
                arregloTiempo.add(hilo,(d-c));
                //System.out.println("Hilo: " + hilo + " Tiempo: " + (d - c));
            }
            for (int i = 0; i < arregloTiempo.size(); i++) {
                dcd.addValue((Number) arregloTiempo.get(i), "Hilo", String.valueOf(i));
            }
            JFreeChart chart = ChartFactory.createStackedAreaChart("Hilo/Tiempo", "Hilo", "Tiempo", dcd, PlotOrientation.VERTICAL, true, true, true);
            ChartPanel pan = new ChartPanel(chart);
            f.add(pan);
            f.setBounds(100, 100, 200, 200);
            f.setVisible(true);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        /*Hilo h1 = new Hilo(1, ((num-2)/2));
        Hilo h2 = new Hilo(((num-2)/2), num+1);
        h1.run();
        h2.run();*/
        g = (guardar) e.lector_objetos("datos.dat");
        /*BigInteger fac = BigInteger.valueOf(1);
        for(long i = 2; i <= num; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }*/

        //System.out.println(fac);
        BigInteger ultnum = BigInteger.valueOf(num);
        System.out.println(ultnum.multiply(g.getAntFa()));
        ultnum = (ultnum.multiply(g.getAntFa()));
        for (int i = 1; i <= 25; i++) {
            System.out.println("Hilo: "+i+" Tiempo: "+arregloTiempo.get(i));
        }
        
        try {
            arch.archivo(ultnum);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
