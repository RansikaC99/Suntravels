package com.suntravels.accommodationbooking.repository;

import com.suntravels.accommodationbooking.dto.RoomDTO;
import com.suntravels.accommodationbooking.entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomRepository extends CrudRepository<RoomEntity, Long>
{
    List<RoomEntity> findByMaxAdultsGreaterThanEqualAndAvailableRoomsGreaterThanEqual( int maxAdults, int availableRooms );
}
