package com.consultadd.SpringBootAssignment.SpringBootAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.consultadd.SpringBootAssignment.SpringBootAssignment.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
