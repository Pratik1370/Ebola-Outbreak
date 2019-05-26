import java.util.*;
import java.lang.*;
//declaration of class`
class SIRModelGuinea
{
 public double alpha, beta; //declaration of variables for parameters 
 public double S[]=new double[103]; //Succeptible variable array
 public double I[]=new double[103]; //Infectious variable array
 public double D[]=new double[103]; //Death variable array
	public void ModelG()
	{
		alpha=0.1;
		S[0]=12091533;
		beta=0.7/12091533;
		I[0]=11;
		D[0]=0;
		//System.out.println(beta);
        for(int i=0;i<102;i++)
		{
			S[i+1]=S[i]-beta*S[i]*I[i]; //succeptible
			I[i+1]=I[i]+beta*S[i]*I[i]-alpha*I[i]; //Infectious
			D[i+1]=D[i]+alpha*I[i];  //recovered
		}
		System.out.println("Weeks    "+"  Values of I                "+ " Values of D");
	       for(int i=0;i<102;i++)
		{
			System.out.print(i+1+"             ");
			System.out.print(S[i]+"             ");
			System.out.print(I[i]+"             ");
			System.out.println(D[i]+"             ");
		}
	}	
	public static void main(String args[])
	{             
		SIRModelGuinea a=new SIRModelGuinea();
		a.ModelG();	
	}
}