//Exception in JAVA...
class exception {
    public static void main(String arg[]){
        int x = 10/0; //Arithmetic Exception...
        System.out.println(x);
    }
}

//Try..Catch...Finally
public class exception {
    public static void main(String args[]){
        try{
            int x = 10;
            int div = 10/0;
            System.out.println(div);
        }
        catch(ArithmeticException e){
            System.out.println("Can't Divide By Zero"); //Can't Divide By Zero
        }
        finally{
            System.out.println("Finished"); //Finished
        }
    }
}

//Creating Own Exception...
class AgeException extends Exception{
    AgeException (String message){
        super(message);
    }
}
class Test{
    public static void main(String args[]){
            int age = 17;
            try{
                if (age < 18){
                    throw new AgeException("Not Eligible");
                }
            }catch(AgeException e){
                System.out.println("Exceptioncaught"); //Exceptioncaught
            }
    }
}

//Thread Class
class Mythread extends Thread{
    public void run(){
        System.out.println("Thread is running"); //Thread is running
    }
    public static void main(String args[]){
        Mythread t = new Mythread();
        t.start(); 
    }
} 

//Runnable Interface...
class exception implements Runnable{
    public void run(){
        System.out.println("Hello..."); //Hello...
    }
    public static void main(String args[]){
        exception obj = new exception();

        Thread t = new Thread(obj);
        t.start();
    }
}

//Creating Single and Multi Threads...
class exception extends Thread{
        public void run(){ //RUN name is mandotory...
            System.out.println("Hi");
        }
        public static  void main(String args[]){
            exception e = new exception();
            exception e2 = new exception();
            e.start();
            e2.start();
        }
    }

//Thread Prioritizaton...(in java - min priority=1; Normal priority=5; Maximum=10)
class exception extends Thread{
    public static void main(String args[]){
        exception e = new exception();
        e.setPriority(MAX_PRIORITY);
        System.out.println(e.getPriority()); //10
    }
}
    
//Synchronization...
public class Counter {
    int count = 0;
    synchronized void incremanet(){
        count++;
    }
    public static void main(String args[]){
        Counter c = new Counter();
        c.incremanet();
        c.incremanet();
        System.out.println(c.count);  //2
    }
}
    
