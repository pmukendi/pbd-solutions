import java.util.Scanner;


public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What yo name? "); 
        String name = input.next(); 
        
        System.out.println("aight stay blessed " + name + ".");
        
        System.out.print("Yo " + name + " how old is you? ");
        int age = input.nextInt();
        
        System.out.print("Dang "+ age+ "? u ancient " + name + ". now run yo pockets! Whatchya got in der? " );
        double weight = input.nextDouble();
        
        System.out.println("" + name + " You broke nibba. " + age + " old lookin sus boi. ");
        }
  }
