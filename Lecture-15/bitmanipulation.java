
//get bit ...to tell the user if the poditioned number is 0 or 1...
import java.util.*;
public class bitmanipulation {
public static void main(String main[]){
    int n = 5; //0101
    int position = 3;
    int bitmask = 1<<position;
    if((bitmask & n)==0){       //AND operation...
        System.out.println("The given position is 0");
    }
    else {
        System.out.println("The given positioned number is 1");
    }
}
}

//set bit...to set 0 or 1 in defined position...
import java.util.*;

public class bitmanipulation {
public static void main(String args[]){
    int n = 5;  //0101
    int position = 1;
    int bitmask = 1<<position;

   int  newNumber = bitmask | n;        //OR operation...
        System.out.println(newNumber);
    
}
}

//Get bit....position entered by the user...
import java.util.*;

import javax.swing.plaf.synth.SynthConstants;
public class bitmanipulation {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int n = 5;
int position = sc.nextInt();
int bitmask = 1<<position;
if ((bitmask & n)==0){
System.out.println("it's position is 0");
}
else{
    System.out.print(" The posined number is 1");
}
}
}

//clear bit...(clearing user eneterd bit and replace 0 in that place...)
import java.util.*;
public class bitmanipulation {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int n = 5;
int position = sc.nextInt();
int bitmask = 1<<position;
int NOT = ~(bitmask);
System.out.println((NOT & n ));
}
}

//position and operation both were taken from user...
import java.util.*;
public class bitmanipulation {
public static void main(String args[]){ 
Scanner sc = new Scanner(System.in);

int n = 5;
int position = sc.nextInt();
int bitmask = 1<<position;
int operation = sc.nextInt();  //if operation = 1...set will perform....
                               //if operation = 0...clear will perform....
int newNumber = bitmask | n;  // set operation (convert 0 to 1)
int newNumber2 = ~bitmask & n;  // clear operation (convert 1 to 0)

  if(operation ==1){ //set operation...
    System.out.println(newNumber);
 }
 else if (operation == 0){ //clear operation...
    System.out.print(newNumber2);
 }
}
}