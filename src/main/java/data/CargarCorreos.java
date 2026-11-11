/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.Importadora;
import model.Correo;

/**
 *
 * @author nina
 */
public class CargarCorreos {
    
     public static void cargar(Importadora imp,String arch){
        FileReader fr;
        BufferedReader br;
        
        try{
            fr= new FileReader(arch);
            br= new BufferedReader(fr);
            String linea= br.readLine();
            while(linea!=null){
                imp.agregar(new Correo(linea));
                linea= br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
      
    }
}
