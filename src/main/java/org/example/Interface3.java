package org.example;
/**
 * Interface3 наслідує {@link Interface1} і додає новий метод {@link #method3()}.
 */
public interface Interface3 extends Interface1 {
    /**
     * Виконує другу дію, специфічну для {@link Interface3}.
     * @see #method3()
     */
    void method3();
}
