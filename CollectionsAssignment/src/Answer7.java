
public class Answer7 {
    int size = 10;
    int stack[] = new int[size];
    int minElements[] = new int[size];
    int top = -1;
    int minTop = -1;
    
    public void push(int a) {
        if (top < 0) {
            top++;
            stack[top] = a;
            minTop++;
            minElements[minTop] = a;
        } else if (top < size-1) {
            top++;
            stack[top] = a;
            if (minElements[minTop] > a) {
                minTop++;
                minElements[minTop] = a;
            }
        } else {
            System.out.println("Stack is full");
        }
    }
    
    public void pop() {
        if (top < 0) {
            System.out.println("Stack is already empty");
        } else {
            if (stack[top] == minElements[minTop]) {
                minTop--;
            }
            System.out.println(stack[top] +" is popped");
            top--;
        }
    }
    
    public void isEmpty() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
    
    public void isFull() {
        if (top == size-1) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack is not full");
        }
    }
    
    public void getMin() {
        System.out.println("Minimum element is " + minElements[minTop]);
    }
    
    
    public static void main(String[] args) {
        Answer7 obj = new Answer7();
        obj.push(56);
        obj.push(12);
        obj.push(34);
        obj.push(2);
        obj.push(3);
        obj.push(10);
        obj.isFull();
        obj.isEmpty();
        obj.getMin();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.push(111);
        obj.push(112);
        obj.getMin();
    }
}
