package edu.kis.vh.nursery;

/**
 * Implementacja wyliczanki z ograniczeniem inspirowanym problemem Wież Hanoi.
 *
 * <p>Do struktury można dodawać tylko liczby mniejsze niż aktualnie znajdująca się
 * na szczycie (zwracana przez metodę peekaboo()). Próba dodania większej liczby
 * skutkuje jej odrzuceniem i zwiększeniem licznika odrzuconych elementów.</p>
 *
 * <p>Klasa rozszerza DefaultCountingOutRhymer i nadpisuje metodę countIn,
 * dodając dodatkową logikę walidacji.</p>
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Początkowa wartość licznika odrzuconych elementów.
     */
    public static final int INITIAL_COUNT = 0;

    /**
     * Liczba odrzuconych prób dodania elementu.
     */
    private int totalRejected = INITIAL_COUNT;

    /**
     * Zwraca liczbę odrzuconych elementów.
     *
     * @return liczba wartości odrzuconych w metodzie countIn
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje liczbę do wyliczanki, jeśli spełnia warunek Hanoi.
     *
     * <p>Jeśli struktura nie jest pusta i podana liczba jest większa
     * niż element na szczycie, zostaje ona odrzucona, a licznik
     * odrzuconych zwiększony.</p>
     *
     * @param in liczba do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}