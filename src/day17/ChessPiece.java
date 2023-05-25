package day17;

public enum ChessPiece {
    KING_WHITE("♔", 100),   KING_BLACK("♚", 100),
    QUEEN_WHITE("♕", 9),    QUEEN_BLACK("♛", 9),
    ROCK_WHITE("♖", 5),     ROCK_BLACK("♜", 5),
    BISHOP_WHITE("♗", 3.5), BISHOP_BLACK("♝", 3.5),
    KNIGHT_WHITE("♘", 3),   KNIGHT_BLACK("♞", 3),
    PAWN_WHITE("♙", 1),     PAWN_BLACK("♟", 1),
    EMPTY("_", -1);

    private final String symbol;
    private final double value;

    ChessPiece(String symbol, double value) {
        this.symbol = symbol;
        this.value = value;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getValue() {
        return value;
    }
}
