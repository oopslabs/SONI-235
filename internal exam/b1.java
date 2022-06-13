package exception;
import java.util.*;
 class box {

	static int length;

    static int breadth;

    public box(int length,int breadth, int b, int area, int volume)

    {

        this.length=length;

        this.breadth=breadth;


    }


}

 class box3d extends box

    {

    int height;int area;int volume;

    public box3d(int height,int area,int volume)

    {

        super(length,breadth, volume, volume, volume);

        this.height=height;
        this.area=area;
        this.volume=volume;

       
    }
    
    }
public class b1 {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

       

        {
        	int a,c,b;
        	Scanner p=new Scanner(System.in);

            System.out.println("Enter length:");

             a=p.nextInt();

            p.nextLine();

            System.out.println("Enter breadth:");

             c=p.nextInt();

            p.nextLine();

            System.out.println("Enter height:");

             b=p.nextInt();

            p.nextLine();
            System.out.println("the area of box:");
            int area=(a*b)*(b*c)*(c*a);
            System.out.println(area);
            System.out.println("the volume of box:");
            int volume=(a+b+c)/2;
            System.out.println(volume);
            

          

    



	}



}}
