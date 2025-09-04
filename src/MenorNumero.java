import java.util.Scanner;

public class MenorNumero {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        //Entrada
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo núnero: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número");
        int num3 = scanner.nextInt();

        //Logica para encontrar o menor número
        int menor = num1;

        //Saida
        if (menor > num2){
            menor = num2;
        }
        if (menor > num3){
            menor = num3;
        }

        //Exibe o resultado
        System.out.println("O menor número é " + menor);
        scanner.close();
    }
}
