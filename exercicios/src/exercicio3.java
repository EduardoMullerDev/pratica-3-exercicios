/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Faça um programa que some os números de 1 a 100 e imprima
somente o valor total da soma
* Data:18/04/2023
*/

public class exercicio3 {
    
    public static void main(String[] args) throws Exception {
    
       /*----For----
         int soma=0;
        for(int i = 1; i<=100; i++)
        soma += i;
    
        System.out.println(soma);
    */
    
        int soma = 0, i = 1;
        
        while(i<=100){
            soma= i + soma;
            i= i + 1;
    }
    
    System.out.println(soma);
   
}

}
