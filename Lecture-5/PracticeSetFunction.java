/* 1. Enter 3 numbers from the user & make a function to print their average */

import java.util.*;
public class PracticeSetFunction {
public static int averageofthree(int a, int b, int c){
        int average =  (a+b+c)/3;
        return average;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int average = averageofthree(a, b, c);
    System.out.println(average);
}
}


/* 2. Write a function to print the sum of all odd numbers from 1 to n. */

import java.util.*;
public class Extra {
public static void SumOfOdds(int n){
    int sum = 0;
    for(int i=1; i<=n; i++){
       if(i%2 !=0){
       sum = sum+i;
    }
}
    System.out.println(sum);

}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    SumOfOdds(n);
}
}

/* 3. to find greater number between two.. */

import java.util.*;
public class Extra {
public static void Greaterones(int a, int b){
    if(a>b){
        System.out.println("a is greater then b");
    }
    else{
        System.out.println("b is greater then a");
    }
}


public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    Greaterones(a, b);
}
}

/* 4. Write a function that takes in the radius as input and returns the circumference of a circle. */

import java.util.*;
public class Extra {
public static  double CircumferenceOfCircle(int r){
    double Circumference = (2*3.17)*r;
    return Circumference;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();

    CircumferenceOfCircle(r);
   System.out.println(CircumferenceOfCircle(r));
}
}

/* 5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote. */
import java.util.*;
public class Extra {
public static void EligibleForVote(int a){
    if (a<0){
        System.out.println("You Entered a Invalid Number");
        }
    else if (a<18){
        System.out.println("You Are Not Eligible For voting");
        }
    else if(a>=18){
        System.out.println("You Are Eligible For voting");
        }
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    EligibleForVote(a);
}
} 

/* 7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. */
import java.util.*;
public class Extra {
public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int positive = 0;
    int negative = 0;
    int zero = 0;
char choise;
    do{
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if(n>0){
            positive++;
        }

        else if(n<0){
            negative++;
        }
        else{
            zero++;
        }
        System.out.println("Do you Want to stop");
        choise = sc.next().charAt(0);
    }
    while(choise == 'y' || choise == 'Y');
    
    System.out.println(positive);
    System.out.println(negative);
    System.out.println(zero);
}
}

/* 9. Write a function that calculates the Greatest Common Divisor of 2 numbers. */
import java.util.*;
public class Extra {
public static void ToFindGreatestDivisior(int x1, int x2){
    while (x1 != x2){
    if(x1 > x2){
        x1 = x1 - x2;
    }
    else if(x2 >x1){
        x2 = x2-x1;
    }
}
    System.out.println("the gratest divisor is"+ x2);
}

public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int x2 = sc.nextInt();

    ToFindGreatestDivisior(x1, x2);
}
}