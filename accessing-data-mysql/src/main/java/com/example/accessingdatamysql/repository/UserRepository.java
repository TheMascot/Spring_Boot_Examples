package com.example.accessingdatamysql.repository;

import com.example.accessingdatamysql.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Integer> {
}
