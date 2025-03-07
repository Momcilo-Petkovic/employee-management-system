package net.javaguides.ems_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
    @Column(name = "department_name")
 private String departmentName;
    @Column(name = "department_description")
 private String departmentDescription;

    public void setId(Long id) {
        this.id = id;
    }

    public Department(Long id, String departmentName, String deprtmentDescription) {
        this.id = id;
        this.departmentName = departmentName;
        this.departmentDescription = deprtmentDescription;
    }

    public Department() {
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public Long getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }
}
