package com.workintech.fruitvegetable.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "fruit", schema = "spring")
public class Fruit extends Plant {

    @Enumerated(EnumType.STRING)
    @Column(name = "fruit_type")
    private FruitType type;
}
