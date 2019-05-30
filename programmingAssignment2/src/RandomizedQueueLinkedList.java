import java.util.Iterator;
import edu.princeton.cs.algs4.StdRandom;
public class RandomizedQueue<Item> implements Iterable<Item> {


   // private  Node n;
    private Node first;
    private Node last;
    private Node x;
    private int numberOfItems;

    private class Node {
        Item item;
        Node next;
        Node prev;
    }


    public RandomizedQueue() {

    //n = new Node();
    first = null;
    last = first;

    }                 // construct an empty randomized queue
    public boolean isEmpty() {
        return numberOfItems == 0;


    }                 // is the randomized queue empty?
    public int size() {
      return numberOfItems;

    }                        // return the number of items on the randomized queue





    public void enqueue(Item item) {

        if (item == null) {

            throw new java.lang.IllegalArgumentException();

        }

        if(isEmpty()) {
           // System.out.println("here ");
            first = new Node();
            first.item = item;
            first.next = null;
            first.prev = null;
            last = first;
            ++numberOfItems;
            return;
        }
        numberOfItems++;
        Node newLast = new Node();
        newLast.item = item;
        newLast.prev = last;
        newLast.next = null;
        last.next = newLast;
        last = newLast;

        //System.out.println("added  "+item+" at \n next = null \n prev= "+last.prev.item);



    }           // add the item





    public Item dequeue() {

        if (isEmpty()) {

            throw new java.util.NoSuchElementException();
        }
        Item i = null;


        if (numberOfItems == 1) {
            i = first.item;
            first = null;
            last=first;
            numberOfItems--;
            return i;

        }

        int randnum = StdRandom.uniform(1, numberOfItems);
        //System.out.println("random number selected at  =======  "+randnum);

        Node x = first;
        Iterator<Item> iter = iterator();
        int j = 1;
        if(randnum == 1){
            i = first.item;
        first = first.next;
        first.prev = null;
        numberOfItems--;
        return i;

        }

        else if(randnum == numberOfItems) {
            i = last.item;
        last = last.prev;
        last.next = null;
        numberOfItems--;
        return i;

        }
        while (iter.hasNext()) {
            if(j == randnum) {

               i = x.item;
              // Node toRemove=x;
               x.prev.next = x.next;
               x.next.prev = x.prev;
               numberOfItems--;
               return i;
            }
            x = x.next;
            j++;
        }



       return i;

    }                    // remove and return a random item
    public Item sample() {

        if(isEmpty()) {

            throw new java.util.NoSuchElementException();
        }


        Item i = null;


        if (numberOfItems == 1) {
            i = first.item;

            return i;

        }

        int randnum = StdRandom.uniform(1, numberOfItems);
        //System.out.println("random number selected at  =======  "+randnum);

       // Item i = null;
        Node x = first;
        Iterator<Item> iter = iterator();
        int j = 1;
        if(randnum == 1) {
            i = first.item;

            return i;

        }

        else if(randnum == numberOfItems) {
            i = last.item;

            return i;

        }
        while (iter.hasNext()) {
            if(j == randnum) {

                i = x.item;

                return i;
            }
            x = x.next;
            j++;
        }



        return i;
    }                     // return a random item (but do not remove it)

    public Iterator<Item> iterator() {
        return new ListIterator();

    }         // return an iterator over items in random order
    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;
        public boolean hasNext()
        {
            return current != null;

        }

        public void remove()

        { /* not supported */
            throw new java.lang.UnsupportedOperationException();
        }

        public Item next()
        {

            Item item = current.item;
            if (current.next.next == null){
                throw new java.util.NoSuchElementException();
            }
            current = current.next;
            return item;
        }
    }







    public static void main(String[] args) {

        RandomizedQueue<Integer> rq = new RandomizedQueue<Integer>();
    for (int i = 0; i <= 5; i++) {
        rq.enqueue(i);


    }
        rq.listElement(rq);
        int y = rq.dequeue();
        System.out.println("removed item  "+y);
        rq.listElement(rq);

        y = rq.dequeue();
        System.out.println("removed item  "+y);
        rq.listElement(rq);

        y = rq.dequeue();
        System.out.println("removed item  "+y);
        rq.listElement(rq);
        y = rq.dequeue();
        System.out.println("removed item  "+y);
        rq.listElement(rq);
        y = rq.dequeue();
        System.out.println("removed item  "+y);
        rq.listElement(rq);
        y = rq.dequeue();
        System.out.println("removed item  "+y);
        rq.listElement(rq);
        rq.dequeue();
        rq.dequeue();
        rq.dequeue();

        rq.showElement(rq);





    }  // unit testing (optional)
    private void showElement (RandomizedQueue<Integer> d) {
        System.out.println("");
        // RandomizedQueue<Integer> d=new RandomizedQueue<Integer>();
        if(d.numberOfItems == 0){
            return;
        }
        d.x = d.first;
        System.out.println("item= "+d.x.item+"\n prev = null \n next ="+d.x.next.item+"\n######################\n");
        d.x = d.first.next;

        while(d.x.next != null){

            System.out.println("item= "+d.x.item+"\n prev = "+d.x.prev.item+"\n next ="+d.x.next.item+"\n######################\n");
            //System.out.print(d.x.item);
            d.x = d.x.next;

        }
        System.out.println("item= "+d.x.item+"\n prev = "+d.x.prev.item+"\n next =null \n######################\n");

        System.out.println();

    }


    private void listElement (RandomizedQueue<Integer> d){
        System.out.println("number of elements = "+d.numberOfItems);
        // RandomizedQueue<Integer> d=new RandomizedQueue<Integer>();
       if (d.numberOfItems == 0) {
           System.out.println( "no more elements ");
           return;

       }
else {
           d.x = d.first;
           System.out.print("item= " + d.x.item);
           d.x = d.first.next;
           int j=2;
           while (j <= d.numberOfItems) {

               System.out.print(d.x.item);
               //System.out.print(d.x.item);
               d.x = d.x.next;
               j++;
           }
       System.out.println();
       }


    }


    }

