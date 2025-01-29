import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
    //static int factorial(number)
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        long factorial = 1;
        for(int i= 1; i<=number; i++){
            factorial *= i;

        }

        

        
        System.out.println("factorial of" + number + "is" + factorial);
        sc.close();

    }
    //sc.close();

    
}
