package exceptionhandling;

//A Class that represents use-defined expception 
 class MyException extends Exception 
{ 
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String s) 
	{ 
		// Call constructor of parent Exception 
		super(s); 
	} 
} 

