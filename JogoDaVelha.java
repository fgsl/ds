import java.util.Random;

class JogoDaVelha
{
    public static void main(String args[])
    {
        //Jogador jogador1 = new Jogador('X');
        //Jogador jogador2 = new Jogador('O');
        Jogador jogador1, jogador2;
        jogador1 = new Jogador('X');
        jogador2 = new Jogador('O');
        
        Tabuleiro tabuleiro = new Tabuleiro();

        int linha,coluna;

        Random random = new Random();


        // Enquanto não acabou o jogo
        int partida = 1;
        while(!tabuleiro.acabouOJogo())
        {
            System.out.println("Partida " + partida);

            do {
                linha = random.nextInt(0,3);
                coluna = random.nextInt(0,3);
            }    
            while (!tabuleiro.jogar(jogador1.getSimbolo(),linha,coluna));

            if (tabuleiro.acabouOJogo())
            {
                break;
            }

            do {
                linha = random.nextInt(0,3);
                coluna = random.nextInt(0,3);
            }    
            while(!tabuleiro.jogar(jogador2.getSimbolo(),linha,coluna));
            partida++;
        }
    }
}