import java.util.Random;

class JogoDaVelha
{
    public static void main(String args[])
    {
        Jogador jogador1 = new Jogador('X');
        Jogador jogador2 = new Jogador('O');

        Tabuleiro tabuleiro = new Tabuleiro();

        int linha,coluna;

        Random random = new Random();


        // Enquanto não acabou o jogo
        while(!tabuleiro.acabouOJogo())
        {
            linha = random.nextInt(0,2);
            coluna = random.nextInt(0,2);
    
            tabuleiro.jogar(jogador1.getSimbolo(),linha,coluna);

            linha = random.nextInt(0,2);
            coluna = random.nextInt(0,2);

            tabuleiro.jogar(jogador2.getSimbolo(),linha,coluna);
        }
    }
}