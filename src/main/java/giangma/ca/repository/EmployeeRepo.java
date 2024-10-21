package giangma.ca.repository;

import giangma.ca.beans.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    ArrayList<Employee> findAllEmployee();
}