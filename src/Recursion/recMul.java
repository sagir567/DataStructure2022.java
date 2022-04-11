package Recursion;

import java.awt.*;

public class recMul {

    //Q1
    public static int recMul(int a, int b) {
        if (b == 0)
            return 0;
        return a + recMul(a, b - 1);
    }
    


    public static void main(String args[]){

        System.out.println(recMul(2,6));

    }

}
