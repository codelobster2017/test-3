package seminars.third.hw;

/**
 * Домашнее задание семинара 3
 */
public class Homework {
    /**
     * Определение четности числа
     * @param n - целое число
     * @return четное - true, false - нечетное
     */
    public static boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /***
     * Определение попадания в интервал (25;100)
     * с учетом строгости неравенства (не включительно)
     * @param n - целое число
     * @return true - число лежит в интервале, иначе - false
     */
    public static boolean numberInInterval(int n){
        return n > 25 && n < 100;
    }
}
