package org.example.demonew.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
   public List<Student> getStudents() {
      return List.of(
            new Student(
               
                  1L,
                  "Sanduni",
                  25,
                  LocalDate.of(2000, Month.MARCH, 26),
                  "sandu@abc.com"

         