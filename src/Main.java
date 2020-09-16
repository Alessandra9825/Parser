import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Como deseja validar os caracteres ?");
        System.out.println(" 1 - Inserir txt existente");
        System.out.println(" 2 - Digitar sequência");
        int opcao = read.nextInt();
        String input;

        switch (opcao){
            case 1:

                break;
            case 2:
                System.out.println("Digite a sequencia desejada de caracteres:");
                input = read.next();
                if (ValidadorAlfabeto.validarAlfabeto( Tratamento.lerDigitacao(input)))
                {
                     System.out.println("Aguarde a leitura dos dados");
                }
                else
                {
                    System.out.println("Os dados informados não pertencem ao alfabeto permitido : <{[()]}>");
                }
        }
    }
}
