import java.io.BufferedReader;
import java.util.Stack;
import java.io.FileReader;
import java.io.IOException;

public class Deliminator {

    static public boolean delimitersMatching(String expression){
        Stack<Character> st = new Stack<Character>();

        char[] list  = expression.toCharArray();

        for (int i = 0; i < expression.length(); i++) {

            if(list[i] == '[' || list[i] == '{' || list[i] == '(' ||  list[i] == '/'){
                st.push(list[i]);

            }


            if(!st.empty()){

                if(list[i] == '*' && st.peek() == '/'){
                    st.push(list[i]);
                }

                if(list[i] == '*' && st.peek() == '*' && list[i + 1] == '/'){
                    st.pop();
                    st.pop();
                }

                if(list[i] == ']'  && st.peek() == '['){

                    st.pop();
                }

                if(list[i] == '}' && st.peek() == '{') {
                    st.pop();
                }

                if(list[i] == ')' && st.peek() == '('){
                    st.pop();
                }

                if(list[i] == '/'){
                    st.pop();
                }
            }

        }


        return st.empty();

    }

    public static void main(String[] args) {
        String filepath = "input.txt";
        try(BufferedReader reader = new BufferedReader( new FileReader(filepath)))
        {
            String line = "";

            while((line = reader.readLine()) != null){
                boolean test = delimitersMatching(line);
                System.out.print(line + "\t-> ");
                if(test)
                    System.out.println("Valid");
                else
                    System.out.println("Invalid");
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
