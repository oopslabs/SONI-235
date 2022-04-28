package WORK;
import java.util.Scanner;
public class SYMMETRIC {

	public static void main(String[] args) {
		int m,i,j,n;
		int flag=0;
		int m1[][]=new int[10][10];
		int m2[][]=new int[10][10];
		Scanner in =new Scanner(System.in);
		System.out.println("enter the size of first matrix:");
		m=in.nextInt();
		System.out.println("enter the elements in first matrix:");
		 for(i=0;i<m;i++){
		    	for(j=0;j<m;j++){
		    		
		    		m1[i][j]=in.nextInt();
		    	}
		    }
		    System.out.println("Matrix");
		    for(i=0;i<m;i++){
		    	for(j=0;j<m;j++){
		    		System.out.print(m1[i][j]+" ");
		    	}
		    }
		    System.out.println();
		    System.out.println("symmetric matrix:");
		    for(i=0;i<m;i++)
		    {
		    	for(j=0;j<m;j++)
		    	{
		    		if(m1[i][j]!=m1[j][i]){
		    			flag=1;
		    		}
		    	}
		    }
		    if(flag!=1)
		    {
		    	System.out.println("matrix is not symmetric");
		    }
		    else
		    {
		    	System.out.println("matrix is  symmetric");
		    }
		

	}

}
