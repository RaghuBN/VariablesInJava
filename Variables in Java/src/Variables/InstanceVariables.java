package Variables;

public class InstanceVariables {
	public int rollNum;
	public String name;
	public int totalMarks;
	public int number;
	
    //instance variable is declared inside the class but outside the body of the  main method
	
	public static void main(String[] args) 
	{
		InstanceVariables obj = new InstanceVariables();
		obj .rollNum = 1000001;
		obj .name = "Test engineer";
		obj .totalMarks = 510;
		obj.number = 1234567890;
		
		// printing the created objects
		System.out.println(obj .rollNum);
		System.out.println(obj .name);
		System.out.println(obj .totalMarks);
		System.out.println(obj .number);
	}
}
