import java.io.Console;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	boolean isLower   = true;
	boolean isUppwer  = true;
	boolean isNumeric = true;
	boolean isSpecial = true;
	int passwordSize  = 21;
	String psw        = Methods.PassGenerator(isLower, isUppwer, isNumeric, isSpecial, passwordSize);
	
	System.out.println("Password : " + psw + " Lenght : " + psw.length());
	}

}
