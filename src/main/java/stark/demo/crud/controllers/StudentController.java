package stark.demo.crud.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import stark.demo.crud.dao.StudentMapper;
import stark.demo.crud.dto.PaginationRequest;
import stark.demo.crud.dto.ServiceResponse;
import stark.demo.crud.dto.StudentDto;
import stark.demo.crud.entities.Student;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/students")
public class StudentController
{
    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/all")
    public ServiceResponse<List<Student>> getAllStudents(@ModelAttribute PaginationRequest request)
    {
        List<Student> students = studentMapper.getAllStudents(request.getPageSize(), (request.getPageIndex() - 1) * request.getPageSize());
        ServiceResponse<List<Student>> response = ServiceResponse.buildSuccessResponse(students);
        response.putExtra("size", students.size());

        return response;
    }

    @GetMapping("/get")
    public ServiceResponse<Student> getStudentById(@RequestParam("id") long id)
    {
        Student student = studentMapper.getStudentById(id);
        return ServiceResponse.buildSuccessResponse(student);
    }

    @PostMapping("/update")
    public ServiceResponse<Long> updateStudentById(@RequestBody StudentDto studentDto)
    {
        long l = studentMapper.updateById(studentDto);
        return ServiceResponse.buildSuccessResponse(l);
    }
}
