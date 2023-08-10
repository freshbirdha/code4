import dao.StudentMapper;
import dao.TeacherMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.Student;
import pojo.Teacher;
import utils.MybatisUtils;

import java.util.List;

public class Test {
    @org.junit.Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);


        sqlSession.close();
    }

    @org.junit.Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }


        sqlSession.close();
    }


    @org.junit.Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();
        for (Student student : studentList) {
            System.out.println(student);
        }


        sqlSession.close();
    }
}
