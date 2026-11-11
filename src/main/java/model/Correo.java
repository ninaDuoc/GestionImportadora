/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author nina
 */
public class Correo {
    private String remitente; //Formato mail
    private LocalDate fecha;
    private String glosa;  
    
    /**
     * Constructor por defecto explítito
     */
    public Correo(){
        this.remitente=null;
        this.fecha= null;
        this.glosa=null;
    }
    /**
     * Constructor con parámetros
     * @param remitente (String)
     * @param fecha (LocalDate)
     * @param glosa (String)
     */
    public Correo(String remitente, LocalDate fecha, String glosa){
        this.remitente=remitente;
        this.fecha= fecha;
        this.glosa=glosa;
    }
    /**
     * Constructor con parámetros. Fecha desglosada
     * @param remitente (String)
     * @param aa (int)
     * @param mm (int)
     * @param dd (int)
     * @param glosa (String)
     */
    public Correo(String remitente, int aa, int mm, int dd, String glosa){
        this.remitente=remitente;
        this.fecha= LocalDate.of(aa,mm,dd);
        this.glosa=glosa;
    }
    /**
     * Constructor con parámetros. Fecha como un String aaaa-mm-dd
     * @param remitente (String)
     * @param fecha (String) aaaa-mm-dd
     * @param glosa (String)
     */
    public Correo(String remitente, String fecha, String glosa){
        this.remitente=remitente;
        this.fecha= LocalDate.parse(fecha);
        this.glosa=glosa;
    }
    /**
     * Constructor con el objeto Correo como String con valores separados por 
     * Punto y coma (Ya que en la glosa puede venir comas)
     * La fecha viene como String: "aaaa-mm-dd"
     * "j.duarte@miCorreo.cl,2026-11-10,Agendar reunión para jueves a las 20:00"
     * @param correo 
     */
    public Correo(String correo){
        String[] datos= correo.split(";");       
        this.remitente=datos[0];    
        this.fecha= LocalDate.parse(datos[1]);
        this.glosa=datos[2];
    }
    /**
     * Constructor de copia
     * @param correo 
     */
    public Correo(Correo correo){
        this.remitente=correo.remitente;
        this.fecha= correo.fecha;
        this.glosa=correo.glosa;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getGlosa() {
        return glosa;
    }

    public void setGlosa(String glosa) {
        this.glosa = glosa;
    }
    
    public String toString(){
        return this.remitente+";"+
                this.fecha.toString()+";"+
                this.glosa;
        
    }
    
    public String mostrarInfo(){
        StringBuilder s= new StringBuilder();
        s.append("Remitente: ");
        s.append(this.remitente);
        s.append("\n");
        s.append("FECHA: ");
        s.append(this.fecha.toString());
        s.append("\n");
        s.append("Glosa: ");
        s.append(this.glosa);
        
        return s.toString();
    }
    
    
}
