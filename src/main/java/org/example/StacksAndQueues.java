package org.example;

import java.util.Stack;
import java.util.function.Supplier;

public class StacksAndQueues {
    /*
    Given a string sequence consisting of the characters '(', ')', '[', ']', '{', '}'.
    * Your Task is to determine whether the sequence is a valid  barcket sequence.
    *
    * The Valid bracket sequence is defined in the following way:
    *       An empty bracket sequence is a valid bracket sequence.
    *       If s is a valid bracket sequence then (S), [S], and {S} are also valid.
    *       If A and B are valid bracket sequences then AB is also valid.
    *
    * EXAMPLE:
    *       For sequence = "()", the output should be solution(sequence) = true;
    *       For sequence = "()[]{}", the output should be solution(sequence) = true;
    *       For sequence = "(]", the output should be solution(sequence) = false;
    *       For sequence = "([)}", the output should be solution(sequence) = false;
    *       For sequence = "{[]}", the output should be solution(sequence) = true;
    * */

    public static boolean isValid(String sequence) {
        boolean balanced = true;
        Stack<Character> s = new Stack<>();
        // loop through the sequence
        for(int i = 0; i < sequence.length(); i++) {
            char first = sequence.charAt(i);
            char second;
            // check if it's an opening bracket
            if("([{".indexOf(first) != -1) {
                // if it's an opening bracket then push it to the stack
                s.push(first);
            } else {
                if(s.isEmpty()) {
                    return false;
                }
                second = s.pop();
                switch (second) {
                    case '{':
                        balanced = (first == '}');
                        break;
                    case '[':
                        balanced = (first == ']');
                        break;
                    case '(':
                        balanced = (first == ')');
                        break;
                    default:
                        balanced = false;


                }
            }
            // else compare to the stack
        }
        return balanced && s.isEmpty();
    }
}
