public class Personagem {

    private String nome;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Você precisa informar o nome do personagem, bobo.");
            return; 
        }

        Personagem p = new Personagem(args[0]);

        System.out.println("O nome do personagem é " + p.getNome());
        System.out.println("criado por Gustavo");
    }
}