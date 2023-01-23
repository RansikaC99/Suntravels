package com.suntravels.accommodationbooking.repository;

import com.suntravels.accommodationbooking.dto.RoomDTO;
import com.suntravels.accommodationbooking.entity.ContractEntity;
import com.suntravels.accommodationbooking.entity.RoomEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface RoomRepository extends CrudRepository<RoomEntity, Long>
{
    @Query("SELECT r FROM RoomEntity r WHERE r.contract.startDate < :checkinDate AND r.contract.endDate > :checkinDate AND r.maxAdults >= :noAdults")
    List<RoomEntity> findRoomsbyAdults( @Param("checkinDate") LocalDate checkinDate, @Param("noAdults") Integer noAdults );
    List<RoomEntity> findByMaxAdultsGreaterThanEqualAndAvailableRoomsGreaterThanEqual( int maxAdults, int availableRooms );
}
