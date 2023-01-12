package com.suntravels.accommodationbooking.repository;

import com.suntravels.accommodationbooking.entity.HotelEntity;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepository extends CrudRepository<HotelEntity, Long>
{
}
