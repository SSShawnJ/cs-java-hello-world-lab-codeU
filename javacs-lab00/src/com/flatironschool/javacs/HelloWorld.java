package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
		 String version=System.getProperty("java.version").substring(0, 3);
		 return Double.parseDouble(version);
	        
	    }

	    public static void main(String[] args) {
		    // you can test the output of getVersion() here
	    	System.out.println(getVersion());
	    }

}
