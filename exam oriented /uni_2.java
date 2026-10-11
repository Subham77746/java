//Using of classes (class, variables , methods)...
public class student {      //class
    int id;                 //variable
    float salary;

    void show(){            //method
        System.out.println(id + " " + salary);
    }
    public static void main(String args[]){
        student s1 = new student();     //object
        s1.id = 1;                      //obj reference
        s1.salary = 20000;              //obj reference
        s1.show();
    }
}

//Object as Parameters...
class student{
    int id ;

    static void show(student s1){
        System.out.println(s1.id);
    }
    
    public static void main(String args[]){
        student s1 = new practice();
        s1.id=10;
        show(s1);
    }
}
//garbage collection...
student s1 = new student();
s1 = null;
System.gc();

//Constuctor...&...Constuctor Overload...
class student{
    int roll;
    student(){              //non-parameterised
        System.out.println("hello");
    }
    student(int R){         //parameterised
        roll = R;
    }
    void show(){
        System.out.println(roll);
    }

    public static void main(String args[]){
        student s1 = new student();
        s1.roll = 10;
        s1.show();
    }
}

//Parameterised Constructor...
class practice {
     int id;
     float salary;
    practice(){
        System.out.println("constructor");
    }

    practice(int I, float S){
        id = I;
        salary = S;
    }

    void get(){
        System.out.println(id);
        System.out.println(salary);
    }

    public static void main(String args[]){
        practice p = new practice(1, 24000);
        p.get();
    }
}

 //This keyword...
 class practice{
    int id;
    float salary;

    practice(int id, float salary){
        this.id = id;
        this.salary = salary;
    }

    void show(){
        System.out.println(id);
        System.out.println(salary);
    }

    public static void main(String args[]){
        practice p = new practice(1, 25000);
        p.show();
    }

}

//Super keyword...
class student{      //parent class.
    int id = 1;
}
class teacher extends student{      //child class.
    int id = 2;

    void show(){
        System.out.println(super.id); //access parent
        System.out.println(this.id);  //access child
    }

    public static void main(String args[]){
        teacher t1 = new teacher();
        t1.show();
    }
}

//Method overload...
class student{
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String args[]){
        System.out.println(add(10, 20));        //30
        System.out.println(add(10, 20, 30));  //60
    }
}
    
//Constructor Overload...
 class student {
        int roll;
        student(){
            System.out.println("hello");
        }
        student(int roll){
            this.roll=roll;
        }
        void show(){
            System.out.println(roll);
        }
    
    public static void main(String args[]){
        student s1 = new student(10);
        s1.show();  //10
    }
}

//Inheritance...(IS-A relationship. dog is a animal)
class animal{
    void eat(){
        System.out.println("eat");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("barks");
    }
public static void main(String args[]){
    dog d1 = new dog();
    d1.eat();       //eat
    d1.sound();     //barks
}
}

//type of inheritance- single, multilevel, hybrid
//HYBRID --> multilevel + hierarchical
class animal{                        //parent
    void sound1(){
        System.out.println("sound");
    }
}
class dog extends animal{           //single inherit
    void sound2(){
        System.out.println("bark");
    }
}
class lion extends dog{             //multilevel-child
    void sound3(){
        System.out.println("roar");
    }
}
class dog1 extends dog{             //hierarchical-child1
    void child1(){
        System.out.println("first");
    }
}
class dog2 extends dog{             //hierarchical-child2
    void child2(){
        System.out.println("second");
    }
}
class output{
    public static void main(String args[]){
        dog1 D = new dog1();
        D.child1();     //first
        D.sound1();     //sound
    }
}
    
//Aggregation...(HAS-A realtionship)
class engine{
    void start(){
        System.out.println("Engine Starts.");
    }
}
class car{
     engine e = new engine();
     void drive(){
        e.start();
        System.out.println("car moving");
     }
}
class output{
    public static void main(){
        car c = new car();
        c.drive();  //Engine Starts.
        }           //car moving
    }

//Extends vs Implements...
//Extends.
class animal{
    void eat(){
        System.out.println("Eating");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("barking");
    }
}
class output{
    public static void main(){
    dog d = new dog();
    d.eat();        //eating
    d.bark();       //barking
    }
}

//Implements.
interface animal{
    void eat();
}
class dog implements animal{
    public void eat(){
        System.out.println("Eating");
    }
}
class output{
    public static void main(){
    dog d = new dog();
    d.eat();        //Eating
    }
}
     
//Upcasting  (parent --> child)
class animal{
    void eat(){
        System.out.println("eating");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("barking");
    }
}
class main{
    public static void main(String args[]){
    animal a = new dog();
    a.eat();    //eating
    }
}

//Down-casting  (parent --> child)
class animal{
    void eat(){
        System.out.println("eating");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("barking");
    }
}
class main{
    public static void main(String[] args){
    animal a = new dog();
    dog d = (dog)a;
    d.eat();    //eating......(upcasting)
    d.sound();  //barking.....(down-casting)
    }
}
    
//Auto-boxing...
class auto{
    public static void main(){
    int a = 10;
    Integer b = a;
    System.out.println(b);
    }
}
    
//Enumeration...
enum meal{
    breakfast, lunch
}
class main{
    public static void main(String args[]){
        meal m = meal.breakfast;
        System.out.println(m);  //breakfast
    }
}
    
//Polymorphism....
//1. compile-time(method overload)
class calculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
class main{
    public static void main(String args[]){
        calculator c = new calculator();
        System.out.println(c.add(1,2));     //3
        System.out.println(c.add(1,2,3));   //6
    }
}

//2. Run-time...(method overriding)
class animal{
    void sound(){
        System.out.println("sound");
    }
}
class dog extends animal {
    void sound(){
        System.out.println("bark");
    }
}
class main{
    public static void main(String args[]){
    animal a = new dog();
    a.sound();      //bark..
    }
          }
