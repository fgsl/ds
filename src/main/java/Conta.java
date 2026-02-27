class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private double limite;
    
    public static void main(String args[])
    {
        Conta conta;
        conta = new Conta();
        conta.numero = 1234;
        conta.nome = "Asdrubal";
        conta.saldo = 12500.60;
        conta.limite = 5000;
        System.out.println(
            "Número da conta: " + conta.numero +
            "\nNome do titular: " + conta.nome +
            "\nSaldo: " + conta.saldo + 
            "\nLimite: " + conta.limite
        );

    }
}
