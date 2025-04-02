package at.campus02.nowa.figures;

public abstract class Figure {

    protected char[][] symbol = new char[3][3];


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                sb.append(symbol[col][row]);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
