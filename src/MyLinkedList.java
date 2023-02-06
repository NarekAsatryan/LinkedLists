import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{
    private Node first;
    private Node last;
    public MyLinkedList() {
        first = null;
    }
    public void addToLast(T item) {
        if(first==null){
            first = new Node(item, null);
            last = first;            }
        else {
            last.next = new Node(item, null);
            last = last.next;
        }
    }


    private class Node {
        private T data;
        private Node next;
        public Node(T data, Node text) {
            this.data = data;
            this.next = null;
        }
    }


    private class Itr implements Iterator<T> {
        private Node cursor = first;
        @Override
        public T next() {
            T item = cursor.data;
            cursor = cursor.next;
            return item;
        }
        @Override
        public boolean hasNext() {
            return cursor != null;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

}
