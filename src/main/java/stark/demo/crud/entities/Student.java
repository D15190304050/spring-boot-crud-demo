package stark.demo.crud.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Student
{
    private long id;
    private String name;
    private Date birthday;
}
