package jogo;
//crie um jogo de quebra-cabeças com 15 números, onde as peças se movem para formar uma sequência crescente.
public class QuebraCabeçaSemGUI {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int cont = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = cont;
                cont++;
            }
        }
        matriz[3][3] = 0;
        int linha = 3;
        int coluna = 3;
        int aux;
        int opcao;
        do {
            System.out.println("1 - Cima");
            System.out.println("2 - Baixo");
            System.out.println("3 - Esquerda");
            System.out.println("4 - Direita");
            System.out.println("5 - Sair");
            opcao = Integer.parseInt(System.console().readLine());
            switch (opcao) {
                case 1:
                    if (linha > 0) {
                        aux = matriz[linha][coluna];
                        matriz[linha][coluna] = matriz[linha - 1][coluna];
                        matriz[linha - 1][coluna] = aux;
                        linha--;
                    }
                    break;
                case 2:
                    if (linha < 3) {
                        aux = matriz[linha][coluna];
                        matriz[linha][coluna] = matriz[linha + 1][coluna];
                        matriz[linha + 1][coluna] = aux;
                        linha++;
                    }
                    break;
                case 3:
                    if (coluna > 0) {
                        aux = matriz[linha][coluna];
                        matriz[linha][coluna] = matriz[linha][coluna - 1];
                        matriz[linha][coluna - 1] = aux;
                        coluna--;
                    }
                    break;
                case 4:
                    if (coluna < 3) {
                        aux = matriz[linha][coluna];
                        matriz[linha][coluna] = matriz[linha][coluna + 1];
                        matriz[linha][coluna + 1] = aux;
                        coluna++;
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        } while (opcao != 5);
    }
}
