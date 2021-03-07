package com.ordenada.chickens.chicken;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChickenRepository
        extends JpaRepository<Chicken, Long> {
}
