package com.example.springdatajpatutorial.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
private Long studentId;
private String lastName;
private String firstName;
private String emailId;
private String guardianName;
private String gurdianEmail;
private String gurdianMobile;


}
