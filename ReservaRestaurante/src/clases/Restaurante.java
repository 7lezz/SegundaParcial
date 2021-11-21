/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.Scanner;

/**
 *
 * @author Lizz
 */
public class Restaurante {
    
    private String nombre, direccion;
    private int id_restaurante;
    
    Restaurante(int id_mesa, String nombre, String direccion){ 
    setID (id_restaurante);
    setNombre (nombre); 
    setDireccion (direccion); 
    } 
    /* Metodos Modificadores */ 
    public void setID (int id_res){ id_restaurante = id_res; }
    public void setNombre (String n){ nombre = n; } 
    public void setDireccion(String d){ direccion = d; } 

    public void setReservarMesa (int m){ 
        // implementar mesas 
    } 

    /* Metodos Accesores */ 
    public int getID (){ return id_restaurante; } 
    public String getNombre (){ return nombre; } 
    public String getDireccion(){ return direccion; } 

    public void mostrarRestaurante(){ 
        System.out.print ("\nID: " +getID()+"\nNombre: " +getNombre()+"\nTelefono: "+getDireccion() );  
    }
    
}

