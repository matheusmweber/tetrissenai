package br.edu.senai.modelos;

public class Fundo {

	boolean[][] tabuleiro;

	// construtor de fundo com tamanho atribuido no momento de chamar o construtor
	// no main
	public Fundo(int tamX, int tamY) {
		super();

		// Preenchendo a matriz com false
		this.tabuleiro = new boolean[tamX][tamY];
		for (int c = 0; c < tamX; c++) {
			for (int l = 0; l < tamY; l++) {
				tabuleiro[c][l] = false;

			}
		}
		// Printando tabuleiro
		for (int c = 0; c < tamX; c++) {
			for (int l = 0; l < tamY; l++) {
				System.out.print(tabuleiro[c][l] + " ");

			}
			System.out.println();

		}
	}

	// construtor vazio
	public Fundo() {
		super();
	}

	// metodo para insserir o quadrado no tabuleiro
	public void inserir(Quadrado quadrado) {

		//for - percorrendo o objeto quadrado e substituindo ele no tabuleiro
		for (int c = 0; c < quadrado.getQuadrado().length; c++) {
			for (int l = 0; l < quadrado.getQuadrado()[1].length; l++) {

				tabuleiro[c][l+4] = quadrado.getQuadrado()[c][l]; // a soma de l+4 coloca o objeto no centro do tabuleiro
			}

		}

		// Printando tabuleiro
		for (int c = 0; c < tabuleiro.length; c++) {
			for (int l = 0; l < tabuleiro[1].length; l++) {
				System.out.print(tabuleiro[c][l] + " ");

			}
			System.out.println();
		}
	}
}