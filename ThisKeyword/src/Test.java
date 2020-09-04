
public class Test 
{
	static int i = 10;   
    public Test ()  
    {  
    	
        System.out.println(this.i);     
        System.out.println("Enter to  Constructor");
    }  
    public Test(int i)
    {
    	this();
    	System.out.println("Enter to reference Constructor");
    }
    public static void main (String args[])  
    {  
        Test t = new Test(20);  
    }  
}
