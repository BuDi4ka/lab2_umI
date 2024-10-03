package org.example;
/**
 * Class2 наслідує {@link Class1} і реалізує {@link Interface2}.
 * Має поле типу {@link Interface3}, що представляє агрегацію з {@link Interface3}.
 */
public class Class2 extends Class1 implements Interface2 {
    Interface3 interface3;
    /**
     * Реалізує метод {@link Interface2#method2()}.
     * Виводить на консоль повідомлення про виконання методу.
     */
    @Override
    public void method2() {
        System.out.println("Class2: method2()");
    }
    /**
     * Реалізує метод {@link Interface3#method3()}.
     * Виводить на консоль повідомлення про виконання методу.
     */
    @Override
    public void method3() {
        System.out.println("Class2: method3()");
    }
}



