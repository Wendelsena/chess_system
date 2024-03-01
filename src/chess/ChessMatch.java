package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

// cria a partida
public class ChessMatch {

	private Board board;

	// cria um tabuleiro 8/8
	public ChessMatch() {
		board = new Board(8, 8);
		InitialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	// operação para colocar peça passando a posição nas coordenadas do xadrez
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPositon()); // 
	}
	// inicia a partida
	private void InitialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.BLACK));
	}
}
