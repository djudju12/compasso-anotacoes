package demo.example.entity.repository;

import demo.example.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByName(String name);
    List<Student> findByNameAndEmail(String name, String email);
    List<Student> findByDepartmentDepartmentName(String departmentName);

}
