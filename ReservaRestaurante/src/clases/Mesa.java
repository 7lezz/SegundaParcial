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
public class Mesa{

    private String nombre;
    private int id_mesa, id_restaurante, posicion, nro_piso, cap_comensal;
    
    Mesa(int id_mesa, String nombre, int id_restaurante, int posicion, int nro_piso, int cap_comensal){ 
    setID (id_mesa);
    setId_res (id_restaurante);
    setNombre (nombre); 
    setPosicion (posicion); 
    setPiso (nro_piso); 
    setComensal (cap_comensal); 
    } 
    /* Metodos Modificadores */ 
    public void setID (int id_me){ id_mesa = id_me; }
    public void setId_res (int id_res){ id_restaurante = id_res; }
    public void setNombre (String n){ nombre = n; } 
    public void setPosicion(int p){ posicion = p; } 
    public void setPiso(int pi){ nro_piso = pi; } 
    public void setComensal(int c){ cap_comensal = c; } 
    

    public void setReservarMesa (int m){ 
        // implementar mesas 
    } 

    /* Metodos Accesores */ 
    public int getID (){ return id_mesa; } 
    public String getNombre (){ return nombre; } 
    public int getId_res (){ return id_restaurante; }
    public int getPosicion(){ return posicion; } 
    public int getPiso(){ return nro_piso; }
    public int getComensal(){ return cap_comensal; } 
 
    
}
