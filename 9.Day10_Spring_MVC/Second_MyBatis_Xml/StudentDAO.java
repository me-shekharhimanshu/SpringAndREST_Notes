package mypack;

import java.util.List;

public interface StudentDAO 
{
	void add(Student ref);
	List<Student> viewAll();
}
