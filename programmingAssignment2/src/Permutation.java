import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


public class Permutation {


    public static void main(String[] args) {

        RandomizedQueue<String> rq = new RandomizedQueue<String>();
        String x = args[0];
        int y = Integer.parseInt(x);

         while (!StdIn.isEmpty()) {

         String c = StdIn.readString();
         rq.enqueue(c);

         }

         for (int j = 0; j < y; j++) {
         StdOut.println(rq.dequeue());


         }





    }


    }

