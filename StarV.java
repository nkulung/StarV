/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Kulungian
 */
public class StarV {
    
    
    public void displayV(int n)
    {
        /**
         * Initialize and declare variables
         */
        int numLines = n;
        String line = "";
        String newLine = "";
        int numStars = (n*2)-1;
        int numChars = (n*2)-1;
        for(int i =0; i< n; i++)
        {
            for(int c = 1; c < numChars; c++)
            {
               line += "."; 
            }
            if(line.length() > n-1 && numStars > 1)
            {
              newLine = line.substring(0,i) + "*" + line.substring(i,line.length()-1)+ "*";
              numStars -= 2;  
            }
            else
            {
                newLine = line + "*";
                numStars -=1;
            }
            System.out.println(newLine);
            line = "";
            numChars -=1;
        }
        
    }
    
    
}
