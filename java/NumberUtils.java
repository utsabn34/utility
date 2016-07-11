import java.text.DecimalFormat

/**
 * Holds utility functions related to Numbers
 * @author Utsab Neupane<utsabneupane@lftechnology.com>
 */
class NumberUtils {
	/**
	 * Parse String number into double and return default value if failed
	 * @param number {@link String}
	 * @param defValue {@link double}
	 * @return number {@link double}
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	static double parseDouble(String number, double defValue=0.00){
		try{
			return Double.parseDouble(number)
		}catch(Exception e){
			return defValue
		}
	}

	/**
	 * Parse String number into float and return default value if failed
	 * @param number {@link String}
	 * @param defValue {@link float}
	 * @return number {@link float}
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	static float parseFloat(String number, float defValue=0.00f){
		try{
			return Float.parseFloat(number)
		}catch(Exception e){
			return defValue
		}
	}
	
	/**
	 * Parse String number into int and return default value if failed
	 * @param number {@link String}
	 * @param defValue {@link int}
	 * @return number {@link int}
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	static int parseInt(String number, int defValue=0){
		try{
			return Integer.parseInt(number)
		}catch(Exception e){
			return defValue
		}
	}

	/**
	 * Parse String number into BigDecimal and return default value if failed
	 * @param number {@link String}
	 * @param defValue {@link BigDecimal}
	 * @return number {@link BigDecimal}
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	static BigDecimal parseBigDecimal(String number, String defValue="0.00"){
		try{
			return new BigDecimal(number)
		}catch(Exception e){
			return new BigDecimal(defValue)
		}
	}
		
	/** 
	 * Generates random Double number
	 * @param minimum value of a range
	 * @param maximum value of a range
	 * @return double value
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	static double getRandomDouble(float min, float max){
		Random random = new Random();
		int number = random.nextInt((int)(max*100)-(int)(min*100))+1+(int)(min*100);
		return number / 100.0;
	}
	
	/** 
	 * Generates random BigDecimal number
	 * @param minimum value of a range
	 * @param maximum value of a range
	 * @return BigDecimal value
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	static BigDecimal getRandomBigDecimal(BigDecimal min, BigDecimal max){
		Random random = new Random();
		int number = random.nextInt((int)(max*100)-(int)(min*100))+1+(int)(min*100);
		return new BigDecimal(number).divide(new BigDecimal("100.00"), 2, BigDecimal.ROUND_DOWN)
	}

	/**
	 * Generates referenceNumber of 16 digits. Each 4 digits are separated with -
	 * @return String value
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	static String getReferenceNumber(){
		return getRandomValue(4)+"-"+getRandomValue(4)+"-"+getRandomValue(4)+"-"+getRandomValue(4)
	}
	
	/**
	 * Generates randomValue from a predefined set of numbers 
	 * @param int length
	 * @return String values 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	static String getRandomValue(int length){
		String randomSet = "1234567890"
		Random random = new Random();
		StringBuffer value = new StringBuffer();
		for(int i = 0; i < length; i++){
			int pos = random.nextInt(randomSet.length());
			value.append(randomSet.charAt(pos));
		}
		return value.toString();
	}

	/**
	 * This function is used to parse string to long
	 * @param number string value to be converted to long
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	static long parseLong(String number, long defValue=0){
		try{
			return Long.parseLong(number)
		}catch(Exception e){
			return defValue
		}
	}
	
	/**
	 * Find minimum value from min, max and limit
	 * @param max maximum value
	 * @param min minimum value
	 * @param limit limit value
	 * @return integer value
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	static int validateMax(int max, int min=10, int limit=100){
		return Math.min(max?:min, limit)
	}

	/**
	 * Generate Random Values as per length supplied.
	 * @param length
	 * @return random alphanumeric values
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	static String getRandomValues(int length){
		String randomSet = "1abc2def3ghi4jkl5mn6op7qrs8tuvw9xyz0"
		Random random = new Random();
		StringBuffer value = new StringBuffer();
		for(int i = 0; i < length; i++){
			int pos = random.nextInt(randomSet.length());
			value.append(randomSet.charAt(pos));
		}
		return value.toString();
	}
}
