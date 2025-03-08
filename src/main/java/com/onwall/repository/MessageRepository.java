package com.onwall.repository;

import com.onwall.entity.Message;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

public interface MessageRepository extends CrudRepository<Message, Long>{

}
