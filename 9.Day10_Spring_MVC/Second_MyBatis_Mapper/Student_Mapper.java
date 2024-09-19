package mapper;
import java.util.List;

import mypack.Student;

import org.apache.ibatis.annotations.*;

public interface Student_Mapper
{
   final String insert = "INSERT INTO student VALUES (#{rollno},#{name}, #{age})";
   final String getAll="select * from student";
       
   @Insert(insert)
   void insert(Student student);
   
   @Select(getAll)
   @Results(value = {
      @Result(property = "rollno", column = "rollno"),
      @Result(property = "name", column = "name"),
      @Result(property = "age", column = "age"),
   })
   
   List<Student> getAll();
}
