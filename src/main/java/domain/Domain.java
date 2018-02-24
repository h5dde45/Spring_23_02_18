package domain;

import bl.HibernateUtil;
import entity.Address;
import entity.Employee;
import entity.Project;
import org.hibernate.Session;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Domain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Address address = new Address();
        address.setCountry("Country1");
        address.setCity("City1");
        address.setStreet("Street1");
        address.setPostCode("123");

        Employee employee = new Employee();
        employee.setFirstName("first1");
        employee.setLastName("last1");

        Calendar calendar = Calendar.getInstance();
        calendar.set(1997,Calendar.APRIL,4);

        employee.setBirthday(new Date(calendar.getTime().getTime()));
        employee.setAddress(address);

        Project project = new Project();
        project.setTitle("title1");

        Set<Project> projects=new HashSet<>();
        projects.add(project);
        employee.setProjects(projects);

        session.save(address);
        session.save(employee);
        session.save(project);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
