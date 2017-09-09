/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayStackOfStrings implements Iterable<String> {
    private String[] items;  // holds the items
    private int n;           // number of items in stack

    public ArrayStackOfStrings(int capacity) {
        items = new String[capacity];
    }

    public boolean isEmpty() {
        return n == 0; 
    }

    public boolean isFull() {
        return n == items.length; 
    }
    
    public int size(){
        return n = items.length;
    }

    public void push(String item) {
        items[n++] = item;
    }

    public String pop() {
        return items[--n];
    }

    public Iterator<String> iterator() {
        return new ReverseArrayIterator();
    }
    
private class ReverseArrayIterator implements Iterator<String> {
        private int i = n-1;
        public boolean hasNext()  { return i >= 0;                              }
        public void remove()      { throw new UnsupportedOperationException();  }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            return items[i--];
        }
    }
}