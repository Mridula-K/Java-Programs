package Assignment;

import java.util.HashMap;

public class HmStudentEx
{
public static void main(String[] args) 
{
HashMap<Integer, Student> s=new HashMap<Integer, Student>()	;
s.put(1,new Student("Agatha",95.52));
s.put(2,new Student("bani",58.65));
s.put(3,new Student("Manasa",99.25));
s.put(4,new Student("sai",100));
s.put(5, new Student("Durga",65.24));
System.out.println("The Student Details are: "+ s.entrySet());
System.out.println("The keys are "+s.keySet());
System.out.println("The values are "+s.values());
}
}
