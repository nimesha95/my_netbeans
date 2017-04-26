package Stack;

import java.util.Stack;

/*
 * 
Algorithm
1. Scan the infix expression from left to right.
2. If the scanned character is an operand, output it.
3. Else,
…..3.1 If the precedence of the scanned operator is greater than the precedence of the operator in the stack(or the stack is empty), push it.
…..3.2 Else, Pop the operator from the stack until the precedence of the scanned operator is less-equal to the precedence of the operator residing on the top of the stack. Push the scanned operator to the stack.
4. If the scanned character is an ‘(‘, push it to the stack.
5. If the scanned character is an ‘)’, pop and output from the stack until an ‘(‘ is encountered.
6. Repeat steps 2-6 until infix expression is scanned.
7. Pop and output from the stack until it is not empty.

 */
public class InfixToPostFixEvalution {

    private static boolean isOperator(char c)
{
    return c == '+' || c == '-' || c == '*' || c == '/' || c == '^'
            || c == '(' || c == ')';
}

private static boolean isLowerPrecedence(char op1, char op2)
{
    switch (op1)
    {
        case '+':
        case '-':
            return !(op2 == '+' || op2 == '-');

        case '*':
        case '/':
            return op2 == '^' || op2 == '(';

        case '^':
            return op2 == '(';

        case '(':
            return true;

        default:
            return false;
    }
}

public static String convertToPostfix(String infix)
{
    Stack<Character> stack = new Stack<Character>();
    StringBuffer postfix = new StringBuffer(infix.length());
    char c;

    for (int i = 0; i < infix.length(); i++)
    {
        c = infix.charAt(i);

        if (!isOperator(c))
        {
            postfix.append(c);
        }

        else
        {
            if (c == ')')
            {

                while (!stack.isEmpty() && stack.peek() != '(')
                {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty())
                {
                    stack.pop();
                }
            }

            else
            {
                if (!stack.isEmpty() && !isLowerPrecedence(c, stack.peek()))
                {
                    stack.push(c);
                }
                else
                {
                    while (!stack.isEmpty() && isLowerPrecedence(c, stack.peek()))
                    {
                        Character pop = stack.pop();
                        if (c != '(')
                        {
                            postfix.append(pop);
                        } else {
                          c = pop;
                        }
                    }
                    stack.push(c);
                }

            }
        }
    }
    while (!stack.isEmpty()) {
      postfix.append(stack.pop());
    }
    return postfix.toString();
}

public static void main(String[] args)
{
    System.out.println(convertToPostfix("A*B-(C+D)+E"));
    System.out.println(convertToPostfix("3*(4+5)"));
}
}