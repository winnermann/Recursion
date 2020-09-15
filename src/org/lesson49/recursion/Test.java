//https://www.youtube.com/watch?v=9Hs7DuIJ3LE&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=50
package org.lesson49.recursion;

public class Test {
    public static void main(String[] args) {
        someMethod();
    }
    private static void someMethod(){
        System.out.println("Hello");

        //Метод someMethod() внутри себя вызывает сам себя - это Рекурсия
        //Здесь бесконечная рекурсия
        someMethod();
    }
}
