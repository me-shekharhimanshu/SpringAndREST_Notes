package mypack;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mapper.Student_Mapper;

@Component
public class StudentDAOImpl implements StudentDAO 
{
	@Autowired
	private Student_Mapper mapper;
	
	
	@Override
	public void add(Student ref) 
	{
		mapper.insert(ref);
	}


	@Override
	public List<Student> viewAll()
	 {
		
		return mapper.getAll();
	}

}







