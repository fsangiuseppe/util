/**
   *  converts from/to decimal to/from any base
	 */
	public static class NumberBaseConverter{
		
		/**
		 * 	divide by base, append module to result string and go on until quotient is zero,
		 *  return the result string in reverse order 
		 */
		public static String convertFromDecimal(int number, int toBase){
			
			int n = number;
			StringBuffer result = new StringBuffer();
			
			while(true){
				int r = n%toBase; 
				result.append(String.valueOf(r));
				
				n = n/toBase;
				
				if(n==0)
					break;
			}

			return reverseString(result.toString());
		}
		
		/**
		 * starting from zero, multiple the base to previous result, adding 1 or 0 from binary input.
		 */
		public static int convertToDecimal(String number, int fromBase){
			
			int i = 0; 		//positional index
			int result = 0; //partial result
			
			while (true) {		
				result = fromBase * result + Integer.parseInt(String.valueOf(number.charAt(i)));
				i++;
				
				if(i==number.length())
					break;
			}
			
			return result;
		}

    private static String reverseString(String input) {	
  		try {
  			StringBuffer result = new StringBuffer();
  
  			for (int i = 0; i < input.length(); i++) {
  				int beginIndex = input.length()-1 -i;
  				result.append(input.substring(beginIndex, beginIndex+1));
  			}
  			
  			return result.toString();
  			
  		} catch (Exception e) {
  			return "";
  		}		
  	}

}
