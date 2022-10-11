/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Matematica;

/**
 *
 * @author A288808
 */
public class CuentaServicio {
    
    public double esMayor=0;
    
    
    public void devolverMayor(Matematica m){
        
       
        
        if (m.getNum1()>m.getNum2()){
          
            System.out.println("El primer numero es mayor al segundo");
            esMayor=1;
            
        }else
        {
            System.out.println("El segundo es mayor al primero");
            esMayor=2;
        }
        
        
        
    }
    
    public void calcularPotencia(Matematica p){
        
        if(esMayor==1){
            
            System.out.println("La pontencia del primer numero elevado al segundo numero es " + Math.pow(p.getNum1(), p.getNum2()));
           
        }else if(esMayor==2){
            System.out.println("La pontencia del segundo numero elevado al primer numero es " + Math.pow(p.getNum2(), p.getNum1()));
             
        }
        
        
    }
    
    public void calculaRaiz(Matematica r){
        
        if(esMayor==1){
            
            System.out.println("La raiz cuadrada del segundo numero es " + Math.sqrt(r.getNum2()));
            
            
        }else{
            
            System.out.println("La raiz cuadrada del primer numero es " + Math.sqrt(r.getNum1()));
            
        }
        
        
    }
    
    
}
