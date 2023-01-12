package com.suntravels.accommodationbooking.controller;

import com.suntravels.accommodationbooking.dto.HotelDTO;
import com.suntravels.accommodationbooking.dto.RoomDTO;
import com.suntravels.accommodationbooking.service.HotelService;
import com.suntravels.accommodationbooking.service.RoomService;
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
public class RoomController
{
    @Autowired
    private RoomService roomService;

    @PostMapping("/rooms")
    public ResponseEntity<RoomDTO> saveRoom( @RequestBody RoomDTO roomDTO){
        roomService.saveRoom( roomDTO );
        return new ResponseEntity<>(roomDTO, HttpStatus.CREATED );
    }

    @GetMapping("/rooms")
    public ResponseEntity<List<RoomDTO>> getAllRooms(){
        List<RoomDTO> roomList = roomService.getAllRooms();
        return new ResponseEntity<>(roomList, HttpStatus.OK );
    }
}
