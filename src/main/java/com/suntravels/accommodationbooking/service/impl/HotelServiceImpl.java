package com.suntravels.accommodationbooking.service.impl;

import com.suntravels.accommodationbooking.dto.ContractDTO;
import com.suntravels.accommodationbooking.dto.HotelDTO;
import com.suntravels.accommodationbooking.entity.ContractEntity;
import com.suntravels.accommodationbooking.entity.HotelEntity;
import com.suntravels.accommodationbooking.repository.HotelRepository;
import com.suntravels.accommodationbooking.service.HotelService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public HotelDTO getHotelById( Long hotelId )
    {
        Optional<HotelEntity> hotelEntity = hotelRepository.findById(hotelId);
        HotelDTO hotelDTO = modelMapper.map(hotelEntity, HotelDTO.class);
        return hotelDTO;
    }

    @Override
    public List<HotelDTO> findByName( String name )
    {
        List<HotelEntity> hotelEntities= hotelRepository.findByName( name );
        List<HotelDTO> hotelList = new ArrayList<>();
        for(HotelEntity he: hotelEntities){
            HotelDTO dto = modelMapper.map(he, HotelDTO.class);
            hotelList.add(dto);
        }
        return hotelList;
    }
}
