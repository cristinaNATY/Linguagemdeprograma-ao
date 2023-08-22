/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12v2;

import java.util.Scanner;

/**
 *
 * @author 01979257663
 */
public class Aula12v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        int idade;
    
    System.out.println("Qual sua idade:");
    idade=ler.nextInt();
    
    if(idade>=18){
        System.out.println("Maior de idade");
    }else{
        System.out.println("Menor de idade");
   
    }
     }
}
