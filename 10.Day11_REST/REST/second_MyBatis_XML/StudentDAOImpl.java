package mypack;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDAOImpl implements StudentDAO 
{
@Autowired
SqlSessionTemplate template;
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return template.selectList("Student.getAll");
		
	}

}










