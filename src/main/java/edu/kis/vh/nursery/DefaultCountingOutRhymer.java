package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INITIAL_TOTAL_VALUE = -1;
    public static final int CAPACITY = 12;
    public static final int EMPTY_INDICATOR = -1;

    private final int[] numbers = new int[CAPACITY];
    private int total = INITIAL_TOTAL_VALUE;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL_TOTAL_VALUE;
    }

    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_INDICATOR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_INDICATOR;
        return numbers[total--];
    }
}