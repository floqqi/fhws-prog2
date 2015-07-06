package ws1314.exercise04;

import java.util.Iterator;

public class SquareNumberIterator implements Iterator<Integer> {
    private int i;

    public SquareNumberIterator() {
        this.i = 1;
    }

    public double value() {
        return Math.pow(this.i, 2);
    }

    public boolean hasNext() {
        return this.value() <= Integer.MAX_VALUE;
    }

    public Integer next() {
        int r = (int) this.value();
        this.i++;
        return r;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

}
