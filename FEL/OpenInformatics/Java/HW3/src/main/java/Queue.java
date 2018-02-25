public interface Queue {

    int size();

    boolean isEmpty();

    boolean isFull();

    boolean enqueue(String element);

    String dequeue();

    void printAllElements();

}
