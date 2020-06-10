package com.h2.jpa;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
import com.h2.jpa.Student;
 
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
 
}