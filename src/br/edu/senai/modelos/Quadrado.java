package br.edu.senai.modelos;

public class Quadrado extends Fundo {

	boolean[][] quadrado;
	Fundo tabuleiro;
	
	
	//construtor quadrado solicitando o fundo a qual ele pertence 
	public Quadrado(Fundo tabuleiro) {
		super();
	
		this.tabuleiro = tabuleiro;
		this.quadrado = new boolean[][] { { true, true }, { true, true } }; //declarando a matriz quadrado 

		//printado o quadrado
		for (int c = 0; c < 2; c++) {
			for (int l = 0; l < 2; l++) {
				System.out.print(quadrado[c][l] + " ");
			}
			System.out.println();

		}
		
		//posicionando o quadrado no fundo 
		

	
	}


	public Quadrado(boolean[][] quadrado, Fundo tabuleiro) {
		super();
		this.quadrado = quadrado;
		this.tabuleiro = tabuleiro;
	}


	public boolean[][] getQuadrado() {
		return this.quadrado;
	}


	public void setQuadrado(boolean[][] quadrado) {
		this.quadrado = quadrado;
	}
	}

	//construtor vazio do quadrado
//	public Quadrado() {
//		super(0, 0);
//		this.quadrado = new boolean[][] { { true, true }, { true, true } }; //declaro o tamanho do quadrado no costrutor pois ele não muda nunca
//
//		//printando o quadrado para conferir
//		for (int c = 0; c < 2; c++) {
//			for (int l = 0; l < 2; l++) {
//				System.out.print(quadrado[c][l] + " ");
//			}
//			System.out.println();
//
//		}
//	}

	//construtor com variaveis herdadas do pai (Fundo)
//	public Quadrado(int tamX, int tamY) {
//		super(tamX, tamY);
//		this.quadrado = new boolean[][] { { true, true }, { true, true } };
//
//		for (int c = 0; c < 2; c++) {
//			for (int l = 0; l < 2; l++) {
//				System.out.print(quadrado[c][l] + " ");
//			}
//			System.out.println();
//
//		}
//	}
