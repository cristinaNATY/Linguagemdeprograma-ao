
package aula10;

import java.util.Scanner;

/**
 *
 * @author 01979257663
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner= new Scanner (System.in);
     int escolha;
     
     do{
         System.out.println("MENU");
         System.out.println("1.opcao 1");
         System.out.println("2.opcao 2");
         System.out.println("3.opacao 3");
         System.out.println ("0. Sair");
         System.out.print("Escolha uma opcao:");
         escolha = scanner.nextInt();

switch (escolha) {
    case 1:
        System.out.println("Você escolheu a opcao 1");
        break;
        
    case 2:
         System.out.println("Você escolheu a opcao 2");
         break;
         
    case 3:
         System.out.println("Você escolheu a opcao 3");
         break;
       
    case 0:
         System.out.println("Saindo do programa.");
         break;
    
    default:
         System.out.println("Opcao inválida.");
         break;
}
         System.out.println();
         // Linha em branco para separar as interações
} while (escolha != 0);
                
     }
    }
    

