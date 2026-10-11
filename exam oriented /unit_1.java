//Basic output in JAVA...
class practice{
    int x = 10; //x=variable.int=keyword
    final int y = 12; //12=constant.(final)
    public void main(String args[]){
        System.out.println(x);
    }
}

//Data Types...
class practice{
    byte x = 10;
    short y = 20;
    int a = 10;

    long l = 1000L;
    float f = 10.2f;
    double d = 20.5;
    char c = 'X';
    boolean b = true;
}
//Operator...
class practice{
     int a = 10;
     int b = 20;
    public void main(String args[]){
  
            //Arithmetic...
        int x = b-a; //10
        int y = b/a; //2
        int c = b%a; //0

            //Comparision...
        System.out.println(a>b); //false

            //logical...
        if(a<b && b==20){
            System.out.println("true"); //true
        }
        else if(a!=10 || a==10){
            System.out.println("Ok");
        }

            //Bitwise...
        int a = 5; //0101
        int b = 3; //0011
            //1. Bitwise AND (&)-Returns 1 only when both bits are 1.
        System.out.println(a&b); //1
            //2. Bitwise OR (|)-Returns 1 when at least one bit is 1.
        System.out.println(a|b); //7
            //3. Bitwise XOR (^)-Returns 1 when the two bits are different.   
        System.out.println(a^b); //6
            //4. Bitwise NOT (~)-It reverses all bits: 1 becomes 0 and 0 becomes 1.
        System.out.println(~a); //-6
            //5.Left Shift (<<)-Shifts the bits toward the left.
        System.out.println(a<<1); //10 (5 << 1 = 1010 = 10)
            //6. Right Shift (>>)-Shifts the bits toward the right.
        System.out.println(a>>1); //5 (10 >> 1 = 0101 = 5)
    }
}

//Decision making...
//1.if-else
class practice{
int n = 10;
int m = 20;
int x = m+n;
public void main(String args[]){
        if (x<=50){
        System.out.println("Ok"); //Ok
        }
        else if (x==10){
        System.out.println("true");
        }
        else{
        System.out.println("false");
        }
    }
}

//2.switch...
public class practice {
    int day = 3;
    public void main(String args[]){
        switch(day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed"); //Wed
                break;
        }
    }
}

//Loops in JAVA...
class practice{
    public static void main(String args[]){
        //for loop...
        for(int i=1; i<=5; i++){
            System.out.println(i);  //12345...
        }

//while loop...
        int a=1;
        while(a<=5){
            System.out.println(a++);
        }

//do-while....
        int x=1;
        do{
            System.out.println(x++);
        }while(x<=5);
    }
}

//Nested loop in JAVA...
class unit1{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            while(i<=3){
            System.out.println(i); //123...
            break;
            }
        }
    }
}

//Method in JAVA...
//1...
class practice{
     static void show(){
        System.out.println("hi");
        return;
    }
    public static void main(String args[]){
        show(); //for direct access use static otherwise have to create object.
    }
}

//2...
class practice{
    int add(int a, int b){
        return a+b;
    }
public void main(String args[]){
    System.out.println(add(10,20));
}
}

//3.passing argument and return value....
 class unit1{
        static void display(int x){
            System.out.println(x);
            return;
        }
        static int square(int x){
            return x*x;
        }
    public static void main(String args[]){
      display(10); //10..
      System.out.println(square(5));
    }
}
 
 //Built-in methods...
 class unit1{
    public static void main(String args[]){
        System.out.println(Math.sqrt(25));          //5
        System.out.println(Math.pow(2,3));        //8
        System.out.println(Math.max(25, 10));      //25
    }
}

//Scanner class (take input)...
import java .util.*;
class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = sc.nextInt();

        System.out.println("age: "+ a);     //age: 18...
    }
}

//Buffer Reader class ...
import java.io.BufferedReader;
import java.io.InputStreamReader;
class practice{
     public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter your name: ");
    String name = br.readLine();
    System.out.println(name);
     }
}
