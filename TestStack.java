package HW8;


    import java.util.Stack;

    class TestStack {
        public static void main(String[] args) {

                Stack<Integer> stack = new Stack<>();
                System.out.println("Empty stack : " + stack);
                System.out.println("Empty stack : " + stack.isEmpty());

                stack.push(100);
                stack.push(101);
                stack.push(102);
                stack.push(103);
                stack.push(104);
                System.out.println("Stack elements are : " + stack);
                System.out.println("Stack: Pop Operation : " + stack.pop());
                System.out.println("Stack: After Pop Operation : " + stack);
                System.out.println("Stack: Second Pop Operation : " + stack.pop());
                System.out.println("Stack: After Second Pop Operation : " + stack);
                System.out.println("Stack: Peek Operation : " + stack.peek());
                System.out.println("Stack: After Peek Operation : " + stack);


            }
        }



