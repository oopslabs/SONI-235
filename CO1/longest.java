package Student;

import java.util.Scanner;
public class longest{    
   
  public static void main(String[] args){     
        
      String n = "", min = "", max="";    
      String[] str = new String[100];    
      int length = 0;  
      String m;
      Scanner in=new Scanner(System.in);
      System.out.println("enter the text:");
		m=in.nextLine();
          
      //Add extra space after string to get the last word in the given string    
      m = m + " ";    
          
      for(int i = 0; i < m.length(); i++){    
          //Split the string into words    
          if(m.charAt(i) != ' ')
          {    
              n = n + m.charAt(i);    
          }    
         else{    
              //Add word to array words    
              str[length] = n;    
              //Increment length    
              length++;    
              //Make word an empty string    
              n = "";    
          }    
      }            
      //Initialize small and large with first word in the string    
      min = max= str[0];    
          
      //Determine smallest and largest word in the string    
      for(int k = 0; k < length; k++){    
              
          //If length of small is greater than any word present in the string    
          //Store value of word into small    
          if(min.length() > str[k].length())    
              min = str[k];    
   
          //If length of large is less than any word present in the string    
          //Store value of word into large    
          if(max.length() < str[k].length())    
              max = str[k];    
      }    
      System.out.println("Smallest word: " + min);    
      System.out.println("Largest word: " + max);    
  }  }  
