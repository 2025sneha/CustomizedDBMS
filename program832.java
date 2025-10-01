//////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program832.java
//	 Description :	    Used to store numbers in liked list 
//   Author :           Sneha Mohane
//   Date :             19/09/2025                 
//
////////////////////////////////////////////////////////////////////////////////////

class Employee
{
    public int EmpID;
    public String EmpName;
    public int EmoAge;
    public String EmpAddress;
    public int EmpSalary;
   

    public Employee(
                        int a, 
                        String b, 
                        int c, 
                        String d, 
                        int e
                   )
    {
        this.EmpID = a;
        this.EmpName = b;
        this.EmoAge = c;
        this.EmpAddress = d;
        this.EmpSalary = e;
    }

}

class program832
{
    public static void main(String A[])
    {
       Employee eobj = new Employee(11,"Amit",23,"Pune",21000);

       System.out.println(eobj);

    }
}