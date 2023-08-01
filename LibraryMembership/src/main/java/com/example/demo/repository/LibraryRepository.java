package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Member;
@Repository	
public interface LibraryRepository extends MongoRepository<Member, Integer> {

	//Department findByName(String deptName);
	//public <S extends Member>S save(S entity);

}
