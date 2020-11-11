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
        int n;
        
        System.out.println("Introduzca número: ");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        
        if (n>0) {
            System.out.println("El número es positivo");
        }
        else if(n<0){
            System.out.println("El número es negativo");
        }
            else{
                System.out.println("El número es nulo");
            }
    }
    
        
    
}
