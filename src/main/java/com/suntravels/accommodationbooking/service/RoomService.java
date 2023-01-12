package com.suntravels.accommodationbooking.service;

import com.suntravels.accommodationbooking.dto.HotelDTO;
import com.suntravels.accommodationbooking.dto.RoomDTO;

import java.util.List;

public interface RoomService
{
    RoomDTO saveRoom( RoomDTO roomDTO);
    List<RoomDTO> getAllRooms();
}
