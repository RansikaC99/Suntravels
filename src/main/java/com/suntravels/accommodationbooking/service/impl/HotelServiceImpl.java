package com.suntravels.accommodationbooking.service.impl;

import com.suntravels.accommodationbooking.dto.HotelDTO;
import com.suntravels.accommodationbooking.entity.HotelEntity;
import com.suntravels.accommodationbooking.repository.HotelRepository;
import com.suntravels.accommodationbooking.service.HotelService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService
{
    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public HotelDTO saveHotel( HotelDTO hotelDTO )
    {
        HotelEntity hotelEntity = modelMapper.map(hotelDTO, HotelEntity.class);
        hotelEntity = hotelRepository.save(hotelEntity);
        return modelMapper.map(hotelEntity, HotelDTO.class);
    }

    @Override
    public List<HotelDTO> getAllHotels()
    {
        List<HotelEntity> listOfHotels =  (List<HotelEntity>)hotelRepository.findAll();
        List<HotelDTO> hotelList = new ArrayList<>();
        for(HotelEntity he: listOfHotels){
            HotelDTO dto = modelMapper.map(he, HotelDTO.class);
            hotelList.add(dto);
        }
        return hotelList;
    }
}
