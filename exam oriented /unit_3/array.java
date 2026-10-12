//1D array...
class array{
    static int[] marks = {10,20,30};
    public static void main(String args[]){
    System.out.println(marks[0]);   //10         
    }
}

//2D array... 
class array{
    int[][] a={
        {1,2},
        {3,4}
    };
    public void main(String args[]){
    System.out.println(a[0][1]);    //2
    }
} 
    
//3D array...
class array{
    public static void main(String args[]){
    int [][][] a = {
        {
        {1,2,3},
        {4,5,6}
        },
        {
        {7,8,9},
        {1,2,3}
        }
    };
        System.out.println(a[0][1][2]); //6
    }
}

//Jagged array...(rows can have diff. length)
class array{
public static void main(String args[]){
int [][] a = {
    {1,2},
    {3,4,5},
    {6}
};
    System.out.println(a[1][2]);    //5
}
}

//Array of objects...
public class array {
    int id;
    String name;
    array(int id, String name){
        this.id=id;
        this.name=name;
    }
    void show(){
        System.out.println(id);
        System.out.println(name);
    }
    public static void main(String args[]){
        array[] a=new array[2];
        a[0]=new array(1, "subham");
        a[0]=new array(2, "sachi");
        a[0].show();        
    }
}
 
//Referencing array dynamically...
class array{
    int n = 1;
    int [] a = new int [n];
    public void main(String args[]){
    for (int i=0; i<=5; i++)
        a[i] = i+1;
    }
}
