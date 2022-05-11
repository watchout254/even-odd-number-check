
package oddeven;
import java.util.Scanner;
public class Oddeven {
    public static void main(String[] args) {
        int figure;
        //program to check whether number entered by user is even or odd 
        
        System.out.println("\t\tWelcome to evenodd check number system");
        
        Scanner stu = new Scanner(System.in);
        
        System.out.println("\tEnter any number:");
        figure = stu.nextInt();
        
        if(figure % 2 == 0) {
            System.out.println("It's an even number: "+figure);
        }
        
        else {
            System.out.println("It's an odd number: "+figure);
        }
        
        System.out.println("Thank you!!!Try as many numbers as you can");
    }
    
}
