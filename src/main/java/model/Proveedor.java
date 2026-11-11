/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 * Clase que HEREDA de la clase base Persona
 * Agrega usus atributos
 * 
 * 
 * @author nina
 */
public class Proveedor{
    private String  id;
    private String nombre;
    private String pais;
    private String fono;
    private String correo;
    
    /**
     * Constructor por defecto
     */
    public Proveedor(){
        this.id= null;
        this.nombre=null;
        this.pais= null;
        this.fono=null;
        this.correo=null;
    }
    
    /**
     * Constructor con parámetros 
     */
    public Proveedor(String id, String nom, String pais, String fono, String correo){
        this.id= id;
        this.nombre=nom;
        this.pais= pais;
        this.fono=fono;
        this.correo=correo;
    }
   
    /**
     * Constructor que recibe todos los datos del Proveedor como un String 
     * con sus valores separados por comas
     *id,nombre,pais,fono,correo
     * 
     * @param proveedor 
     */
    public Proveedor(String proveedor){       
        String[] datos= proveedor.split(",");
        this.id= datos[0];
        this.nombre=datos[1];
        this.pais= datos[2];
        this.fono=datos[3];
        this.correo=datos[4];
    }
    
    public Proveedor(Proveedor pr){
        this.id= pr.id;
        this.nombre=pr.nombre;
        this.pais= pr.pais;
        this.fono=pr.fono;
        this.correo=pr.correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    /**
     * 
     * @return (String) que representa al objeto con sus valores separados por coma
     */
    @Override
    public String toString(){
        return this.id+","
                + this.nombre+","
                + this.pais +","
                + this.fono + ","
                + this.correo;
    }
    
    public String mostrarInfo(){
        StringBuilder s= new StringBuilder();
        s.append("\n");
        s.append("ID Proveedor: ");
        s.append(this.id);
        s.append("\tNombre: ");
        s.append(this.nombre);
        s.append("\tPais: ");
        s.append(this.pais);
        s.append("\tCorreo: ");
        s.append(this.correo);
        return s.toString();
    }

    
}
