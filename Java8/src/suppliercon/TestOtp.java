package suppliercon;

import java.util.function.Supplier;

public class TestOtp {
public static void main(String[] args) {
	Supplier<String>s=()->
	{
		String otp="";
		for(int i=0; i<6;i++)
		{
			otp=otp+(int)(Math.random()*10);//o to 9
		}
		return otp;
	};
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
}
}
