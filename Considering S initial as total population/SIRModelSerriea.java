import java.util.*;
import java.lang.*;
class SIRModelSerriea
{
 public double alpha, beta; 
 public double S[]=new double[100];
 public double I[]=new double[100];
 public double D[]=new double[100];
	public void ModelS()
	{
		alpha=0.1;
		S[0]=7237025;
		beta=0.7/7237025;
		I[0]=16;
		D[0]=5;
		//System.out.println(beta);
        for(int i=0;i<99;i++)
		{
			S[i+1]=S[i]-beta*S[i]*I[i];
			I[i+1]=I[i]+beta*S[i]*I[i]-alpha*I[i];
			D[i+1]=D[i]+alpha*I[i];
		}
		System.out.println("Weeks    "+"  Values of I                "+ " Values of D");
	       for(int i=0;i<100;i++)
		{
			//System.out.print(i+1+"             ");
			System.out.println(S[i]+"             ");
 			//System.out.println(I[i]+"             ");
			//System.out.println(D[i]+"             ");
		}
	}	
 public static void main(String args[])
	{             
		SIRModelSerriea s=new SIRModelSerriea();
		s.ModelS();	 	
	}
}