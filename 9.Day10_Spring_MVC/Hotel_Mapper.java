package mapper;

import mypack.Customer;

import org.apache.ibatis.annotations.*;

public interface Customer_Mapper
{
   final String insert = "INSERT INTO customer VALUES (#{name},#{mobno},#{email},#{password})";
   final String getCredentials = "SELECT mobno,password FROM customer where mobno=#{mobno}";
   
    @Insert(insert)
	void insert(Customer customer);
    
    @Select(getCredentials)
    @Results(value = {
       @Result(property = "mobno", column = "mobno"),
       @Result(property = "password", column = "password"),
    })
    
     Customer getCredentials(Customer customer);
}
