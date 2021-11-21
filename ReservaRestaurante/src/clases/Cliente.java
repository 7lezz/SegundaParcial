/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 
 * @author Lizz
 */
public class Cliente {
    private String nombre, apellido;
    private int id_cliente;
    private double cedula;
    
    Cliente(int id_cliente, double cedula, String nombre, String apellido){ 
    setID (id_cliente);
    setCedula (cedula);
    setNombre (nombre); 
    setApellido (apellido); 
    } 
    /* Metodos Modificadores */ 
    public void setID (int id_cli){ id_cliente = id_cli; }
    public void setCedula (double ced){ cedula = ced; }
    public void setNombre (String n){ nombre = n; } 
    public void setApellido(String a){ apellido = a; } 

    public void setReservarMesa (int m){ 
        // implementar mesas 
    } 

    /* Metodos Accesores */ 
    public int getID (){ return id_cliente; } 
    public double getCedula (){ return cedula; } 
    public String getNombre (){ return nombre; } 
    public String getApellido(){ return apellido; } 

    public void mostrarCliente(){ 
        System.out.print ("\nID: " +getID()+"\nCedula: " +getCedula()+"\nNombre: " +getNombre()+"\nApellido: "+getApellido() );  
    }
    
}
