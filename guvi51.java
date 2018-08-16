import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num=123;
		String number=String.valueOf(num);
		for(int i=0;i<number.length();i++)
		{
			int j=Character.digit(number.charAt(i),10);
			System.out.println(j);
			
		}
	}
}
