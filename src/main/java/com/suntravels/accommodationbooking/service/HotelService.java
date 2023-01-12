package com.suntravels.accommodationbooking.service;

import com.suntravels.accommodationbooking.dto.HotelDTO;

import java.util.List;

public interface HotelService
{
    HotelDTO saveHotel( HotelDTO hotelDTO);
    List<HotelDTO> getAllHotels();
}
