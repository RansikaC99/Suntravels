package com.suntravels.accommodationbooking.dto;

import com.suntravels.accommodationbooking.entity.HotelEntity;
import com.suntravels.accommodationbooking.entity.RoomEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class ContractDTO
{
    private Long id;
    private HotelDTO hotel;
    private LocalDate startDate;
    private LocalDate endDate;
}
