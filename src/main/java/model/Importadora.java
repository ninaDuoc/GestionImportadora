/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author nina
 */
public class Importadora {
    private String nombre;
    private List<Proveedor> proveedores;
    private Stack<Correo> mails;
    private Map<String, Producto> productos;
    

    public Importadora(){
        //Completar
    }
    public Importadora(String nombre){
        
        
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Proveedor> getProveedores() {
        return proveedores;
    }
    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    public Stack<Correo> getMails() {
        return mails;
    }
    public void setMails(Stack<Correo> mails) {
        this.mails = mails;
    }
    public Map<String, Producto> getProductos() {
        return productos;
    }
    public void setProductos(HashMap<String, Producto> productos) {
        this.productos = productos;
    }
    
    
    @Override
    public String toString(){
        return this.nombre;
    }   
    public String toStringProveedores(){
        return this.proveedores.toString();       
    }
    public String toStringCorreos(){
        return this.mails.toString();
    }
    public String toStringProductos(){
        return this.productos.toString();
    }
  
    public String mostrarInfo(){
        StringBuilder s= new StringBuilder();
        s.append("\n********************************\n");  
        s.append("     IMPORTADORA ");
        s.append(this.nombre);
        s.append("\n");
        s.append("*********************************\n");  
        s.append(this.mostrarProveedores());
        s.append(this.mostrarCorreos());
        s.append(this.mostrarProductos());
         
        return s.toString();
    }   
    public String mostrarProveedores(){
        StringBuilder s= new StringBuilder();
        s.append("\n********************************\n");  
        s.append("*       LISTA DE PROVEEDORES      *\n");
        s.append("*********************************\n");  
        //Completar
        

        return s.toString();
    }      
    public String mostrarCorreos(){
        StringBuilder s= new StringBuilder();
        s.append("\n********************************\n");  
        s.append("*       LISTA DE CORREOS      *\n");
        s.append("*********************************\n");  
         //Completar
         
        return s.toString();
    }    
    public String mostrarProductos(){
        StringBuilder s= new StringBuilder();
        s.append("\n********************************\n");  
        s.append("*       LISTA DE PRODUCTOS      *\n");
        s.append("*********************************\n");  
        
        //COMPLETAR RECORRIDO DEL HASHMAP
        
        s.append("************************************");
        return s.toString();
    }
    
    public void agregar(Proveedor p){
        // COMPLETAR...
    }
    public void agregar(Correo c){
        //COMPLETAR
    }
    public void agregar(String cod, Producto p){
       //COMPLETAR
    }
    
    public Proveedor buscarProveedor(String id){
       //COMPLETAR
       return null;
    }    
    public String buscarCorreos(String remitente){
       StringBuilder s= new StringBuilder();
       //COMPLETAR
       return s.toString();
    }   
    public Producto buscarProducto(String clave){
        //COMPLETAR
        return null;
    }
    
    public boolean eliminarUltimoCorreo(){
        return false;
    }
    public boolean eliminarProveedor(String id){
        return false;
    }
    public boolean eliminarProducto(String clave){
        return false;
    }
}
