package stark.demo.crud.dto;

import lombok.Data;

import java.util.Date;

@Data
public class StudentDto
{
    private long id;
    private String name;
    private Date birthday;
}
