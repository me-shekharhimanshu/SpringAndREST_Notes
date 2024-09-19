package mapper;

import mypack.Hotel;
import java.util.List;
import org.apache.ibatis.annotations.*;

public interface Hotel_Mapper
{
   final String getHotel = "SELECT hotelid,state,city,area FROM hotel where state=#{state} AND city=#{city} AND area=#{area}"; 
   
    
    @Select(getHotel)
    @Results(value = {
       @Result(property = "hotelid", column = "hotelid"),
       @Result(property = "state", column = "state"),
       @Result(property = "city", column = "city"),
       @Result(property = "area", column = "area"),
    })
    
//     List<Hotel> getHotel(Hotel ref);
    List<Hotel> getHotel(Hotel h);
}
