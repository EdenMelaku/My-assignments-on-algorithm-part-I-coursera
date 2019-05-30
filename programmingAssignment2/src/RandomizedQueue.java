import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {


    // private  Node n;
    private Item[] items;
    private int numberOfItems;



    public RandomizedQueue() {

        items=(Item[]) new Object[1];
        numberOfItems=0;


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



        if (numberOfItems == items.length) resize(2 * items.length);
        items[numberOfItems++] = item;



    }           // add the item





    public Item dequeue() {

        if (isEmpty()) {

            throw new java.util.NoSuchElementException();
        }

        if(numberOfItems == 1) {
            Item i=items[0];
            items[0]=null;
            numberOfItems=0;
            return i;
        }
        Item i = null;

        int randnum = StdRandom.uniform(1, numberOfItems);
        i=items[randnum];
        items[randnum]=items[numberOfItems-1];
        items[--numberOfItems]=null;



        if (numberOfItems > 0 && numberOfItems == items.length/4) resize(items.length/2);

        return i;

    }                    // remove and return a random item
    public Item sample() {

        if (isEmpty()) {

            throw new java.util.NoSuchElementException();
        }

        if(numberOfItems == 1) {

            return items[0];
        }
        Item i = null;

        int randnum = StdRandom.uniform(1, numberOfItems);
        i=items[randnum];





        return i;
    }                     // return a random item (but do not remove it)

    public Iterator<Item> iterator() {
        StdRandom.shuffle(items);
        return new ListIterator();

    }         // return an iterator over items in random order
    private class ListIterator implements Iterator<Item>
    {
        int i=0;
        public boolean hasNext()
        {
            return items[i] != null;

        }

        public void remove()

        { /* not supported */
            throw new java.lang.UnsupportedOperationException();
        }

        public Item next()
        {


            if (!hasNext()){
                throw new java.util.NoSuchElementException();
            }
            Item item=items[i++];
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
        y = rq.sample();
        System.out.println("sample item  "+y);

        rq.listElement(rq);
        y = rq.dequeue();
        System.out.println("removed item  "+y);
        rq.listElement(rq);

        y = rq.dequeue();
        System.out.println("removed item  "+y);

        rq.listElement(rq);

        y = rq.sample();
        System.out.println("sample item  "+y);

        rq.listElement(rq);


        y = rq.dequeue();
        System.out.println("removed item  "+y);

        rq.listElement(rq);

        rq.enqueue(99);
        y = rq.sample();
        System.out.println("sample item  "+y);

        rq.listElement(rq);

    }  // unit testing (optional)



    private void listElement (RandomizedQueue<Integer> d){
        System.out.println("number of elements = "+d.numberOfItems);
        // RandomizedQueue<Integer> d=new RandomizedQueue<Integer>();
        if (d.numberOfItems == 0) {
            System.out.println( "no more elements ");
            return;

        }
        else {
            int i=0;

            while (i < d.numberOfItems) {

                System.out.print(items[i]);
                //System.out.print(d.x.item);

                i++;
            }
            System.out.println();
        }


    }

    private void resize(int capacity)
    {
        Item[] copy = (Item []) new Object[capacity];
        for (int i = 0; i < numberOfItems; i++)
            copy[i] = items[i];
        items= copy;
    }


}

