
/* print subham 10 times using for loop.... */
public class loops {
    public static void main(String args[]) {
        for (int counter = 0; counter <= 10; counter = counter + 1) {
            System.out.println("subham");
        }
    }

}

/* print 1-10 numbers by using for-loop */

public class loops {
    public static void main(String args[]) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

/* printing 1-10 using while loop */

public class PRACTICE {
    public static void main(String args[]) {
        int i = 0;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }
}

/* printing 1-10 using do while loop */

public class main{
    public static void main(String args[]){
        int i=0;
        do{
           System.out.println(i);
           i++;
        }
            while(i<11);
        
    }
}

/* take input  from user while number 7 entered... */
import java.util.*;
public class loops{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       int i;
        do{
           System.out.println("enter a number");
             i = sc.nextInt();

            if(i!=7){
                System.out.println("please re-enter...");
            }
            else{
                System.out.println("corect number...");
            }
        }
            while(i==7);
            
        }
    }

/* to print n numbers by using for loop... */
    import java.util.*;

public class practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
    for(int i=1; i<n; i++)
    sum = sum+i;
    System.out.println(sum);
    }
} 

/* print table of 2 using for loop */

import java.util.*;

public class praactice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int mul = n * i;
            System.out.println(mul);
        }

    }
}

/* print table of 2 using do while loop */

import java.util.*;

public class praactice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        do {
            i++;
            System.out.println(i * n);
        } while (i < 10);

    }
}