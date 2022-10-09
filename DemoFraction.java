import java.util.Scanner;
public class DemoFraction
{
   public static void main(String args[])
   {
	   Scanner myObj=new Scanner(System.in);
	   int numerator;
	   int denumerator;
	   int number;
	   char choice;
	   
	   do
	   {
		   System.out.println("Enter 1 for reducing the fraction");
		   System.out.println("Enter 2 for Adding the fraction");
		   System.out.println("Enter 3 for Multiplying the fraction");
		   System.out.println("Enter 0 for exit");
		   choice=myObj.next().charAt(0);
		   if(choice=='1')
		   {
			   Fraction F1=new Fraction();
			   F1.get();
			   F1.display();
			   F1.reduce();
			   System.out.println("Reduced Fraction");
			   F1.display();
		   }
		   else if(choice=='2')
		   {
			   Fraction Fsum=new Fraction();
			   System.out.println("Enter the number of fractions that you want to added");
			   number=myObj.nextInt();
			   Fraction[] fraction=new Fraction[number];
			   for(int i=0;i<number;i++)
			   {
				   fraction[i]=new Fraction();
				   fraction[i].get();
				   System.out.println("********Fraction number"+(i+1)+"********");
				   fraction[i].display();
			   }
			   Fsum=fraction[0];
			   for(int i=1;i<number;i++)
			   {
				  Fsum= Fsum.sum(fraction[i]);
			   }
			   System.out.println("The sum of the fractions is : ");
			   Fsum.display();
		   }
		   
		   else if(choice=='3')
		   {
			   Fraction Fmul=new Fraction();
			   System.out.println("Enter the number of fractions that you want to multiply");
			   number=myObj.nextInt();
			   Fraction[] fraction=new Fraction[number];
			   for(int i=0;i<number;i++)
			   {
				   fraction[i]=new Fraction();
				   fraction[i].get();
				   System.out.println("********Fraction number"+(i+1)+"********");
				   fraction[i].display();
			   }
			   Fmul=fraction[0];
			   for(int i=1;i<number;i++)
			   {
				  Fmul= Fmul.multiplication(fraction[i]);
			   }
			   System.out.println("The multiplication of the fractions is : ");
			   Fmul.display();
		   }
		   
	   }while(choice!='0');
   }
}
