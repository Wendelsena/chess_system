package chess;

import boardgame.BoardException;

// BoardExcepton pq é mais simples capturar tanto ChessException quanto possiveis BoardException
public class ChessException extends BoardException {
	private static final long serialVersionUID = 1L;
	
	public ChessException(String msg) {
		super(msg);
	}
}
