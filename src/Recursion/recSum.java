package Recursion;

public class recSum {

    public static int recSumSeries(int n){
        if(n==0) return n;
        return n+recSumSeries(n-1);
    }

    public static void main(String args[]){

        System.out.println(recSumSeries(10));
    }


}
