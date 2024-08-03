package com.employee.employee_entry.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="mission")
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mission_id",nullable = false , unique = true)
    private Integer missionId;
    @Column(name="mission_name")
    private String missionName;
    @Column(name = "duration")
    private int duration;

    @ManyToMany(mappedBy = "missions")
    private List<Employee> employees;
}
