package com.app.dao;


import com.app.model.Point;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MarketRepository extends JpaRepository<Point, Long> {

}