package dao.interfaces;

import entity.EmplProj;

import java.util.List;

public interface EmplProjDao {
    void add(EmplProj emplProj);

    List<EmplProj> getAll();

    EmplProj getByEmplIdAndProjId(int employeeId, int projectId);

    void update(EmplProj emplProj);

    void delete(EmplProj emplProj);
}
