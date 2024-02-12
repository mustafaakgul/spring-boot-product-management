package org.project.springbootproductmanagement.services.impl;

@Service
public class EmployeesService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> findByCriteria(String employeeName){
        return employeeRepository.findAll(new Specification<Employee>() {
            public Predicate toPredicate(Root<Employee> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if(employeeName!=null) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("employeeName"), employeeName)));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        });
    }


    //	public List<Employee> getDeptEmps (long deptId){
//
//	return	employeeRepository.findByDepartmentId(deptId);
//
//	}
//
    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    public Employee getEmpById(long id) {

        return employeeRepository.findById(id).orElseThrow(()->  new RecordNotFoundException("this employee not found :- " + id ));
    }

//	public List<Employee> getEmpByFirstName(String firstName) {
//
//		return employeeRepository.findByfirstNameIgnoreCase(firstName);
//	}
//
//	public List<Employee> getEmpSearch(String firstName, String lastName) {
//
//		return employeeRepository.empSearch(firstName, lastName);
//	}

    public void addEmp(Employee newEmp) {
        employeeRepository.save(newEmp);
    }

    public void aupdateEmp(Employee newEmp) {
        employeeRepository.save(newEmp);
    }

    public void deleteEmp (long id) {

        employeeRepository.deleteById(id);
    }
}
