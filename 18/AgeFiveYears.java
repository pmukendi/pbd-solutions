import java.util.Scanner;


public class AgeFiveYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("gimme yo name: "); 
        String name = input.next(); 
        
        System.out.println("yo name's " + name);
        
        System.out.print("How old are you? "); 
        Int age = input.nextInt(); 
        
        System.out.println("lol you were like " + (age-5) + " five years ago");
        }
        }
