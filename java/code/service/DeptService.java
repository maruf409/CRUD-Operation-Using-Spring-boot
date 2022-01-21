package code.service;

import code.entity.Dept;
import code.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {

    @Autowired
    private DeptRepository repository;

    public Dept saveDept(Dept dept){
        return repository.save(dept);
    }

    public Dept findDept(int id){
        return repository.findById(id).get();
    }

    public void deleteDept(int id){
        repository.deleteById(id);
    }


}
