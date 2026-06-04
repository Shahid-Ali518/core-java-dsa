class StackImpl<T>{

    public T[] data ;
    public int top ;
    public final int maxSize = 10;

    public StackImpl(){
            this.data = (T[]) new Object[maxSize];
            this.top = -1;
    }
    public void push(final T newItem){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            data[++top] = newItem;
        }
    }

    public void pop(){
        this.top--;
    }

    public T getTop(){
        return this.data[top];
    }

    public final boolean isEmpty(){
        return this.top < 0;
    }

    public final boolean isFull(){
        return this.top + 1 == this.maxSize;
    }

    public void clear(){
        top = -1;
    }

    public final void showStructure(){
        int j = top;
        if(!isEmpty()){
            System.out.print("top-> ");
            for(int i = 0; i <= top ; i++ ){
                System.out.println(data[j--]);
            }
        }
        else
            System.out.println("Stack is empty");
    }
}


public class Stack {

    public static void main(String[] args) {

        StackImpl<Integer> stack = new StackImpl<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.showStructure();
        StackImpl<Float> floatStack = new StackImpl<>();
        floatStack.push(32.0f);
        floatStack.push(53.5f);
        floatStack.push(434.6f);
        floatStack.showStructure();

        StackImpl<String> stringStack = new StackImpl<>();
        stringStack.push("DSA");
        stringStack.push("OOP");
        stringStack.push("AOA");
        stringStack.showStructure();


        System.out.println(stringStack.getTop());


        // built in stack in java
        java.util.Stack<Integer> st = new java.util.Stack<>();

        // add method return boolean value and add a value
        boolean is = st.add(1);
        System.out.println(is);
        st.add(3);
        st.add(4);
        System.out.println(st);
        // pop method remove value and also return this value
        Integer pop = st.pop();
        System.out.println(pop);
        st.pop();
        System.out.println(st);
        st.push(33);
        // push method add a value and also return this value
        Integer push = st.push(42);
        System.out.println(push);
        System.out.println(st);

    }
}
