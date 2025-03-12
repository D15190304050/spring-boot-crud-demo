package stark.demo.crud.dao;

import org.apache.ibatis.annotations.Mapper;
import stark.demo.crud.dto.StudentDto;
import stark.demo.crud.entities.Student;

import java.util.List;

@Mapper
public interface StudentMapper
{
    List<Student> getAllStudents();
    Student getStudentById(long id);
    long updateById(StudentDto student);
}
