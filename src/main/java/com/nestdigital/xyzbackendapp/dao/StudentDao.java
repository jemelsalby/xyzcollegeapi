package com.nestdigital.xyzbackendapp.dao;

import com.nestdigital.xyzbackendapp.model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {
}
