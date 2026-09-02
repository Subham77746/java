
import java.util.*;
public class string_builder {
public static void main(String args[]){
    StringBuilder sb = new StringBuilder("Subham"); //used for modify string...
    System.out.println(sb);

    System.out.println(sb.charAt(0)); //to print single charecter from string...

    sb.setCharAt(2, 'd'); //to delete 2nd index charecter and add another...
    System.out.println(sb);

    sb.insert(0, 'I'); //to add any charecter at any index without deletion...
    System.out.println(sb);

    sb.delete(1, 5); //to delete from index - 1 to 5...
    System.out.println(sb);

    sb.append(" Subham"); // add any string at the end of string...
    System.out.print(sb);
}
}    

//to swap each charecter front to back and back to front...
import java.util.*;
public class string_builder {
public static void main(String args[]){
    StringBuilder sb = new StringBuilder("subham");

    for(int i=0; i<sb.length()/2; i++){
        int front = i;
        int back = sb.length()-i-1;

        char frontChar= sb.charAt(front);
        char backChar= sb.charAt(back);

        sb.setCharAt(front, backChar);
        sb.setCharAt(back, frontChar);
    }
    System.out.println(sb);
}
}
