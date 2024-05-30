package ru.sberbank.jd.lesson02;

public class NodImpl implements Nod {
    /**
     * Вычисляет наибольший общий делитель двух целых чисел.
     *
     * @param first  первое число
     * @param second второе число
     * @return наибольший общий делитель
     */

    public int calculate(int first, int second) {
        if (first >= 0 || second >= 0) {
            while (first != 0 && second != 0) {
                if (first > second) {
                    first = first % second;
                } else {
                    second = second % first;
                }
            }
            return first + second;
        } else{
            throw new UnsupportedOperationException("Incorrect input");
        }
    }
}
