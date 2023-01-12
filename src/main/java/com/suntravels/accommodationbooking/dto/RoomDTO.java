package com.suntravels.accommodationbooking.dto;

import com.suntravels.accommodationbooking.entity.ContractEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RoomDTO
{
    private Long id;
    private ContractDTO contract;
    private String roomType;
    private BigDecimal price;
    private Integer noOfRooms;
    private Integer availableRooms;
    private Integer maxAdults;
}
