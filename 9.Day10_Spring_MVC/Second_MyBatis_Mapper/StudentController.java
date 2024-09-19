package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController 
{
	@Autowired
	StudentDAO sdao;
	@RequestMapping(value="/new_student",method = RequestMethod.GET)
	public ModelAndView before()
	{
		Student s=new Student();
		return new ModelAndView("stud","mystudent",s);
	}
	@RequestMapping(method = RequestMethod.POST)
	public String afterSubmit(Student student)
	{
		sdao.add(student);
		return "success";
	}
	@RequestMapping(value="/list_students")
	public ModelAndView show()
	{
		List<Student> mylist=sdao.viewAll();
		return new ModelAndView("view","mylist",mylist);
	}
	
}











