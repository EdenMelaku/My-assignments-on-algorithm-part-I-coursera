import edu.princeton.cs.algs4.StdIn;


public class Permutation {


    public static void main(String[] args) {

        RandomizedQueue<String> rq = new RandomizedQueue<String>();
        String x = args[0];
        int y = Integer.parseInt(x);
        System.out.println(x);
        System.out.println("enter items .... enter XXX to exit  ");
        int i = 0;
        while (true) {

            String c = StdIn.readString();
            if (c.equalsIgnoreCase("xxx")) {
                break;
            }
            rq.enqueue(c);
            i++;
        }

        for (int j = 0; j < y; j++) {
            System.out.println(rq.sample());


        }


    }
}
