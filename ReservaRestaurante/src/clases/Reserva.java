/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author Lizz
 */
public class Reserva {
	
    private Date fecha;
    private int id, id_res, id_mesa, rango, id_cliente, cant_sol;

    public Reserva(Date fecha, int id, int id_res, int id_mesa, int rango, int id_cliente, int cant_sol) {
        this.fecha = fecha;
        this.id = id;
        this.id_res = id_res;
        this.id_mesa = id_mesa;
        this.rango = rango;
        this.id_cliente = id_cliente;
        this.cant_sol = cant_sol;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_res() {
        return id_res;
    }

    public void setId_res(int id_res) {
        this.id_res = id_res;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getCant_sol() {
        return cant_sol;
    }

    public void setCant_sol(int cant_sol) {
        this.cant_sol = cant_sol;
    }
    
    
    
    
}
 
    
