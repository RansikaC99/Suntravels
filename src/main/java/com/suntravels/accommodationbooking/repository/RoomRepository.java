package com.suntravels.accommodationbooking.repository;

import com.suntravels.accommodationbooking.entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<RoomEntity, Long>
{
}
