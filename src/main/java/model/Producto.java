/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nina
 */
public class Producto {   
    private int codigo;
    private String nombre; 
    private double precio;
    private int stock;
    
    
    //Métodos constructores
    /**
     * Constructor por defecto
     */
    public Producto(){
        this.codigo=0;
        this.nombre=null;
        this.precio=0.0;
        this.stock=0;
    }
    /**
     * Constructor con parámetros.
     
     * @param cod
     * @param nom
     * @param precio
     * @param stock 
     */
    public Producto(int cod, String nom,double precio, int stock){
        this.codigo=cod;
        this.nombre=nom;
        this.precio=precio;
        this.stock=stock;
    }
    
    /**
     * Constructor que recibe un objeto Producto con valores
     * separados por comas:  "codigo,nombre,precio,stock"
     * @param producto 
     */
    public Producto(String producto){
        String[] datos= producto.split(",");
        this.codigo=Integer.parseInt(datos[0]);
        this.nombre=datos[1];
        this.precio=Double.parseDouble(datos[2]);
        this.stock=Integer.parseInt(datos[3]);
    }  
    
    /**
     * Constructor de copia
     * @param producto 
     */
    public Producto(Producto producto){
        this.codigo=producto.codigo;
        this.nombre=producto.nombre;
        this.precio=producto.precio;
        this.stock=producto.stock;
    }
    
    //Métodos Getters
    /**
     * 
     * @return código del producto
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * 
     * @return Nombre del Producto
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return precio del producto
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * 
     * @return Unidades en stock del producto
     */
    public int getStock() {
        return stock;
    }
    
    //Métodos Setters
    /**     
     * Asigna código de producto 
     * @param codigo 
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Asigna nombre del producto
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Asigna precio del producto
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Asigna stock del producto
     * @param stock 
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    //Método toString

    /**
     *
     * @return String que representa al objeto separados por comas.
     */
    @Override
    public String toString(){
        StringBuilder s= new StringBuilder();
        s.append(this.codigo);
        s.append(";");
        s.append(this.nombre);
        s.append(";");
        s.append(this.precio);
        s.append(";");
        s.append(this.stock); 
                
        return s.toString();
    }
    
    public String mostrarInfo(){
        StringBuilder s= new StringBuilder();
        s.append("CÓDIGO: ");        
        s.append(this.codigo);
        s.append(" - ");
        s.append("NOMBRE: ");  
        s.append(this.nombre);
        s.append(" - ");
        s.append("PRECIO: ");  
        s.append(this.precio);
        s.append(" - ");
        s.append("UNIDADES: ");  
        s.append(this.stock); 
                
        return s.toString();
    } 
    //Métodos propios de la clase   
    /**
     * Venbde (disminuye del stock) unidades del producto
     * @param unidades 
     */
    public void vender(int unidades){
        this.stock-=unidades;  
    }
    
    /**
     * Compra unidades de productos aumentando el Stock
     * @param unidades 
     */
    public void abastecerse(int unidades){
        this.stock+=unidades;       
    }
    /**
     * 
     * @param unidades
     * @return boolean:  true si stock >= unidades consultadas
     */
    public boolean hayStock(int unidades){
        return (this.stock >= unidades);
    }


}
