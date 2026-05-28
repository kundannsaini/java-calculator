import java.util.Scanner;

class Operations{
    public double add(double a, double b){
        return a + b;

    }
    public double subtract(double a , double b){
        return a - b;

    }
    public double multiply(double a , double b){
        return a * b;

    }
    public double divide(double a , double b){
        if (b == 0){
            System.out.println(" cannot divide by zero");
            return 0;

        }
        
        return a / b;

    }

}
public class calculator {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Operations op = new Operations();


        while(true){
            System.out.println("\n===== CALCULATOR =====");
            System.out.println("1.add");
            System.out.println("2.subtract");
            System.out.println("3.multiply");
            System.out.println("4.divide");
            System.out.println(" ");
            System.out.println("choose option: ");

            int choice = sc.nextInt();


            if(choice == 5){
                System.out.println("Exiting...");
                break;

            }

            System.out.println("enter first number : ");
            double a = sc.nextDouble();
            
            System.out.println("enter second number:");
            double b = sc.nextDouble();

            double result = 0;
            
            switch(choice){
                case 1:
                    result = op.add(a,b);
                    break;
                case 2:
                    result = op.subtract(a,b);
                    break;
                case 3 :
                    result = op.multiply(a,b);
                    break;
                case 4 :
                    result = op.divide(a,b);
                    break;
                default:
                    System.out.println("invalid choice");
                    continue;

            }
            System.out.println("result: " + result);



        }
        sc.close();

        

    }
    
}
