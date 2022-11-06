package week2.day4.polymorphism;

public class Students {
/*
 * Method OverLoading Concept
 * Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, 
by id & 
by name, 
by email & phoneNumber

 */
   
	public void getStudentInfo(int rollno,int collegeCode)
	{
		System.out.println("roll no:"+rollno);
		System.out.println("college code:"+collegeCode);
	}
	
	public void getStudentInfo(String studName,int collegeCode)
	{
		System.out.println("StudentName:"+studName);
		System.out.println("college code:"+collegeCode);
	}
	
	public String getStudentInfo(String studEmail)
	{
		return studEmail;
	}
	
	public int getStudentInfo(int phoneNum)
	{
		return phoneNum;
	}
	public float getStudentInfo(float studPercent)
	{
		return studPercent;
		
	}
	
	public static void main(String[] args) {
		Students studObj = new Students();
		//Calling getStudentInfo(int rollno,int collegeCode)
		studObj.getStudentInfo(32, 12345);
		
		//Calling getStudentInfo(String studName,int collegeCode)
		studObj.getStudentInfo("Arasi", 12345);
		
		//Calling String getStudentInfo(String studEmail)
		String studEmail= studObj.getStudentInfo("abc@gmail.com");
		System.out.println("Student Email: "+studEmail);
		
		//Calling int getStudentInfo(int phoneNum)
		int studPhone = studObj.getStudentInfo(234567890);
		System.out.println("Student Phone: "+studPhone);
		
		//Calling float getStudentInfo(float studPercent)
		float studMark = studObj.getStudentInfo(8.9f);
		System.out.println("Student Percentage:"+studMark);
		

	}

}
