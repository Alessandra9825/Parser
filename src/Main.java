import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        try {


            Scanner read = new Scanner(System.in);
            boolean verdade = true;


            while (verdade) {
                System.out.println("Como deseja validar os caracteres ?");
                System.out.println(" 1 - Inserir txt existente");
                System.out.println(" 2 - Digitar sequência");
                int opcao = read.nextInt();
                String input;
                boolean valiAlfab;
                ArrayList<String> inputData;
                int resp;

                switch (opcao) {
                    case 1:
                        inputData = Tratamento.lerTxt();
                        valiAlfab = ValidadorAlfabeto.validarAlfabeto(inputData);
                        System.out.println(ValidadorAlfabeto.mostraResultado(valiAlfab));
                        if (valiAlfab) {
                            System.out.println(AnalisadorSintatico.mostraResultado(AnalisadorSintatico.validadorSintatico(inputData)));
                            AnalisadorSintatico.validadorSintatico(inputData);
                        }
                        break;
                    case 2:
                        System.out.println("Digite a sequencia desejada de caracteres:");
                        input = read.next();
                        inputData = Tratamento.lerDigitacao(input);
                        valiAlfab = ValidadorAlfabeto.validarAlfabeto(inputData);
                        System.out.println(ValidadorAlfabeto.mostraResultado(valiAlfab));
                        if (valiAlfab) {
                            System.out.println(AnalisadorSintatico.mostraResultado(AnalisadorSintatico.validadorSintatico(inputData)));
                        }
                        break;
                    default:
                        System.out.println("Digite apenas opções validas!!");
                }
                System.out.println("Deseja validar outra sequencia ?");
                System.out.println(" 0 - Não ");
                System.out.println(" 1 - Sim ");
                resp = read.nextInt();
                if (resp == 0)
                    verdade = false;

            }
        }catch (Exception err)
        {
            System.out.println("Ops, algum erro presente na sua digitação: "+err);
        }
    }
}
