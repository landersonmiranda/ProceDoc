package com.land.procedoc_auth.repositories;

import com.land.procedoc_auth.domain.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

}

