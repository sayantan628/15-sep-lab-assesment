
import java.util.Scanner;
 
public class switchClass {
 
    public static void main(String[] args) {
         
        int a,b;
        System.out.println("Enter a and b");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
         
         
        // Outer Switch starts here
        switch (a) { 
 
        // If a = 1 
        case 1: 
 
            // Inner Switch starts here
 
            switch (b) { 
             
            // for condition b = 1 
            case 1: 
                System.out.println("b is 1"); 
                break;
 
            // for condition b = 2 
            case 2: 
                System.out.println("b is 2"); 
                break; 
 
            // for condition b = 3 
            case 3: 
                System.out.println("b is 3"); 
                break; 
            } 
            break; 
 
        // for condition a = 2 
        case 2: 
            System.out.println("a is 2"); 
            break; 
 
        // for condition a == 3 
        case 3: 
            System.out.println("a is 3"); 
            break; 
 
        default: 
            System.out.println("default statement here"); 
            break; 
        } 
         
    } 
}