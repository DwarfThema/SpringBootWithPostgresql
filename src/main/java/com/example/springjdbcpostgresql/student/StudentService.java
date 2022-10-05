package com.example.springjdbcpostgresql.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service //해당 클래스가 Service클래스 라고 알려줘야지 더욱 정확하게 인식함
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Junho",
                        "dwarfthema@gmail.com",
                        LocalDate.of (2000, Month.JANUARY, 5),
                        21
                )
        );
    }
}
