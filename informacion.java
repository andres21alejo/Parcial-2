/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialii;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class informacion {
    protected String Nombre;
    protected String Apellido;
    protected String Pais;
    protected String municipio;
    protected String departamento;
    protected String comunidad;
    protected long DPI;
    protected int [] telefono = new int [9];
    protected static List<informacion> informacion_personales = new ArrayList();
    protected static List<informacion> informacion_personales1 = new ArrayList();
    protected static List<informacion> informacion_personales2 = new ArrayList();
    protected String [] Direccion = new String[7];

    public void informacion_persona(){
        informacion informacion = new informacion();
        informacion.setNombre("Andres");
        informacion.setApellido("Hernandez");
        informacion.setPais("Guatemala");
        informacion.setDepartamento("Escuintla");
        informacion.setMunicipio("Escuintla");
        informacion.setComunidad("Ladino");
        informacion.setDPI(292910293);
        
        informacion_personales.add(informacion);
        
        informacion informacion1 = new informacion();
        informacion1.setNombre("Eylin");
        informacion1.setApellido("Salguero");
        informacion1.setPais("Guatemala");
        informacion1.setDepartamento("Escuintla");
        informacion1.setMunicipio("Escuintla");
        informacion1.setDPI(493290101);
        informacion1.setComunidad("Ladino");
        
        informacion_personales1.add(informacion1);
        
        informacion informacion2 = new informacion();
        informacion2.setNombre("Alessandro");
        informacion2.setApellido("Matute");
        informacion2.setPais("Guatemala");
        informacion2.setDepartamento("Escuintla");
        informacion2.setMunicipio("Itztapa");
        informacion2.setDPI(202403211);
        informacion2.setComunidad("Ladino");
        
        informacion_personales2.add(informacion2);
    }
     public void mostrarinformacion(){
        Direccion [0] = "3era avenida 6-64, colonia buena vista";
        Direccion [1] = "3ra avenida 6-64, colonia bunea vista";
        telefono [0] = 38560098; 
        telefono [1] = 38560098; 
        telefono [2] = 44058873; 
        System.out.println(this.Nombre +"\t"+ this.Apellido + "\t" + this.DPI + "\n\n"
                + "\t" + this.departamento + "\t" + this.municipio + "\t" + this.Pais + "\t" + this.comunidad + "\n\n");
        
        for (int c=0; c <1;c++){
            System.out.println("\t" + Direccion[c] + "\t\t" + Direccion [c+1]
                + "\n\n\t" + telefono[c] + "\t" + telefono[c+1] + "\t" + telefono[c+2] + "\t" + "\n\n");
        }
    }
     public void mostrarinformacion1(){
        Direccion [0] = "2da calle 4-30, colonia palma de oro";
        Direccion [1] = "2da calle 4-30, colonia palama de oro";
        telefono [0] = 38552199; 
        telefono [1] = 52300398; 
        telefono [2] = 41143200; 
        System.out.println(this.Nombre +"\t"+ this.Apellido + "\t" + this.DPI + "\n\n"
                + "\t" + this.departamento + "\t" + this.municipio + "\t" + this.Pais + "\t" + this.comunidad +  "\n\n");
        
        for (int c=0; c <1;c++){
            System.out.println("\t" + Direccion[c] + "\t\t" + Direccion [c+1]
                + "\n\n\t" + telefono[c] + "\t" + telefono[c+1] + "\t" + telefono[c+2] + "\t" + "\n\n");
        }
    }
     public void mostrarinformacion2(){
        Direccion [0] = "6ta calle 1-06, colonia prados de la costa";
        Direccion [1] = "6ta calle 1-06, colonia pradosde la costa";
        telefono [0] = 578891830; 
        telefono [1] = 47909102; 
        telefono [2] = 56384019; 
        System.out.println(this.Nombre +"\t"+ this.Apellido + "\t" + this.DPI + "\n\n"
                + "\t" + this.departamento + "\t" + this.municipio + "\t" + this.Pais + "\t" + this.comunidad + "\n\n");
        
        for (int c=0; c <1;c++){
            System.out.println("\t" + Direccion[c] + "\t\t" + Direccion [c+1]
                + "\n\n\t" + telefono[c] + "\t" + telefono[c+1] + "\t" + telefono[c+2] + "\t" + "\n\n");
        }
    }
    public void Mostrar_datos(){
        Iterator <informacion> Iterador = informacion_personales.iterator();
        while (Iterador.hasNext()){
            Iterador.next().mostrarinformacion();
        }
        Iterator <informacion> Iterador1 = informacion_personales1.iterator();
        while (Iterador1.hasNext()){
            Iterador1.next().mostrarinformacion1();
        }
        Iterator <informacion> Iterador2 = informacion_personales2.iterator();
        while (Iterador2.hasNext()){
            Iterador2.next().mostrarinformacion2();
        }
    }

    //telefono [3] = 40201021; telefono [6] = 40921890; telefono [4] = 40201940; telefono [7] = 29102395; telefono [5] = 40391092; telefono [8] = 49321049;
    public informacion(String Nombre, String Apellido, String Pais, String municipio, String departamento, String comunidad, long DPI) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Pais = Pais;
        this.municipio = municipio;
        this.departamento = departamento;
        this.comunidad = comunidad;
        this.DPI = DPI;
    }

    
    public informacion() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public long getDPI() {
        return DPI;
    }

    public void setDPI(long DPI) {
        this.DPI = DPI;
    }

    public List<informacion> getDatos_personales() {
        return informacion_personales;
    }

    public void setDatos_personales(List<informacion> Datos_personales) {
        this.informacion_personales = Datos_personales;
    }

    public int[] getTelefono() {
        return telefono;
    }

    public void setTelefono(int[] telefono) {
        this.telefono = telefono;
    }

    public static List<informacion> getDatos_personales1() {
        return informacion_personales1;
    }

    public static void setDatos_personales1(List<informacion> Datos_personales1) {
        informacion.informacion_personales1 = Datos_personales1;
    }

    public static List<informacion> getDatos_personales2() {
        return informacion_personales2;
    }

    public static void setDatos_personales2(List<informacion> Datos_personales2) {
        informacion.informacion_personales2 = Datos_personales2;
    }

    public String[] getDireccion() {
        return Direccion;
    }

    public void setDireccion(String[] Direccion) {
        this.Direccion = Direccion;
    }

    
}
