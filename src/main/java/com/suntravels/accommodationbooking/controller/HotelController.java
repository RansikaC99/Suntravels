package com.suntravels.accommodationbooking.controller;

import com.suntravels.accommodationbooking.dto.HotelDTO;
import com.suntravels.accommodationbooking.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HotelController
{
    @Autowired
    private HotelService hotelService;

    @PostMapping("/hotels")
    public ResponseEntity<HotelDTO> saveProperty( @RequestBody HotelDTO hotelDTO){
        hotelService.saveHotel( hotelDTO );
        return new ResponseEntity<>(hotelDTO, HttpStatus.CREATED );
    }

    @GetMapping("/hotels")
    public ResponseEntity<List<HotelDTO>> getAllProperties(){
        List<HotelDTO> hotelList = hotelService.getAllHotels();
        return new ResponseEntity<>(hotelList, HttpStatus.OK );
    }
}
