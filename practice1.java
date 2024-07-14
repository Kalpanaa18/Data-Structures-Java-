import java.util.*;

public class practice1 {
   
    
    public static void main(String[] args) {
        int radius;
        double pi = 3.14 , area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        radius = sc.nextInt() ;
        area = pi*(radius*radius);
        System.out.println("Area of circle is :" + area);


    }
}
