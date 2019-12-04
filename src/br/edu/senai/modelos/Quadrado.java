package br.edu.senai.modelos;

public class Quadrado extends Fundo {

	boolean[][] quadrado;

	//construtor vazio do quadrado
	public Quadrado() {
		super(0, 0);
		this.quadrado = new boolean[][] { { true, true }, { true, true } }; //declaro o tamanho do quadrado no costrutor pois ele não muda nunca

		//printando o quadrado para conferir
		for (int c = 0; c < 2; c++) {
			for (int l = 0; l < 2; l++) {
				System.out.print(quadrado[c][l] + " ");
			}
			System.out.println();

		}
	}

	//construtor com variaveis herdadas do pai (Fundo)
	public Quadrado(int tamX, int tamY) {
		super(tamX, tamY);
		this.quadrado = new boolean[][] { { true, true }, { true, true } };

		for (int c = 0; c < 2; c++) {
			for (int l = 0; l < 2; l++) {
				System.out.print(quadrado[c][l] + " ");
			}
			System.out.println();

		}
	}
}