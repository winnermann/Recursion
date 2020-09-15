//https://www.youtube.com/watch?v=9Hs7DuIJ3LE&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=50
package org.lesson49.recursion;

public class Test2 {
    public static void main(String[] args) {
        counter(3);

    }
    private static void counter(int n){
        System.out.println(n);

        //Метод counter() внутри себя вызывает сам себя - это Рекурсия
        //Здесь бесконечная рекурсия с условием n-1
        counter(n-1);
    }
}
