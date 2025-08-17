import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("Bem vindo ao Advinhe o Numero");
        System.out.println("*****************************");

        int numAleatorio = (int) ((Math.random() * 100) + 1) ;
        int chute;
        int tentativas = 0;

        while(true){
            tentativas++;
            System.out.println("Qual o seu chute");
            chute = scanner.nextInt();

            if(chute == numAleatorio){
                break;
            } else if (chute > numAleatorio) {
                System.out.println("Seu chute foi maior que o numero secreto");
            }else {
                System.out.println("Seu chute foi menor que o numero secreto");
            }
        }

        System.out.printf("Parabens! Voce acertou em %d tentativas", tentativas);
    }
}