package stark.demo.crud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import stark.demo.crud.dto.StudentDto;
import stark.demo.crud.entities.Student;

import java.util.List;

@Mapper
public interface StudentMapper
{
    List<Student> getAllStudents(@Param("limit") long limit, @Param("offset") long offset);
    Student getStudentById(long id);
    long updateById(StudentDto student);
}
