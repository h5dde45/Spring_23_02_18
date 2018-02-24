package service.interfaces;

import entity.Project;

import java.util.List;

public interface ProjectService {
    void add(Project project);

    List<Project> getAll();

    Project getByID(int id);

    void update(Project project);

    void remove(Project project);
}
