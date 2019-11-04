package Dec2Hex;

import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[])
    {
        if (args.length > 0) 
        {
            try 
            {
                Arg1 = Integer.parseInt(args[0]);
            }//End Try
            catch (NumberFormatException e) 
            {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }//End Catch
        }//End If
	else
	{
		System.err.println("Please Enter a Value");	
	}

    	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
         int rem, num;
	num = Arg1;
	String hexadecimal=""; 
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
        
        while(num != 0)
        {
	    rem=num%16;
	    hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }//End While
        
        System.out.println("Hexadecimal representation is : " + hexadecimal);

    }//End Main
}//End Class
