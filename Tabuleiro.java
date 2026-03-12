class Tabuleiro {
    private char[][] casas = new char[3][3];

    public void jogar(char simbolo, int linha, int coluna) {
        this.casas[linha][coluna] = simbolo;
    }

    public boolean acabouOJogo() {
        return this.todasAsCasasPreenchidas() ||
                this.haUmVencedor();
    }

    public boolean todasAsCasasPreenchidas() {
        char vazio = ' ';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.casas[i][j] == vazio) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean haUmVencedor() {
        // linhas
        for (int i = 0; i < 3; i++) {
            if (this.casas[i][0] == this.casas[i][1] &&
                    this.casas[i][1] == this.casas[i][2]) {
                return true;
            }
        }
        // colunas
        for (int i = 0; i < 3; i++) {
            if (this.casas[0][i] == this.casas[1][i] &&
                    this.casas[1][i] == this.casas[2][i]) {
                return true;
            }
        }
        // diagonais
        if (this.casas[0][0] == this.casas[1][1] &&
            this.casas[1][1] == this.casas[2][2]) {
            return true;            
        }
        if (this.casas[0][2] == this.casas[1][1] &&
            this.casas[1][1] == this.casas[2][0]) {
            return true;
        }
        return false;        
    }

    public void mostrar()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(this.casas[i][j]);
            }
        }    
    }

}