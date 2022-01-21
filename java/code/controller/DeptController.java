package code.controller;

import code.entity.Dept;
import code.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DeptController {

    @Autowired
    private DeptService service;

    @PostMapping("/add")
    public Dept add(@RequestBody Dept dept){
        return service.saveDept(dept);
    }

    @GetMapping("/{id}")
    public Dept getDept(@PathVariable int id){
        return service.findDept(id);
    }

    @DeleteMapping("/{id}")
    public void delDept(@PathVariable int id){
        service.deleteDept(id);
    }

}
