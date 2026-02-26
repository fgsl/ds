class Pessoa
{
    private String nome;
    private int idade;
    private char sexo;

    public static void main(String[] args)
    {
        Pessoa pessoa;
        pessoa = new Pessoa();
        pessoa.nome = "Alice";
        System.out.println("O nome da pessoa é " + 
            pessoa.nome
        );
    }
}