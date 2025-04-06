package com.consultadd.SpringBootAssignment.SpringBootAssignment.service;

import com.consultadd.SpringBootAssignment.SpringBootAssignment.model.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<Item> getAllItems();

    Optional<Item> getItemById(Long id);

    Item createItem(Item item);

    Item updateItem(Long id, Item newItem);

    void deleteItem(Long id);
}
