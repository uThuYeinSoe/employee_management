package com.employee.employee_entry.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer employee_id;

    @Column(
            nullable = false,
            unique = true
    )
    private String identifier;
    @Column(
            name="first_name",
            nullable = false
    )
    private String firstName;
    @Column(
            name="last_name",
            nullable = false
    )
    private String lastName;
    @Column(
            nullable = false,
            unique = true
    )
    private String email;
    @Column(
            name="birth_date",
            nullable = false
    )
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column(
            nullable = false
    )
    private EmployeeRole role;

    @OneToOne
    @JoinColumn(name="address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToMany
    @JoinTable(
            name = "employee_mission",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "mission_id")
    )
    private List<Mission> missions;
}
