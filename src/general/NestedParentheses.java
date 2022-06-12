package general;

public class NestedParentheses {
    public static void main(String[] args) {

        String pharanthesis = "(())())";

        int count = 0;
        for(int i=0;i<pharanthesis.length();i++){
            if(pharanthesis.charAt(i)=='(')
                count++;
            else if (pharanthesis.charAt(i)==')'){
                count--;
                if(count <0)
                    break;  //Break the loop if right pharanthesis comes first
                    
            }
                
        }

        if(count == 0)
            System.out.println("Correct Syntax");
        else
            System.out.println("Wrong Syntax");


    }
    
}


// You are given a string that contains left and right parenthesis characters.
//  Write code to determine whether the parentheses are correctly nested. For example,
//   the strings "(())" and "()()" are correctly nested but "(()()" and ") (" are not.


//Sol:-
//The way i can approach is have a variable track left and right pharanthesis , that will u if 
//it is properly nested, also check if right pharanthesis is not coming if count is zero , 
//bcz that means a syntax like ")())" , which is also wrong