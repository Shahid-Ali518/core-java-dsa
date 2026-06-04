import com.sun.tools.javac.Main;

import javax.imageio.stream.ImageInputStream;
import java.util.Stack;

public class ValidPrenthesis {

    public static boolean valid(String input){

        Stack<Character> stack = new Stack<>();

        char [] charArray = input.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] == '(' || charArray[i] == '{' || charArray[i] == '['){
                stack.push(charArray[i]);
            }
            if(charArray[i] == ')'){
                if(!stack.empty() &&  stack.peek() == '(')
                    stack.pop();
            }
            if(charArray[i] == '}'){
                if(!stack.empty() && stack.peek() == '{')
                    stack.pop();
            }
            if(!stack.empty() && charArray[i] == ']'){
                if(stack.peek() == '[')
                    stack.pop();
            }

        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String input = ")(";

        System.out.println(valid(input));
    }
}
