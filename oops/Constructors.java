package oops;

// Constructors are use to construct objects , they initialise the object data members
// first fuction called when obj is created
// same name as class name
// doesn't return anything, no return type;
// one object can call a constructor only once 

class Shape{
    int length;
    int breath;
    
    // non parametric constructor
    Shape(){
        System.out.println("Shape Details");
        this.length = 5;
        this.breath = 5;
        System.out.println("lenght: "+ this.length + " breath: " + this.breath);
    }

    // Parametric constructor
    Shape(int l, int b){
        System.out.println("Shape Details");
        this.breath=b;
        this.length=l;
        int area = l*b ;
        System.out.println("Area = " + area );   

    }

    Shape(Shape rectangle){
        this.breath = rectangle.length;
        this.length = rectangle.breath;
        System.out.print("Area of Rohmbus: " + (breath*breath) * Math.signum(length) );
    }
}

public class Constructors {
    public static void main(String[] args) {

        // object Square
        Shape square  = new Shape();

        // object rectangle
        Shape rectangle = new Shape(10,8);

        // object rhombus
        // Copy Constructor
        Shape rhombus = new Shape(rectangle);


        
    }
}
