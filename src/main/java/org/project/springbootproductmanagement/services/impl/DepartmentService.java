package org.project.springbootproductmanagement.services.impl;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository deptReps;

    public List<Department> getAllDepts() {

        return deptReps.findAll();
    }

    public Department getDeptById(long id) {

        return deptReps.findById(id).orElse(null);
    }

    public void addDept(Department newDept) {
        deptReps.save(newDept);
    }

    public void updateDept(Department newDept) {
        deptReps.save(newDept);
    }

    public void deleteDept (long id) {

        deptReps.deleteById(id);
    }



}