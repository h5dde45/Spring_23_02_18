package dao.interfaces;

import entity.Employee;

import java.util.List;

public interface EmployeeDao {
    void add(Employee employee);

    List<Employee> getAll();

    Employee getById(int id);

    void update(Employee employee);

    void remove(Employee employee);
}
