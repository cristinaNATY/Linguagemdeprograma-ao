
package aula13v2;

import java.util.Scanner;

/**
 *
 * @author 01979257663
 */
public class Aula13v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler= new Scanner(System.in);
         int numero;
     
     System.out.println("Digite um numero inteiro:");
     numero=ler.nextInt();
     
     numero = numero %2;
      if(numero !=0){
          System.out.println("O numero e impar");
      }else{
                  System.out.println("o numero e par");
                  }
        }
    
}
