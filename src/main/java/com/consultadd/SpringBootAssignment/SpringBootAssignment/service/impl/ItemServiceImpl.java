package com.consultadd.SpringBootAssignment.SpringBootAssignment.service.impl;

import com.consultadd.SpringBootAssignment.SpringBootAssignment.model.Item;
import com.consultadd.SpringBootAssignment.SpringBootAssignment.repository.ItemRepository;
import com.consultadd.SpringBootAssignment.SpringBootAssignment.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private final ItemRepository itemRepository;


    public ItemServiceImpl(@Autowired ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    public Item updateItem(Long id, Item newItem) {
        return itemRepository.findById(id).map(item -> {
            item.setName(newItem.getName());
            item.setPrice(newItem.getPrice());
            return itemRepository.save(item);
        }).orElseThrow(() -> new RuntimeException("Item not found with id " + id));
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}