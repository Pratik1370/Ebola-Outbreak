import java.util.*;
import java.lang.*;
class SIRModelGuinea
{
 public double alpha, beta,New_infec,r,Death; 
 public double S[]=new double[103];
 public double I[]=new double[103];
 public double Itotal[]=new double[103];
 public double D[]=new double[103];
	public void ModelG()
	{
		S[0]=3814;
		Death=2544;
		//alpha=Death/S[0];
		alpha=0.038;
		r=0.02;
		beta=0.32/S[0];
		I[0]=11;
		D[0]=0;
		Itotal[0]=I[0];
		for(int i=0;i<101;i++)
		{
			New_infec = beta*S[i]*I[i];
			S[i+1]=S[i]-New_infec;
			if (S[i+1]<0){ S[i+1]=0; New_infec = S[i];}
			I[i+1]=I[i]+New_infec-alpha*I[i]-r*I[i];
			Itotal[i+1]=Itotal[i]+New_infec;
			if (I[i+1]<0){ I[i+1]=0;}
			D[i+1]=D[i]+alpha*I[i];
		}
		System.out.println("Weeks    "+"  Values of I                "+ " Values of D");
        for(int i=0;i<102;i++)
		{
			System.out.print(i+1+"             ");
			System.out.print(S[i]+"             ");
 			System.out.print(Itotal[i]+"             ");
			System.out.println(D[i]+"             ");
		}
	}	
 public static void main(String args[])
	{             
		SIRModelGuinea a=new SIRModelGuinea();
		a.ModelG();	 	
	}
}