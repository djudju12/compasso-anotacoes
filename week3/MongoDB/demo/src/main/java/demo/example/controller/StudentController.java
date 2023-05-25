package demo.example.controller;

import demo.example.entity.Student;
import demo.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/getById/{id}")
    public Student createStudent(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable String id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @GetMapping("/studentByName/{name}")
    public List<Student> getStudentByName(@PathVariable String name) {
        return studentService.getStudentByName(name);
    }

    @GetMapping("/studentByNameAndEmail")
    public List<Student> getStudentByNameAndEmail(@RequestParam String name, @RequestParam String email) {
        return studentService.getStudentByNameAndEmail(name, email);
    }

    @GetMapping("/allWithPagination")
    public List<Student> getAllWithPagination(@RequestParam int pagNo, @RequestParam int pageSize) {
        return studentService.getAllWithPagination(pagNo, pageSize);
    }

    @GetMapping("/allWithSort")
    public List<Student> getAllWithSort() {
        return studentService.getAllWithSort();
    }

    @GetMapping("/ByDepartmentName")
    public List<Student> getByDepartmentName(@RequestParam String departmentName) {
        return studentService.getByDepartmentName(departmentName);
    }

}
