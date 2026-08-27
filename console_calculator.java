import java.util.*;
public class console_calculator {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter 2nd number:");
        double num2 = sc.nextDouble();
        System.out.println("Enter operator (+,-,*,/):");
        char operator = sc.next().charAt(0);
        double result;

        switch(operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                if(num2!=0)
                {
                    result = num1/num2;
                }
                else
                    {
                    System.out.println("Number cannot be divided by 0.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                return;
            }
        System.out.println("Result="+result);
        sc.close();
    }
}