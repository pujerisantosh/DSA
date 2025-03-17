package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Athlargestelement {

    public static ArrayList<Integer> solve(int A , ArrayList<Integer> B){
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(int i=0;i<B.size();i++){
            if(i <  A-1){
            result.add(-1);
            }
             else {
                 minheap.add(B.get(i));
                 if(minheap.size() > A){
                     minheap.poll();

                 }

                 result.add(minheap.peek());



            }
        }

        return result;
    }

    public static void main(String[] args) {

        Athlargestelement a = new Athlargestelement();
        int A = 4 ;
        int [] B  = {1,2 ,3 ,4, 5, 6};
        ArrayList<Integer> res = new ArrayList<>();

        for(int num : B){
            res.add(num);
        }

        ArrayList<Integer> res1 = solve(A,res);
        System.out.println(res1) ;
}
}