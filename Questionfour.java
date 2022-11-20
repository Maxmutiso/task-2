package questionfour;
    import java.util.Scanner;

public class Questionfour {
	 
    static double length;
    static double width;

    Questionfour() {
        Scanner input = new Scanner(System.in);

        System.out.println("The numbers entered below will output perimeter and area of a rectangle");
        System.out.println("Enter the length of a rectangle");
        length = input.nextDouble();
        System.out.println();

        System.out.println("Enter the width of a rectangle");
        width = input.nextDouble();
        System.out.println();
    }

    
    public static void perimeter() {
        System.out.println("The perimeter of the rectangle is: " + 2 * (length + width));
        System.out.println();
    }

    // static method
    public static void area() {
        System.out.println("The area of the rectangle is: " + length * width);
        System.out.println();
    }

    // non-static method
    public void methodOutput() {
        // calling method perimeter & method area
        perimeter();
        area();
    }

    public static void main(String[] args) {
        // creating an object of the class -> QuestionFour
        Questionfour obj = new Questionfour();
        obj.methodOutput();
    }
}
