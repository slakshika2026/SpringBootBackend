package org.example.demonew.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")

public class StudentController {
    @GetMapping

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Sanduni",
                        25,
                        LocalDate.of(2000, Month.MARCH,26),
                        "sandu@abc.com"

                )
        );
    }
}
