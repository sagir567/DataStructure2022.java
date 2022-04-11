package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q2a {

    public static Queue<Integer> Q2a(Queue<Integer> q){
        boolean flag;
        double avr=0;
        int sum=0, size = q.size();

        Queue<Integer> temp = new LinkedList<>();

        while(!q.isEmpty()){
           sum += q.peek();
           temp.add(q.remove());
        }
        avr = sum /size;
        System.out.println(avr);
        while (!temp.isEmpty()){
            if(temp.peek()<=avr){
                size--;
                q.add(temp.remove());
            }
            else if(size==0){
                q.add(temp.remove());
            }
            else{
                temp.add(temp.remove());
                size --;
            }
        }
    return q;

    }



    public static void main(String args[]) {

        Queue<Integer> q = new LinkedList<>();
        q.add(8);
        q.add(22);
        q.add(40);
        q.add(72);
        q.add(3);
        q.add(11);
        System.out.println(q.toString());

        System.out.println("--------------------------");
        q=Q2a(q);
        System.out.println(q);

    }
}
