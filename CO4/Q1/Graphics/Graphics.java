package Graphics;
import Graphics.circle;
import Graphics.rectangle;
import Graphics.square;
import Graphics.triangle;
import java.util.*;
public class Graphics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
        circle obj1 = new circle();
        rectangle obj2 = new rectangle();
        square obj3 = new square();
        triangle obj4 = new triangle();
                System.out.println("Choose any    1)Circle   2)Rectangle   3)Square  4)Triangle: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        obj1.area();
                        break;
                    case 2:
                        obj2.area();
                        break;
                    case 3:
                        obj3.area();
                        break;
                    case 4:
                        obj4.area();
                    default:
                        break;

	}

	}}
