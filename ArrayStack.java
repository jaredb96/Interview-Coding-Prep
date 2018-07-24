/**
 * Jared Barrow 
 * 7/19/2018
 * Array-based implementation of the Stack data structure.
 */
import java.util.*;
public final class ArrayStack<T> implements StackInterface<T>
{
    private T[] stack; //array of objects for stack
    private int topIndex; //index of top entry
    private boolean initialized = false;
    private static final int DEFAULT_CAPACITY = 50;
    private static final int MAX_CAPACITY = 10000;

    /**
     * Default constructor for ArrayStack
     */
    public ArrayStack(){
        this(DEFAULT_CAPACITY);
    }

    /**
     * Constructor for ArrayStack
     * 
     */
    public ArrayStack(int initialCapacity) {
        //checks for valid new ArrayStack
        checkCapacity(initialCapacity);  
        //supress warnings for safe cast
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[]) new Object[initialCapacity];
        stack = tempStack;

        //empty ArrayStack has top entry of -1
        topIndex = -1;
        initialized = true;  
    }

    /**
     * Checks for valid capacity of new ArrayStack
     * @throws Exception
     */
    private void checkCapacity(int capacity){
        if (capacity > 10000 || capacity < 0){
            throw new ArrayOutOfBoundsException();
        }
    }


    /**
     * Checks if ArrayStack has been initialized.
     * @return true if ArrayStack has been initialized
     */
    private boolean checkInitialization(){
        if (initialized){
            return true;
        }
        els0 e{

            return false;
        }

    }

    private void ensureCapacity(){
        if (topIndex == stack.length - 1){
            int newLength = 2 * stack.length;
            checkCapacity(newLength);
            stack = Arrays.copyOf(stack, newLength);
        }
    }

    
/**
     * Adds a new entry to the top of the stack. 
     * @param newEntry an object to add to the stack.
     */
    public void push(T newEntry){
        checkInitialization();
        ensureCapacity();
        stack[topIndex + 1] = newEntry;
        topIndex++;
        
    }

     /**
     * Removes and returns the top entry of the stack.
     * @return the object removed.
     * @throws EmptyStackException is the stack is empty before calling the function.
     */
    public T pop() {
        checkInitialization()

        if (isEmpty()){
            throws new EmptyStackException();
        }
        else {
            T top = stack[topIndex];
            stack[topIndex] = null;
            //decrement topIndex since top of stack is at last array location
            topIndex--;
            return top;
        }

    }

     /**
     * Returns the current top of the Stack.
     * @return the object at the top of the stack.
     * @throws EmptyStackException is the stack is empty.
     */
    public T peek(){ 
        checkInitialization();
        //throw exception if stack is empty

        if (isEmpty()){
            throw new EmptyStackException();
        }
        else {
            return stack[topIndex];
        }
        
    }
    ;

     /**
     * Checks whether the stack is empty or not.
     * @returns true if stack is empty.
     */
    public boolean isEmpty(){

        return topIndex < 0;
    }

     /**
     * Removes all entries from the stack 
     * 
     */
    public void clear(){
        //sets all entries in ArrayStack to null
        for (int i = 0; i < topIndex + 1; i++){
            stack[i] = null;
        }
        topIndex = -1;

    }

}
