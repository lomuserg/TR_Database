package ru.podol.tr_database.repozitories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.podol.tr_database.models.Employee;

public interface EmployeeRepozitory extends JpaRepository<Employee,Long> {
}
