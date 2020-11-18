/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoif;

import java.util.Scanner;

/**
 * Este programa solicita un número al usuario y muestra por pantalla si es positivo, negativo o nulo. Si es positivo, muestra la tabla de multiplicar.
 * @author Sasha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        
        System.out.println("Introduzca número: ");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        
        while(n==0){
            System.out.println("El número es nulo");
            System.out.println("Introduzca número: ");
            scanner=new Scanner(System.in);
            n=scanner.nextInt();
        }
        
        if (n>0){
            System.out.println("El número es positivo");
            for(int i=1;i<=10;i++){
                System.out.println(n+"*"+i+"= "+(n*i));
            }
        }
        else{
            System.out.println("El número es negativo");
        }   
            
    }
    
        
    
}
