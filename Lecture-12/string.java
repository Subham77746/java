/* to get out put of any type of string */
public class string{
    public static void main(String args[]){
        String Name = "Tony";
        String Fullname = "Tony Stark";
        String Sentence = "Hello ! My Name Is Tony";
        System.out.println(Fullname);

    }
    
}

/* to get full sentence entered by user... */
import java.util.*;
public class string {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String Name = sc.nextLine();

    System.out.print(Name);
}
}

/* to get the full name of user entered by user... */
import java.util.*;
public class string {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Whats your first name ?");
    String FirstName = sc.nextLine();
    System.out.println("Whats your last name ?");
    String LastName = sc.nextLine();
    String Fullname = FirstName + " " + LastName;
    System.out.println("So your Full name is " + Fullname);
    System.out.println("So your Full name's length is " + Fullname.length());
}
}

//to get string with index wise...
import java.util.*;
public class Extra {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println(name.length());

    for(int i=0; i<name.length(); i++){ //for loop is created using  
        System.out.println(name.charAt(i));
    }
}
}

//using compare_to functin to compare two strings...
import java.util.*;;
public class string {
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
String first = sc.nextLine();
String second = sc.nextLine();

if(first.compareTo(second)==0){                         //compare to :
    System.out.print("first is equal to second.");     //first > second : +ve value.(>0)
}                                                          //first < second: -ve value.(<0)
else if(first.compareTo(second)>0){
    System.out.print("first is bigger than second.");
}
else if(first.compareTo(second)<0){
    System.out.print("second is greater than first.");
}
}
}

//using substring to get a new string from existing string...
public class string {
public static void main(String args[]){
    String sentence = "Hello my name is subham";
    String name = sentence.substring(17,sentence.length()); //in java index starts at 0...
    String greet = sentence.substring(0,5); //index - 0..include & 5..exclude...
    System.out.println(name);
    System.out.print(greet);
}
}