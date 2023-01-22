package com.suntravels.accommodationbooking.repository;

import com.suntravels.accommodationbooking.entity.ContractEntity;
import com.suntravels.accommodationbooking.entity.RoomEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContractRepository extends CrudRepository<ContractEntity, Long>
{
    @Query("SELECT c FROM ContractEntity c JOIN c.hotel h WHERE h.name LIKE %:name%")
    List<ContractEntity> findByHotelName(@Param("name") String name);
}
