package org.example;
/**
 * Interface2 наслідує {@link Interface3} і додає новий метод {@link #method2()}.
 */
public interface Interface2 extends Interface3 {
    /**
     * Виконує третю дію, специфічну для {@link Interface2}.
     * @see #method2()
     */
    void method2();
}

