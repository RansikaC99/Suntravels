package com.suntravels.accommodationbooking.service;

import com.suntravels.accommodationbooking.dto.HotelDTO;
import com.suntravels.accommodationbooking.dto.RoomDTO;
import com.suntravels.accommodationbooking.entity.RoomEntity;

import java.time.LocalDate;
import java.util.List;

public interface RoomService
{
    RoomDTO saveRoom( RoomDTO roomDTO);
    List<RoomDTO> getAllRooms();
    List<RoomDTO> searchRooms( LocalDate checkinDate, int noAdults );
    List<RoomDTO> addRooms(List<RoomDTO> roomDTOList);

}
