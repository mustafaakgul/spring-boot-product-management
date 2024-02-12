package org.project.springbootproductmanagement.controllers;


@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

    @Autowired
    private DepartmentService deptService ;

    @GetMapping("/departments")
    public List<Department> getAllDept (){

        return deptService.getAllDepts();
    }

    @GetMapping("/getdeptbyid")
    public Department getDeptById (@RequestParam long id){

        return deptService.getDeptById(id);
    }




    @PostMapping("/departments")
    public String addDept (@RequestBody Department newDept) {

        deptService.addDept(newDept);

        return "saved successfully" ;

    }


    @PutMapping("/departments")
    public String updateDept (@RequestBody Department newDept) {

        deptService.updateDept(newDept);

        return "update successfully" ;

    }

    @DeleteMapping("/departments")
    public String deleteDept (@RequestParam long id) {
        deptService.deleteDept(id);
        return "Delete Successfully";
    }

}
