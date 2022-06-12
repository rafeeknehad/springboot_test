package com.example.demo.repo;

import com.example.demo.entity.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipRepository extends JpaRepository<Ship,Long> {
}
