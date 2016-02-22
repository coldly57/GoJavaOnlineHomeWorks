package practice;

import java.util.Stack;

public class UnixPath {

    public static void main(String[] args) {

        System.out.println(new UnixPath().simplify("/var//lib"));
    }

    public String simplify(String input){
        String[] splitInput = input.split("/");

        Stack stack = new Stack();

        for (String element : splitInput){
            if (element.equals("..") && !stack.isEmpty()){
                stack.pop();
            }
            else if (!element.equals(".") && !element.equals("..") && !element.isEmpty()){
                stack.push(element);
            }
        }

        if (stack.isEmpty()){
            return "/";
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()){
            result.insert(0, "/" + stack.pop());
        }

        return result.toString();
    }
}
