public class CryptoManager {
	//By: Omar Abarca
	//CMSC 203
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		boolean isInBounds = true;
		for(char c: plainText.toCharArray())
		{
			if (!(c >= LOWER_BOUND && c <= UPPER_BOUND)) 
			{
				isInBounds = false;
				break;
			}
		}
		return isInBounds;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		String Text = "";
		if(stringInBounds(plainText))
		{
			for(char c: plainText.toCharArray())
			{
				int coder = c + key;
				while (coder > UPPER_BOUND) {
					coder -= RANGE;
				}
				Text += (char)(coder);
			}
		}
		return Text;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		String Text = "";
		if(stringInBounds(plainText))
		{
			for(int a = 0, b = 0; a < plainText.length(); a++, b++)
			{
				if(b == bellasoStr.length())
					b = 0;
				
				int coder = plainText.charAt(a) + bellasoStr.charAt(b);
				while (coder > UPPER_BOUND) {
					coder -= RANGE;
				}
				Text += (char)(coder);
			}
		}
		return Text;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		if(encryptedText.equals("encryption failed"))
			return "";
		String Text = "";
			for(char c: encryptedText.toCharArray())
			{
				int coder = c - key;
				while (coder < LOWER_BOUND) {
					coder += RANGE;
				}
				Text += (char)(coder);
			}
		return Text;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		if(encryptedText.equals("encryption failed"))
			return "";
		String Text = "";
			for(int a = 0, b = 0; a < encryptedText.length(); a++, b++)
			{
				if(b == bellasoStr.length())
					b = 0;
				
				int coder = encryptedText.charAt(a) - bellasoStr.charAt(b);
				while (coder < LOWER_BOUND) {
					coder += RANGE;
				}
				Text += (char)(coder);
			}
		return Text;	
	}
}