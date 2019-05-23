package midterm1;
//*Write MINIMAL code
//Define a Minimal FriedEggException
class FriedEggException extends Exception{
	
}
class TryCatch{
	//Write a very short method that will always raise a FriedEggException
	public void throwFEE() throws FriedEggException{
		throw new FriedEggException();
	}
	public static void main(String[] args) {
		//Call the method you have created, and write code to handle the exception by printing it (or the stack)
		try {
			TryCatch tc = new TryCatch();
			tc.throwFEE();
		}
		catch(FriedEggException e) {
			System.out.println(e);
		}
		//Draw a diagram that represents the hierarchy of [Error, Object, Throwable, Exception, RuntimeException]
		/*
		 * 		Object
		 * 		Throwable
		 * Error		Exception
		 * 						RuntimeException 
		 * 
		 */
		
	}
}


