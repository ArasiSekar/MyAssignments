package week3.day2;

public class Automation extends MultipleLangauge implements Language,TestTool {

	/*
	 * 1. created Automation class as Execution class
	 * 2. All the method will be called or executed from this class
	 */
	public static void main(String[] args) {
		//Object created for Automation class and called all the methods
		Automation object = new Automation();
		object.java();
		object.Selenium();
		object.python();
		object.ruby();
		
	}
    /*
     * As Automation class implements the Interface TestTool
     * All the unimplemented will be implemented here
     */
	public void Selenium() {
		// TODO Auto-generated method stub
		
		System.out.println("From TestTool Interface--> Implemented in Automation class");
		
	}
	/*
     * As Automation class implements the Interface Language
     * All the unimplemented will be implemented here
     */
	public void java() {
		// TODO Auto-generated method stub
		
		System.out.println("From Language Interface--> Implemented in Automation Class");
		
	}
    
	 /*As the Automation class extends the MultipleLanguage abstract class,it implemented the
	   unimplemented abstract method in the Automation class.*/
	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		
		System.out.println("From Abstract Class--> Abstract Method--> Implemented in Automation class");
		
	}

}
