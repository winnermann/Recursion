//https://www.youtube.com/watch?v=9Hs7DuIJ3LE&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=50
package org.lesson49.recursion;

public class Test4 {
    public static void main(String[] args) {
        //факториал
        //4! = 4*3*2*1
        //1! = 1
        //0! = 1
        System.out.println(factorial(4));
    }

    private static int factorial(int n){
        if (n==1)
            return 1;

        //Это рекурсия
        return n * factorial(n-1);
    }
}
