package com.student.Student.Management.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexOptions;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Document(collection = "student")
public class Studententity {


    @Id
    private String id;
   private String firstName;
    private String lastName;
   private String email;
   private String address;
   private Gender gender;
   private String standard;



}
