
/* to enter 3 subject marks by using array method */

import java.util.*;

public class arryas {
    public static void main(String args[]){
        int[]mark=new int[3];
        mark[0] = 10;
        mark[1] = 20;
        mark[2] = 30;
       
        for(int i=0; i<3; i++){
            System.out.println(mark[i]);
        }
    }
}

/* get the size of the array from user and print it */

import java.util.*;
public class arryas {
public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int numbers[] = new int[size];
    for(int i=0; i<size; i++){
        System.out.println(numbers[i]);
    }
}
}

/* for print the numbers in array entered by user */

import java.util.*;
public class arryas {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int array[]=new int[size];
    for(int i=0; i<size;i++){
    array[i] = sc.nextInt();
    }

    for(int i=0; i<size; i++){
System.out.println(array[i]);
    }
}
}

/* to get the index for element x input by user... */
import java.util.*;
public class arryas {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int array[]=new int[size];
    for (int i=0;i<size;i++){
        array[i]=sc.nextInt();
    }

    int x = sc.nextInt();

    for (int i=0;i<size;i++){
        if(x==array[i]){
    System.out.println("x found at inedx" + i);
        }
    }
}
}

//concept of 2d array.....taken row and column with data...

import java.util.*;
public class arryas {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();     //input row by uder...
    int column = sc.nextInt();  //input column by uder...

int [][] array = new int[row][column];      //an 2d array...

    for (int i=0; i<row; i++){          //given input values of row by user...
        for (int j=0; j<column; j++){   //given input values of column by user...
            array[i][j]=sc.nextInt();       //input of i and j...
        }
    }

   for (int i=0; i<row; i++){               //for output...
        for (int j=0; j<column; j++){
            System.out.print(array[i][j]+" ");
        }
        System.out.println();
    }
}
}

/* find a variable x from users input... */

import java.util.*;
public class arryas {
public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int column = sc.nextInt();

    int [][] array = new int [row][column];

    for (int i=0; i<row; i++){
        for (int j=0; j<column; j++){
            array[i][j] = sc.nextInt();
        }
    }
    int x = sc.nextInt();

    for (int i=0; i<row; i++){
        for (int j=0; j<column; j++){
            if (array[i][j] == x){
                System.out.println("x is found at "+i+", "+j);
            }
        }
    }
}
}