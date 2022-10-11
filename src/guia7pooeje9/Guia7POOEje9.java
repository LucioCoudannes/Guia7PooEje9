/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7pooeje9;

import Entidades.Matematica;
import Servicios.CuentaServicio;

/**
 *
 * @author A288808
 */
public class Guia7POOEje9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematica cuenta = new Matematica();
        
        CuentaServicio cs = new CuentaServicio();
        
        cuenta.setNum1(Math.round(Math.random()*(10-1)+1));
        
        cuenta.setNum2(Math.round(Math.random()*(10-1)+1));
        
        System.out.println(cuenta.getNum1() + " " + cuenta.getNum2());
        
        cs.devolverMayor(cuenta);
        
        cs.calcularPotencia(cuenta);
        
        cs.calculaRaiz(cuenta);
        
        
        
        
        
    }
    
}
