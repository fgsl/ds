// exercicio 1

public class Papagaio {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Você não digitou nada");
            System.exit(0);
        }

        System.out.println("Você digitou " + args[0]);

        System.out.println("Emanuelle Donato");
    }
}