public class pattern {
    public static void main(String[] args) {

        // hollow rectangle
        // int i = 1;
        // for(i=1;i<=4;i++){
        // // System.out.println("*");
        // for(int j=1;j<=5;j++){
        // if(i ==1 || i == 4 || j == 1 || j==5){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // half pyramid
        // for(int i = 1; i<=4;i++){
        // for(int j =1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // inverted triangle 1
        // for(int i =1;i<=4;i++){
        // for(int j = 4 ; j>=i;j--){
        // System.out.print("*");
        // }
        // System.out.println();
        // }


        // inverted pattern 2
// int n = 4;
//         for (int i = 1; i<=n; i++) {
//             for (int j = 1; j <= n-i; j++) {
//                System.out.print(" ");
//             }
//             for( int j = 1;j<=i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

        // int  n = 5 ;
        // for (int i=1 ; i<=n;i++){
        //     for(int j = 1 ;j<=i; j ++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for (int i=5 ; i>=1;i--){
        //     for(int j = 1 ;j<=i; j ++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // int num = 1;
        // for (int i=1 ; i<=n;i++){
        //     for(int j = 1 ;j<=i; j ++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        // 0-1 triangle
        int n = 5;
        for (int i = 1; i<= n ; i++)
        {
            for(int j =1 ; j<=i ; j ++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }

}
