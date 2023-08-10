package dao;

import pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有学生的信息
    public List<Student> getStudent();

    public List<Student> getStudent2();
}
