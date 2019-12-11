package br.edu.senai.modelos;

public class Fundo {

	private boolean[][] tabuleiro;
	private int x = 0;

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
	}

	// construtor vazio
	public Fundo() {
		super();
	}

	// metodo para insserir o quadrado no tabuleiro
	public void inserir(Quadrado quadrado) {

		for (int c = 0; c < quadrado.getQuadrado().length; c++) { // for - percorrendo o objeto quadrado e substituindo	
			for (int l = 0; l < quadrado.getQuadrado()[1].length; l++) {// ele no tabuleiro
				tabuleiro[c][l + 4] = quadrado.getQuadrado()[c][l]; // a soma de l+4 coloca o objeto no centro do
																	// tabuleiro
			}
		}
		// Printando tabuleiro
		PrintTab();
	}

	// metodo para fazer o quadrado "cair", utilizamos a altura do tabuleiro e rodamos o posicionamento para cada linha.
	public void gravidade(Quadrado quadrado) {
		for (int t = 0; t < tabuleiro.length; t++) {
			for (int c = 0; c < quadrado.getQuadrado().length; c++) {
				for (int l = 0; l < quadrado.getQuadrado()[1].length; l++) {
					tabuleiro[t][l + 4] = quadrado.getQuadrado()[c][l]; 
				}
			}
			// Printando tabuleiro
			PrintTab();
		}
	}

	// metodo para "printar" o tabuleiro
	public void PrintTab() {
		for (int c = 0; c < tabuleiro.length; c++) {
			for (int l = 0; l < tabuleiro[1].length; l++) {
				System.out.print(tabuleiro[c][l] + " ");

			}
			System.out.println();
		}
		System.out.println();
	}
}