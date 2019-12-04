package br.edu.senai.modelos;

public class Fundo {

	boolean[][] tabuleiro;

	//construtor de fundo com tamanho atribuido no momento de chamar o construtor no main
	public Fundo(int tamX, int tamY) {
		super();
		
		//Preenchendo a matriz com false
		this.tabuleiro = new boolean[tamX][tamY];
		for (int c = 0; c < tamX; c++) {
			for (int l = 0; l < tamY; l++) {
				tabuleiro[c][l] = false;

			}
		}
		
		//printando o conteudo da matriz para conferir
		for (int c = 0; c < tamX; c++) {
			for (int l = 0; l < tamY; l++) {
				System.out.print(tabuleiro[c][l] + " ");

			}
			System.out.println();

		}
	}
}
