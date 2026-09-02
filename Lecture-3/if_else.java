import java.util.Scanner;

public class if_else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();     /* "next" for 1 token...to print multiple token or whole sentence we have to use "nextLine" */
        System.out.println(name);               /* also available nextInt() */
    }                                                         /*  nextFloat() */
}                                                              

/* using input or import to sum two number...*/
import java.util.Scanner;

public class if_else{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= a+b;
        System.out.println(sum);
    }
} 

/* implementing condition on add two number */
import java.util.Scanner;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        if (sum>40 && sum<50){
            System.out.println("true");
        }
        else if(sum==30 || sum==10){
            System.out.println("ok");
        }
        else{
            System.out.println("invlaid");
        }
    }
}

/* to identify the correct age... */

import java.util.Scanner;

public class if_else{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
if(age < 0){
    System.out.println("invalid age");
}
else if(age < 18){
    System.out.println("age not satisfied");
}
else{
    System.out.println("age is approved you are eligible");
}
}
}

/* to identify the number is odd or even... */

import java.util.*;
public class if_else{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        if(number%2 == 0){
            System.out.println("Your Number Is Even!!!");
        }
        else{
            System.out.println("Your Number Is Odd!!!");
        }
    }
}

/* to print which number is grater from a and b */

import java.util.*;
public class if_else{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println("a is equal to b");
        }
        else if(a > b){
            System.out.println("a is greater then b");
        }
        else if(a < b){
            System.out.println("b is grater then a");
        }
        
    }
}

/* to print HELLO, NAMASTE, WELCOME while user enter 1,2,3 */

import java.util.*;
public class if_else{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if(button == 1){
            System.out.println("HELLO");
        }
        else if(button == 2){
            System.out.println("NAMASTE");
        }
        else if(button == 3){
            System.out.println("WELCOME");
        }
        
    }
}

/* using of switch() case... in java */

import java.util.*;

public class if_else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namste");
                break;
            case 3:
                System.out.println("welcome");
                break;
        
            default:
            System.out.println("invalid button");
                break;
        }
    }
}