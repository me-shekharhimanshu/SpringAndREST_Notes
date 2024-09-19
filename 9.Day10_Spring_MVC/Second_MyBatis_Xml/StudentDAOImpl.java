package mypack;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class StudentDAOImpl implements StudentDAO 
{
	@Autowired
	private SqlSessionTemplate template;
	
	
	@Override
	public void add(Student ref) 
	{
		template.insert("Student.insert",ref);
	}


	@Override
	public List<Student> viewAll() {
		// TODO Auto-generated method stub
		return template.selectList("Student.getAll");
	}

}







