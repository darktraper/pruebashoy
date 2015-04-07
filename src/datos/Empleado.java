/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author salaprofe
 */
public class Empleado {
    private int identificador;
    private String login;
    private String pass;
    private String nombre;
    private ArrayList <Correo> bentrada;
    private int tipoUsuario;

    public Empleado() {
        bentrada=new ArrayList<
                >();
    }

    public Empleado(int identificador, String login, String pass, String nombre, int tipoUsuario) {
        this.identificador = identificador;
        this.login = login;
        this.pass = pass;
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        bentrada=new ArrayList();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList <Correo> getBentrada() {
        return bentrada;
    }

    public void setBentrada(ArrayList <Correo> bentrada) {
        this.bentrada = bentrada;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
            
}
