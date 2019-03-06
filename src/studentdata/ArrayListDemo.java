package studentdata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Student s1=new Student();
	        Student s2=new Student();
	        Student s3=new Student();
	        
	    ArrayList<Student> ar=new ArrayList<Student>();    
	    ar.add(s1);
	    ar.add(s2);
	    ar.add(s3);
	    
//	    ArrayList<Integer> ar1=new ArrayList<Integer>();    
//	    ar1.add(3);
//	    ar1.add(1);
//	    ar1.add(5);
//	    ar1.add(0);
	//    
//	    System.out.println(ar1);
	    
	  NameComparator m=new NameComparator();
	  Collections.sort(ar,m);
	    for(Student s:ar)
	    System.out.println(s.getRoll_no()+" "+s.getName()+" "+s.getMarks());    
	        
	    }
	}
	


