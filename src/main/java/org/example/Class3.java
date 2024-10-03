package org.example;
/**
 * Class3 реалізує {@link Interface3} та агрегує {@link Interface2}.
 * Має поле типу {@link Interface2}, що представляє агрегацію з {@link Interface2}.
 */
public class Class3 implements Interface3 {
    Interface2 interface2;
    /**
     * Реалізує метод {@link Interface3#method3()}.
     * Виводить на консоль повідомлення про виконання методу.
     */
    @Override
    public void method3() {
        System.out.println("Class3: method3()");
    }
    /**
     * Реалізує метод {@link Interface1#method1()}.
     * Виводить на консоль повідомлення про виконання методу.
     */
    @Override
    public void method1() {
        System.out.println("Class3: method1()");
    }
}
