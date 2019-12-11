package br.edu.senai.modelos;

public class J extends Fundo {

	boolean[][] j; // criando a var booleana para J
	Fundo tabuleiro;

	public J(Fundo Tabuleiro) {
		super();

		this.tabuleiro = tabuleiro;
		// designando formato de J
		this.j = new boolean[][] { { false, true }, { false, true }, { true, true } };

 //exibindo j 
	for (int c = 0; c < 3; c++) {
		for (int l = 0; l < 2; l++) {
			System.out.print(j[c][l] + " ");
		}
		System.out.println();

		}
	}

	public J(boolean[][] j, Fundo tabuleiro) {
		super();
		this.j = j;
		this.tabuleiro = tabuleiro;
	}

	public boolean[][] getJ() {
		return this.j;
	}

	private void setJ(boolean[][] j) {
		this.j = j;
	}
	
//	public static boolean [][] rotacionarJhorario (boolean[][]j){
//		
//		int largura = j.length;
//        int altura = j[0].length;
//        int[][] ret = new int[altura][largura];
//        for (int i=0; i<altura; i++) {
//            for (int k=0; k<largura; k++) {
//                ret[i][k] = j[largura - k - 1][i];
//            }	
//	}return j;
		
		
	}