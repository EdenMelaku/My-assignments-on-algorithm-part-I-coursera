
import java.util.Iterator;
public class Deque<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private Node x;
    private int numberOfItems = 0;
    private class Node {
        Item item;
        Node next;
        Node prev;
    }

    public Deque() {
     first = null;

     last = first;
     numberOfItems = 0;
    }
    // construct an empty deque

    public boolean isEmpty() {

        return first == null;


    }                 // is the deque empty?

    public int size() {

       return numberOfItems;
    }                      // return the number of items on the deque
    public void addFirst(Item item) {

        if (item == null) {

            throw new java.lang.IllegalArgumentException();

        }

        if (isEmpty()) {
        //    System.out.println("here ");
            first = new Node();
            first.item = item;
            first.next = null;
            first.prev = null;
            last = first;
            ++numberOfItems;
            return;
        }
        numberOfItems++;
        Node newFirst = new Node();
        newFirst.item = item;
        newFirst.prev = null;
        newFirst.next = first;
        first.prev = newFirst;
        first = newFirst;


      //  System.out.println("added  "+item+" at \n prev = null \n next = "+first.next.item);

    }          // add the item to the front
    public void addLast(Item item) {

        if (item == null) {

            throw new java.lang.IllegalArgumentException();
        }


        if (isEmpty()) {
          //  System.out.println("here ");
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


    }
    // add the item to the end
    public Item removeFirst() {

        if (isEmpty()) {

            throw new java.util.NoSuchElementException();

        }
        if (numberOfItems == 1) {
            Item i = first.item;
            first = null;
            last = first;
            numberOfItems--;
            return i;

        }


        numberOfItems--;
        Item i = first.item;
        Node Oldf = first;
        first = first.next;
//        first.prev = null;
        Oldf.next = null;
        return i;
    }                // remove and return the item from the front
    public Item removeLast() {
        if (isEmpty()) {

           throw new java.util.NoSuchElementException();
        }
        Item i = last.item;

        if (numberOfItems == 1){

            first = null;
            last = first;
            numberOfItems--;
            return i;

        }

        numberOfItems--;
        Node oldLast = last;
        last = oldLast.prev;
        last.next = null;
        oldLast.prev = null;


        return i;

    }                // remove and return the item from the end



    public Iterator<Item> iterator() {
    return new ListIterator();

    }
    // return an iterator over items in order from front to end
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

            if (!hasNext()){
               throw new java.util.NoSuchElementException();
            }
            Item item = current.item;

            current = current.next;
            return item;
        }
    }


    public static void main(String[] args) {

    Deque<String> d=new Deque<String>();


        String alp[] = { "A","B","C","D","E","F","G","H","I","J","K","L" };

        for (int i = 0; i <= 10; i++) {

             System.out.println("adding ---"+i);

            d.addFirst(alp[i]);
            System.out.println("number of items = "+d.numberOfItems);



        }
        System.out.println("number of items = "+d.numberOfItems);

       d.x = d.first.next;

       while( d.x.item != d.last.item) {

           //System.out.println("item= "+d.x.item+"\n prev = "+d.x.prev.item+"\n next ="+d.x.next.item+"\n######################\n");
           System.out.print(d.x.item);
           d.x = d.x.next;

       }
       System.out.println();





        System.out.println("------------- number of items = "+d.numberOfItems);


        for (int i = 0; i <= 10; i++){


            System.out.println("removed  "+d.removeLast());
            System.out.println("number of items = "+d.numberOfItems);
            d.x = d.first;
            int j = 0;
            while (j<d.numberOfItems) {

                //System.out.println("item= "+d.x.item+"\n prev = "+d.x.prev.item+"\n next ="+d.x.next.item+"\n######################\n");
                System.out.print(d.x.item);
                d.x = d.x.next;
                j++;

            }
            //System.out.print(d.last.item);

            System.out.println();



        }



    }  // unit testing (optional)
}

