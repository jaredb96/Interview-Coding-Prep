/**
 * Linked implementation for stack.
 */
public final class LinkedStack<T> implements StackInterface<T>
{
    private Node headNode;
    private int topIndex;

    public LinkedStack(T value) {
        headNode = new Node(value);
        topIndex = 0;
    }

    public LinkedStack() {
        headNode = new Node(null);
        topIndex = -1;
    }

    /**
     * Adds a new entry to the top of the stack. 
     * @param newEntry an object to add to the stack.
     */
    public void push(T newEntry) {
            Node newNode = new Node(newEntry);
            newNode.setNext(headNode);
            headNode = newNode;
            topIndex++;

    }

     /**
     * Removes and returns the top entry of the stack.
     * @return the object removed.
     *
     */
    public T pop() {
        if (topIndex == 0) {
            T result = (T) headNode.getValue();
            headNode.setValue(null);
            return result;
        }
        T result = (T) headNode.getValue();
        Node newNode = headNode.getNext();
        headNode.setNext(null);
        headNode = newNode;
        topIndex--;
         return result;
    }

     /**
     * Returns the current top of the Stack.
     * @return the object at the top of the stack.
     */
    public T peek() {
        return (T) headNode.getValue();
    }

     /**
     * Checks whether the stack is empty or not.
     * @returns true if stack is rempty
     */
    public boolean isEmpty() {

        return topIndex == -1;
    }

     /**
     * Removes all entries from the stack 
     * 
     */
    public void clear() {
        headNode.setValue(null);
        Node currentNode = headNode;
        while(currentNode != null) {
            currentNode = currentNode.getNext();
            currentNode.setValue(null);
        }
        topIndex = -1;
    }


}
