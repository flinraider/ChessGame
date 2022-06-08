package br.com.consoletech.application;

import br.com.consoletech.boardgame.Board;

public class Program {
	public static void main(String[] args) {
		System.out.println("Welcome to Super-Chess ");
		Board board = new Board( 8, 8 );
		System.out.println("lnhas: "+board.getRows());
		System.out.println("Colunas: "+board.getColumns());
	}
}
