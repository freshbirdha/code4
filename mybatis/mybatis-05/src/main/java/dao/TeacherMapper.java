package dao;


import org.apache.ibatis.annotations.Param;
import pojo.Teacher;

import java.util.List;

public interface TeacherMapper {

 // List<Teacher> getTeacher();


  Teacher getTeacher(@Param("tid") int id); //获取指定老师下的所有学生及老师的信息

}
