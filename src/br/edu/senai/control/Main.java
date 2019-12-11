package br.edu.senai.control;

import br.edu.senai.modelos.Fundo;
import br.edu.senai.modelos.Quadrado;
import br.edu.senai.modelos.J;
public class Main {

	
	public static void main(String[] args) {
		
		
	//construindo tabuleiro base para o jogo 	
	Fundo tabuleiro = new Fundo(23, 10);
	//construindo primeiro objeto informando o fundo onde ele vai existir
	//Quadrado quadrado = new Quadrado(tabuleiro);
	J j = new J (tabuleiro);
	//metodo para inserir o quadrado no tabuleiro
	//tabuleiro.inserir(quadrado);
	
	//metodo para fazer o objeto "cair" em determinada frequencia
	//tabuleiro.gravidade(quadrado);
	

	
	}

}
