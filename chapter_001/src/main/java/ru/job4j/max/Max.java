package ru.job4j.max;

/**
 * @author Pavel Vladi(mailto:w.h.81@mail.ru)
 * class Max
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * method Max
     * @param first
     * @param second
     * @return max
     */
    public int max(int first, int second) {

        return first > second ? first : second;
    }
    /**
     * method Max
     * @param first
     * @param second
     * @param third
     * @return max
     */
    public int max(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
}
