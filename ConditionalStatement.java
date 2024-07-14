import java.util.*;

public class ConditionalStatement {
    public static void main(String[] args) {

        //if else else-if

        //example-1:
        // int age ;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the age:");
        // age = sc.nextInt();
        // if(age>18){
        //     System.out.println("adult");
        // }
        // else{
        //     System.out.println("underage");
        // }
        
    //example-2
    //   int num;
    //   Scanner sc = new Scanner(System.in);
    //   System.out.println("enter the number :");
    //   num = sc.nextInt();
    //   if(num%2==0){
    //     System.out.println("even num");
    //   }
    //   else{
    //     System.out.println("odd");
    //   }
       
    //example-3
        //  int a,b;
        //  Scanner sc = new Scanner(System.in);
        //  System.out.println("enter a :");
        //  a = sc.nextInt();
        //  System.out.println("enter b:");
        //  b = sc.nextInt();
        //  if(a==b){
        //     System.out.println("A and b are equal");
        //  }
        // else if(a>b){
        //     System.out.println("a is greater then b");
        // }
        // else {
        //     System.out.println("a is less than b ");
        //  }
        
        //without curly bracees
        // int num=4;
        // if(num%2==0)
        // System.out.println("bazinga");
        // else
        // System.out.println("no");


        //switch and break
      
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1 : System.out.println("hello");
            break;

            case 2 : System.out.println("namaste");
            break;

            case 3 : System.out.println("banjour");
            break;

            default : System.out.println("invalid");
          
        }
    }
}
