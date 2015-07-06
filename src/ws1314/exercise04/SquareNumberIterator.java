package ws1314.exercise04;

import java.util.Iterator;

public class SquareNumberIterator implements Iterator<Integer> {
    private int i;

    public SquareNumberIterator() {
        this.i = 0;
    }

    public Integer value() {
        return this.i * this.i;
    }

    public boolean hasNext() {
        return this.value() <= Integer.MAX_VALUE;
    }

    public Integer next() {
        int r = this.value();
        this.i++;
        return r;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

}
