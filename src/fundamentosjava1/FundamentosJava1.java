/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosjava1;

/**
 *
 * @author Gisela Rojas
 */
public class FundamentosJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear 3 variables, una para la edad,
        //otra para el nombre, y una ultima para 
        //su salario
        int edad;
        String nombre = "Gisela"; 
        double salario = 300;
        edad= 32
        
        //mostrar por pantalla Soy <nombre> tengo <edad> y mi sueldo es de <sueldo>
        //Todo en una linea
        System.out.println("Soy "+ nombre + ", tengo "+ edad + " años y mi salario es $"+ salario);
        //Uno debajo del otro
        System.out.println("Me llamo: "+ nombre);
        System.out.println("Y tengo "+ edad);
        System.out.println("Mi salario es U$"+ salario);
        System.out.println("-----------------------");
        
        System.out.println("ESTRUCTURA DE CONTROL - CONDICIONALES");
        
        edad = 32;
        if (edad >= 18){
            System.out.println("Es mayor de 18");
            }
        if(edad >= 32){
            System.out.println("No esta en el rango de edad para salir al boliche");
        }
        
        else {
            System.out.println("Es menor de 18");
        }
    }
    
}
