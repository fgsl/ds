public class Triangulo {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Você precisa digitar um número inteiro positivo.");
          
            return;
        }

        int numero = Integer.parseInt(args[0]);

        if (numero <= 0) {
            System.out.println("Você precisa digitar um número inteiro positivo.");
          
            return;
        }

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Criado Por Guilherme Olivera Santos");
    }
}