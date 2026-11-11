/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionimportadora;

import data.CargarCorreos;
import data.CargarProductos;
import data.CargarProveedores;
import java.time.LocalDate;
import java.util.Scanner;
import model.Correo;
import model.Importadora;
import model.Producto;
import model.Proveedor;

/**
 *
 * @author nina
 */
public class GestionImportadora {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        Importadora imp= new Importadora ("Los Pinos SPA");
        CargarCorreos.cargar(imp, "src/main/java/resource/correos.txt");
        CargarProveedores.cargar(imp, "src/main/java/resource/proveedores.txt");
        CargarProductos.cargar(imp, "src/main/java/resource/productos.txt");
        
        System.out.println(imp.mostrarInfo());
        
        //Agregar nuevos datos a las colecciones
        Correo mail= new Correo("yo@mail.com",LocalDate.now(),"Proceso de importación N°12.345, terminado exitosamente");
        Proveedor prov=new Proveedor("K67899","Solares Inc. Co.","México", "(+52)33 1234 1234", "contacto@mail.com");
        Producto prod= new Producto(534455,"Motor 340VT",440000.0,30);
        
        
        imp.agregar(mail);
        imp.agregar(prov);
        imp.agregar("534455", prod);
        
        System.out.println(imp.mostrarInfo());
        
        //Búsquedas
        System.out.print("Ingrese código de Producto a buscar: ");
        //String cod= sc.nextLine();
        
        String clave= "534455";
        Producto p= imp.buscarProducto(clave);
        System.out.println("\nProducto clave: :"+ clave + "->" + p.mostrarInfo());
        
        clave="556644";
        p= imp.buscarProducto(clave);
        if (p!= null){
            System.out.println("\nProducto clave: " + clave +" -> "+p.mostrarInfo());
        }
        else{
            System.out.println("\nProducto clave: "+ clave+ "  no registrado");
        }

        if(p.hayStock(10)){
            p.vender(10);
            System.out.println("Producto clve: "+ clave + " vendido 10 unidades");
            System.out.println(imp.mostrarInfo());
        }
        else{
            System.out.println("En stock quedan: "+ p.getStock());
        }
        
        System.out.println("""
                           Correos de: kevinLara@todocompras.com
                           """+imp.buscarCorreos("kevinLara@todocompras.com"));
    }
}
