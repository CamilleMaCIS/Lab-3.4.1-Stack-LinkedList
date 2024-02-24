import java.util.LinkedList;

public class CISStack<T> {

    // Linked list property.
    private LinkedList<T> stack;

    // Size property.
    private int size;

    // Constructor.
    public CISStack(){
        stack = new LinkedList<>();
        size = 0;
    }

    // Push. This method pushes a value onto the top of the stack.
    public void push(T data){
        stack.push(data);
        size++;
    }

    // Pop. This method pops a value from the top of the stack.
    // Returns the popped value
    public T pop(){
        size--;
        return stack.pop();
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty(){
        return (size == 0);
    }

    // size. Returns the size of the queue.
    public int size(){
        return  this.size;
    }

    // toString. Returns a description of the stack in, for example, the following format:
    // CISStack{stack=[7, 11], size=2}
    public String toString(){
        if (isEmpty()){
            return "CISStack{stack=[], size=0}";
        }
        String stackElements = "";
        for (int i = this.size - 1; i > 0; i--){
            stackElements += this.stack.get(i).toString() + ", ";
        }
        stackElements += this.stack.get(0);
        return "CISStack{stack=[" + stackElements + "], size=" + this.size + "}";
    }
}
