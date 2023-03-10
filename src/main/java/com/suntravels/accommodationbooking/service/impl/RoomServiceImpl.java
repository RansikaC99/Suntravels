package com.suntravels.accommodationbooking.service.impl;

import com.suntravels.accommodationbooking.dto.RoomDTO;
import com.suntravels.accommodationbooking.entity.RoomEntity;
import com.suntravels.accommodationbooking.repository.RoomRepository;
import com.suntravels.accommodationbooking.service.RoomService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService
{
    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public RoomDTO saveRoom( RoomDTO roomDTO )
    {
        RoomEntity roomEntity = modelMapper.map(roomDTO, RoomEntity.class);
        roomEntity = roomRepository.save( roomEntity );
        return modelMapper.map(roomEntity, RoomDTO.class);
    }

    @Override
    public List<RoomDTO> getAllRooms()
    {
        List<RoomEntity> listOfRooms =  (List<RoomEntity>)roomRepository.findAll();
        List<RoomDTO> roomList = new ArrayList<>();
        for(RoomEntity re: listOfRooms){
            RoomDTO dto = modelMapper.map(re, RoomDTO.class);
            roomList.add(dto);
        }
        return roomList;
    }

    @Override
    public List<RoomDTO> searchRooms( LocalDate checkinDate, int noAdults )
    {
        List<RoomEntity> roomEntities= roomRepository.findRoomsbyAdults( checkinDate, noAdults );
        List<RoomDTO> roomList = new ArrayList<>();
        for(RoomEntity re: roomEntities){
            RoomDTO dto = modelMapper.map(re, RoomDTO.class);
            roomList.add(dto);
        }
        return roomList;
    }

    @Override
    public List<RoomDTO> addRooms( List<RoomDTO> roomDTOList )
    {
        for(RoomDTO roomDTO: roomDTOList){
            RoomEntity roomEntity = modelMapper.map(roomDTO, RoomEntity.class);
            roomRepository.save( roomEntity );
        }
        return roomDTOList;
    }
}
