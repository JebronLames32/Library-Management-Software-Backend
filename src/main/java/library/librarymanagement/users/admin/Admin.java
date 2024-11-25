package library.librarymanagement.users.admin;

import jakarta.persistence.*;
import library.librarymanagement.users.common.Role;
import library.librarymanagement.users.User;

@Entity
@Table(name = "admins")
public class Admin extends User {

    @Column(nullable = false)
    private String department;

    @Column(nullable = true)
    private String designation;

    // Constructors
    public Admin() {
    }

    public Admin(String name, String email, String password, String department, String designation) {
        super(name, email, password, Role.ADMIN);
        this.department = department;
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}