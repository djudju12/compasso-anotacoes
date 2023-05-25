package demo.example.service;

import demo.example.entity.Student;
import demo.example.entity.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void deleteStudent(String id){
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Student Student){
        return studentRepository.save(Student);
    }

    public List<Student> getStudentByName(String name){
        return studentRepository.findByName(name);
    }

    public List<Student> getStudentByNameAndEmail(String name, String email){
        return studentRepository.findByNameAndEmail(name, email);
    }

    public List<Student> getAllWithPagination(int pageNro, int pageSize){
        Pageable pageable = PageRequest.of((pageNro - 1), pageSize);

        return studentRepository.findAll(pageable).getContent();
    }

    public List<Student> getAllWithSort() {
        Sort sort = Sort.by(Sort.Direction.ASC, "name");

        return studentRepository.findAll(sort);
    }

    public List<Student> getByDepartmentName(String departmentName) {
        return studentRepository.findByDepartmentDepartmentName(departmentName);
    }

}
