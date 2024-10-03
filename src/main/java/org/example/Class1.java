package org.example;
/**
 * Class1 реалізує {@link Interface1}.
 * Містить поле типу {@link Class3}, що представляє агрегацію з {@link Class3}.
 */
public class Class1 implements Interface1 {
    Class3 class3;
    /**
     * Реалізує метод {@link Interface1#method1()}.
     * Виводить на консоль повідомлення про виконання методу.
     */
    @Override
    public void method1() {
        System.out.println("Class1: method1()");
    }
}


