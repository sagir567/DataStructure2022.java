package linkedList;



import java.util.LinkedList;

public class sumSeries {


    public static boolean isSumSeries (Node n){
       int sum = n.getData();
       while (n.getNext()!= null){
           if(sum!= n.getNext().getData()) return false;
           sum +=n.getNext().getData();
       }
       return true;
    }


}
