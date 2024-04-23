package com.task.db.connection.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.db.connection.model.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Integer>{
	
	// Custom query method to fetch objects by parent ID
    List<Data> findByParentId(Long parentId);

}
