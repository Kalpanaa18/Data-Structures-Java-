import java.util.*;

public class practicequestion3 {
    public static void main(String[] args) {
        String operation;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b: ");
        int b = sc.nextInt();
        System.out.println("enter operation to be performed (eg: =,-,*,/,%):");
        operation = sc.next();

        switch (operation) {
            case "+" : System.out.println(a+b);
                break;
            case "-" : System.out.println(a-b);
                break;
            case "*" : System.out.println(a*b);
                break;
            case "/" : System.out.println(a/b);
                break;
            case "%" : System.out.println(a%b);
                break;
            default:
                break;
        }
    }
}
