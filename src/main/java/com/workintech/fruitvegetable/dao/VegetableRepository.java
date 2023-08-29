package com.workintech.fruitvegetable.dao;

import com.workintech.fruitvegetable.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable,Integer> {
    @Query("SELECT v FROM Vegetable v ORDER BY v.price desc")
    List<Vegetable> getByPriceDesc();

    @Query("SELECT v FROM Vegetable v ORDER BY v.price asc")
    List<Vegetable> getByPriceAsc();

    @Query("SELECT v FROM Vegetable v WHERE v.name ilike %:name%")
    List<Vegetable> searchByName(String name);
}
