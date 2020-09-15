//https://www.youtube.com/watch?v=9Hs7DuIJ3LE&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=50
package org.lesson49.recursion;

public class Test3 {
    public static void main(String[] args) {
        counter(3);
    }

    //вызвался counter(3)

    private static void counter(int n){

        //Если n==0
        if (n==0)
            //остановиться и выйти из метода
            return;
        System.out.println(n);

        //Метод counter() внутри себя вызывает сам себя - это Рекурсия
        //Здесь Рекурсия с условием выхода из метода при n==0 (не бесконечная)
        counter(n-1);
    }
}
