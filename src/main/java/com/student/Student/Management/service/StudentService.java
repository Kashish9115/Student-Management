package com.student.Student.Management.service;

import com.student.Student.Management.entity.Studententity;
import com.student.Student.Management.repo.studentrepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Slf4j
@Service
public class StudentService {

    @Autowired
    private studentrepo studentrepo;


    //get all student
    public List<Studententity> getAllStudent(){
        return studentrepo.findAll();
    }



    //post student
public void postStudent(Studententity studententity){
        studentrepo.save(studententity);
}


//get student by id
    public Optional<Studententity> getById(String myId){
         return studentrepo.findById(myId);
    }

    //delete student entry by id

    public boolean deleteById(String myId){
        studentrepo.deleteById(myId);
        return true;
    }
    //update by id
    public Studententity updateStudent(String id, Studententity updated) throws Exception {
        return studentrepo.findById(id).map(existing -> {
            existing.setFirstName(updated.getFirstName());
            existing.setLastName(updated.getLastName());
            existing.setEmail(updated.getEmail());
            existing.setGender(updated.getGender());
            existing.setStandard(updated.getStandard());
            return studentrepo.save(existing);
        }).orElseThrow(() -> new Exception("Student not found with id: " + id));
    }


}
