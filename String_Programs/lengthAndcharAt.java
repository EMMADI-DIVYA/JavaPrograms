package javaprogramstudyhour;

public class lengthAndcharAt {
	
	    
	    public static int getLength(String str)
	    {
	        return str.split("").length;
	    }

	    public static char getCharAt(String str, int index) {
	    	
	        String[] chars = str.split("");
	        
	        return chars[index].charAt(0);
	        
	    }

	    public static void main(String[] args) {
	        String str = "Hello";
	        System.out.println("Length: " + getLength(str)); 
	        System.out.println("CharAt(1): " + getCharAt(str, 1)); 
	    }
	}



