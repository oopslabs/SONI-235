import java.util.Scanner;
public class MATRIX 
{
	
	public static void main(String[] args)
	{
		int m,i,j;
		int m1[][]=new int[10][10];
		int m2[][]=new int[10][10];
		int m3[][]=new int[10][10];
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter the size of  matrix1:");
    	m=in.nextInt();
    	System.out.println("Enter the elements of  matrix1:");
    	for( i=0;i<m;i++)
    	{
    		for( j=0;j<m;j++)
    		{
    			m1[i][j]=in.nextInt();
    		}
    	}
    	
    	System.out.println("the first matrix is:");
    	for( i=0;i<m;i++)
    	{
    		for( j=0;j<m;j++)
    		{
    			System.out.println(m1[i][j]);
    		}
    		
    	}
    	System.out.println("Enter the size of  matrix2:");
    	m=in.nextInt();
    	System.out.println("Enter the elements of  matrix2:");
    	for( i=0;i<m;i++)
    	{
    		for( j=0;j<m;j++)
    		{
    			m2[i][j]=in.nextInt();
    		}
    	}
    	
    	System.out.println("the second matrix is:");
    	for( i=0;i<m;i++)
    	{
    		for( j=0;j<m;j++)
    		{
    			System.out.println(m2[i][j]);
    		}
    		
    	}
    		
    	
    	System.out.println("the sum of matrix is:");
    	for( i=0;i<m;i++)
    	{
    		for( j=0;j<m;j++)
    		{
    			m3[i][j]=m1[i][j]+m2[i][j];
    			System.out.println(m3[i][j]);
    		}
    		
    	}
    	
	}
	 

}


