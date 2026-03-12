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
            do {
                linha = random.nextInt();
                coluna = random.nextInt();
            }
            while(linha>=0 && linha<=2 && coluna>=0 && coluna<=2);    
    
            tabuleiro.jogar(jogador1.getSimbolo(),linha,coluna);

            do {
                linha = random.nextInt();
                coluna = random.nextInt();
            }
            while(linha>=0 && linha<=2 && coluna>=0 && coluna<=2);            

            tabuleiro.jogar(jogador2.getSimbolo(),linha,coluna);
        }
    }
}