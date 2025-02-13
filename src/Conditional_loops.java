public class Conditional_loops {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.print("Hello");
//        System.out.print(" Alien");
        for(int j =0;j<5;j++) {
            for(int i =0; i< 5; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i =0;i<5;i++) {
            for(int j =0; j< 5; j++) {
                if(i==0|| i==4||j==0||j==4) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        int n=5;
        for(int i =0;i<5;i++) {
            for(int j =0; j< 5; j++) {
                if(i==0|| i==4||j==0||j==4||j==(n-1)/2|| i==(n-1)/2) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        int i,j;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++) {
                if ((i==0 && j>0) || (i==n-1 && j>0) || (j==0 && i>0 && i<n-1)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();


        for(i=0;i<n;i++) {
            for(j=0; j<n; j++) {
                if(j==0 || (i==0 && j<(n-1)/2) || (i==(n-1)/2 && j==(n-1)/2) || (i==(n-1) && j==(n-1)/2)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        int k = 9;
        for(i=0;i<k;i++) {
            for(j=0; j<k; j++) {
                if(i==j || i+j==k-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(i=0;i<k;i++) {
            for (j = 0; j < k; j++) {
                if (i == j || i + j == k - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        int m=8;
        for(i=0;i<m;i++){
            for(j=0; j<m; j++) {
                if((i==0 && j>0 && j<(3*(m-1))/4) || (i==m-1 && j>0 && j<(3*(m-1))/4)
                        || (j==0 && i>0 && i<m-1) || (j==(3*(m-1))/4 && i>0 && i<m-1) || i==j &&  i>(m-1)/2){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


//        int age = 20;
//        if (age<18){
//         System.out.println("Calm Down! your time will come");
//        }
//        else if(age>60){
//            System.out.println("Your time to have fun and rest,Be Careful");
//        }
//        else{
//            System.out.println("You're eligible to apply for the license");
//        }
//        if(age>18 && age<60 ){
//            System.out.println("You're eligible");
//        }
//        else {
//            System.out.println("You're not eligible");
//        }
    }
}
