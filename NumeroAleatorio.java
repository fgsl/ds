import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Random numeroAleatorioGerado = new Random();
        int limiteInferior;
        int limiteSuperior;

        if (args.length == 0){
            System.out.println("Você precisa informar os limites para geração do número");
            System.out.println("Criado por Gabriel Giovanini");
            System.exit(0);
        } else if (args.length < 2) {
            System.out.println("Você precisa informar os DOIS limites para geração do número");
            System.exit(0);
        } else {
            limiteInferior = Integer.parseInt(args[0]);
            limiteSuperior = Integer.parseInt(args[1]);

            int numeroAleatorioInteiro = numeroAleatorioGerado.nextInt(limiteInferior, limiteSuperior);

            System.out.println("Seu número é: " + numeroAleatorioInteiro);
            System.out.println("Criado por Gabriel Giovanini");
        }
    }
}