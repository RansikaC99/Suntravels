package com.suntravels.accommodationbooking.repository;

import com.suntravels.accommodationbooking.entity.HotelEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HotelRepository extends CrudRepository<HotelEntity, Long>
{
    @Query("SELECT h FROM HotelEntity h WHERE h.name LIKE %:name%")
    List<HotelEntity> findByName( @Param("name") String name);
}
