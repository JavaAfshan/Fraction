import java.util.Scanner;
import java.util.Scanner;
public class Fraction {
	  Scanner myObj=new Scanner(System.in);
	int numerator,denumerator;
	Fraction()
	{
	    numerator=denumerator=0;
	}
	Fraction(int n,int d)
	{
	    numerator=n;
	    denumerator=d;
	}
	void get()
	{
		   System.out.print("Enter the numerator of fraction: ");
		   numerator=myObj.nextInt();
		   System.out.print("Enter the denumerator of fraction: ");
		   denumerator=myObj.nextInt();
	}
	
	void display()
	{
		System.out.println("Fraction: "+numerator+"/"+denumerator);
	}
	
	void reduce()
	{
	     int n,nn;
	      if(numerator<denumerator)
	            n=numerator;
	      else
	    	    n=denumerator;
	      if(n<0)
	    	  nn=-n;
	      else
	    	  nn=n;
	      
	      boolean flag;
	      do{

	  		    	flag=false;
	  		    	
	    	  		if(n!=0&&numerator%n==0&&denumerator%n==0)
	    	  		{
	    	  			numerator/=n;
	    	  			denumerator/=n;
	    	  		    if(numerator<denumerator)
	    		            n=numerator;
	    		        else
	    		    	    n=denumerator;
	    	  		    flag=true;
	    	  		}
	    	  		if(flag==false)
	    	  			n--;
	    	  		if(n<0)
	    		    	  nn=-n;
	    	  		else
	    	  			nn=n;
	           }while(nn!=1&&n!=1);
	      
	}
	
	Fraction sum(Fraction F)
	{
		Fraction Fsum=new Fraction();
		Fsum.denumerator=denumerator*F.denumerator;
		F.numerator*=(Fsum.denumerator/F.denumerator);
		numerator*=(Fsum.denumerator/denumerator);
		Fsum.numerator=F.numerator+numerator;
		Fsum.reduce();
		return Fsum;
	}
	
	Fraction multiplication(Fraction F)
	{
		Fraction Fmul=new Fraction();
		Fmul.denumerator=denumerator*F.denumerator;
		Fmul.numerator=numerator*F.numerator;
		Fmul.reduce();
		return Fmul;
	}
}
