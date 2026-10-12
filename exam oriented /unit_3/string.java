//Java String...
class string{
    public static void main(String args[]){
        String name = "Subham";
        System.out.println(name); //Subham..
    }
}

//String Manipulation...
class string{
    public static void main(String args[]){
    String s = "Hello";
    System.out.println(s.length());         //5
    System.out.println(s.toUpperCase());    //HELLO
    System.out.println(s.toLowerCase());    //hello
    System.out.println(s.charAt(0));        //H
    System.out.println(s.substring(0,4));   //Hell
}
}   

//String Immutability...
class string{
public static void main(String args[]){
String s = "hello";
s = s.concat(" JAVA");  //hello JAVA
System.out.println(s);
}
}

//String Equality...
class string{
    public static void main(String args[]){
    String a = "Subham";
    String b = "Panigrahy";
        System.out.println(a.equals(b));    //false
    }
}
    
//Passing string - to Method and from method...
class string{
    String s;
    void get(){
        System.out.println("hello");
    }
    void display(String s){
        System.out.println(s);
    }
}
class test{
    public void main(String [] args){
    string s = new string();
    s.get();                //hello.    
    s.display("HELLO");  //HELLO.
}
}

//String Builder...
import java.util.*;
public class string {
public static void main(String args[]){
    StringBuilder sb = new StringBuilder("Subham"); //used for modify string...
    System.out.println(sb); //Subham

    System.out.println(sb.charAt(0)); //(S)-to print single charecter from string...

    sb.setCharAt(2, 'd'); //(Sudham)-to delete 2nd index charecter and add another...
    System.out.println(sb);

    sb.insert(0, 'I'); //(ISudham)-to add any charecter at any index without deletion...
    System.out.println(sb);

    sb.delete(1, 5); //(Iam)-to delete from index - 1 to 4...
    System.out.println(sb);

    sb.append(" Subham"); //(Iam Subham)-add any string at the end of string...
    System.out.print(sb);
}
} 

//String buffer (same as string builder)
class string{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Subham");
        sb.append(" panigrahy");
        System.out.println(sb); //Subham panigrahy
        
        sb.insert(0, "I am ");
        System.out.println(sb); //I amSubham panigrahy
    }
}
    
