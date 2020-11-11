/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoif;

import java.util.Scanner;

/**
 *
 * @author Sasha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, contador;
        
        System.out.println("Introduzca número: ");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        
        while(n==0){
            System.out.println("El número es nulo");
            System.out.println("Introduzca número: ");
            scanner=new Scanner(System.in);
            n=scanner.nextInt();
        }
        
        contador=1;
        if (n>0){
            System.out.println("El número es positivo");
            do{
                System.out.println(n+"*"+contador+"= "+(n*contador));
                contador++;
            }while(contador<=10);
        }
        else{
            System.out.println("El número es negativo");
        }   
            
    }
    
        
    
}
