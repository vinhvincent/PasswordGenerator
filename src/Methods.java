import java.util.Random;


public class Methods {
	static char Lowercase() {
		Random random = new Random();
		char picked = (char) (random.nextInt(26) + 'a');
		/*
		 * the character 'a' corresponds to the number 97,
		 * using which we can generate 26 random integers that correspond to the lower-case alphabet
		 */
		return picked;		
	}
	static char Uppercase() {
		return Character.toUpperCase(Lowercase());		
	}
	static int Numeric() {
		Random random = new Random();
		int picked = random.nextInt(10); 
		return picked;		
	}
	static char Special() {
		Random random = new Random();
		final String special = "!?#$%&*^@";
		final int len = special.length();
		char picked = special.charAt(random.nextInt(len));
		return picked;		
	}
	static String PassGenerator(boolean isLower, boolean isUpper, boolean isNumeric, boolean isSpecial, int lenght) {
		String psw = "";
		int rnum = 0;
		Random random = new Random();
		if (!isLower && !isUpper && !isNumeric && !isSpecial)
		{
			psw = "Make a checkbox selection!";
			return psw;
		}
		
		while(psw.length() < lenght) {
			rnum = random.nextInt(4 - 1 + 1) + 1;
			if (isLower && rnum == 1) {
				psw = psw + Lowercase();
			}
			else if (isUpper && rnum == 2) {
				psw = psw + Uppercase();
			}
			else if (isNumeric && rnum == 3) {
				psw = psw + Numeric();
			}
			else if (isSpecial && rnum == 4) {
				psw = psw + Special();
			}
			System.out.println("pass : " + psw);			
		}
		return psw;
		
	}
}
