package org.project.springbootproductmanagement.repositories;

@Repository
@Transactional
public interface EmployeeRepository  extends JpaRepository<Employee, Long>  ,JpaSpecificationExecutor<Employee>{

//
//	List<Employee> findEmployeeByEmployeeNameStartingWith(String name); // fetch list of Employee which start with
//    List<Employee> findEmployeeByEmployeeRole(String role);         // fetch Employee by role
//    List<Employee> findAll();                           // fetch all Employee

}