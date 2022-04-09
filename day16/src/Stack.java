public class Stack {
    private Object[] stack = new Object[5];
    private int index = -1;
    public void push(Object stack){
        if(index >= this.stack.length - 1){
            System.out.println("stack is full");
            return;
        }
        this.stack[++index] = stack;
        System.out.println("压栈成功，栈帧指向："+index);
    }
    public void pop(){
        if(index < 0){
            System.out.println("stack is empty");
            return;
        }

        this.stack[index--] = null;
        System.out.println("弹栈成功，栈帧指向："+index);

    }
    public void display(){
        for (int i = 0; i < stack.length; i++) {
            System.out.println((String)stack[i]);
        }
    }

    public int getIndex() {
        return index;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("main");
        stack.push("array");
        stack.push("array");
        stack.push("array");
        stack.push("array");
        stack.push("ar");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
    }
}
