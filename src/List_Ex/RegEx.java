package List_Ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegEx {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in); 
        System.out.println("Give the input as"+"   'regular_epression' location_of_file");
        
        // Spliting the regular expression and filename and assigning them 
        String[] inputline = sc.nextLine().split("\\s");
        
        // Assinging given regular expression in a variable
        String reg_Ex = inputline[0].substring(1, inputline[0].length() - 1);
        
        //Assigning filename to a variable
        String fileName = inputline[1];
        
        //Reading the file
        FileInputStream fis=new FileInputStream(fileName);
        Scanner sc2=new Scanner(fis);
        
        //Expression matching
        while(sc2.hasNextLine())
        { 
          String line=sc2.nextLine();
          Pattern pattern = Pattern.compile(reg_Ex);
          Matcher matcher = pattern.matcher(line);
          
          //Checking whether any matching is found or not
          if(matcher.find())
          {
             System.out.println(line); //Printing the matched expression 
          }
        
        }
        
        sc2.close(); 
		
	}

}
