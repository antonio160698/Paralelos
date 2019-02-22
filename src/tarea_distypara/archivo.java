/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_distypara;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 *
 * @author anton_000
 */
public class archivo {
    public void archivo(BigInteger res) throws FileNotFoundException, IOException{
        String rute = "resultado.txt";
        File file = new File(rute);
        FileOutputStream fos = new FileOutputStream(file);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter fw = new PrintWriter(file);
            bw.write(res.toString());
            bw.close();
            
    }
}
