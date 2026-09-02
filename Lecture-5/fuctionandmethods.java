
/* to print your name */
import java.util.*;

public class fuctionandmethods {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);
    }
}

/* to add two number given by user... */

import java.util.*;

public class Extra {
public static int SumOfTwoNo(int a, int b) {
    int sum = a+b;
    return sum;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = SumOfTwoNo(a,b);
        System.out.println(sum);
    }
    
}

/* to multiply two number given by user... */

import java.util.*;
public class Extra {
public static void multipleoftwo(int a, int b){
    int mul = a*b;
    return mul;
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.print(mul);
}
}

/* to find factorial of any number */

import java.util.*;
public class Extra {
    public static void findfactorial(int n){
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }
             System.out.println(factorial);
            return;
        
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        findfactorial(n);
    }
}