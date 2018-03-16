import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

class Student implements Comparable<Student>{
    int age;
String name;
 int address;
    public Student(int age, String name, int address) {
        super();
        this.age = age;
        this.name = name;
        this.address = address;
    }
    public Student() {
        super();
        this.age = age;
        this.name = name;
        this.address = address;
    }
    public int compareTo(Student st){  
        if(address==st.address)  
        return 0;  
        else if(address>st.address)  
        return -1;  
        else  
        return 1;  
        }  
}
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		Student s1 = new Student(11,"a",132);
		Student s2 = new Student(16,"b" ,177);
		Student s3 = new Student(14,"c",111);
		Student s4 = new Student(17,"d",135);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al);
		Iterator<Student >itr=al.iterator();

		Iterator<Student >itrlist=al.listIterator();



		while(itr.hasNext())

		{

		System.out.println(itr.next().address);

		System.out.println(" ");

		}
	}

}
