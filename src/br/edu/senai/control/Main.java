package br.edu.senai.control;

import br.edu.senai.modelos.Fundo;
import br.edu.senai.modelos.Quadrado;

public class Main {

	
	public static void main(String[] args) {
		
		
	//construindo tabuleiro base para o jogo 	
	Fundo tabuleiro = new Fundo(23, 10);
	//construindo primeiro objeto informando o fundo onde ele vai existir
	Quadrado quadrado = new Quadrado(tabuleiro);
	
	//metodo para inserir o quadrado no tabuleiro
	tabuleiro.inserir(quadrado);
	
	

	
	}

}
