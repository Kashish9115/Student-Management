package com.student.Student.Management.repo;

import com.student.Student.Management.entity.Studententity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface studentrepo extends MongoRepository<Studententity,String> {
}
