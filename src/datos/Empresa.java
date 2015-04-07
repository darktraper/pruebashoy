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
public class Empresa {
    ArrayList<Empleado> misempleados;
    
    public Empresa(){
        misempleados=new ArrayList<>();
        Empleado e=new Empleado(1,"Maria","pardo","Maria Pardo",1);
        misempleados.add(e);
        
        }
    public int buscarEmpleado(String cuenta,String contraseña){
        int pos=0;
        boolean encontrado=false;
        while(!encontrado && pos<misempleados.size()){
            if (misempleados.get(pos).getLogin().equalsIgnoreCase(cuenta) && misempleados.get(pos).getPass().equals(contraseña)){
                encontrado=true;
            }else{
                pos++;
            }
        }
        if(!encontrado)
            pos=-1;
        
    return pos;
    }
    
}
