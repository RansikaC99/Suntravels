package com.suntravels.accommodationbooking.dto;

import com.suntravels.accommodationbooking.entity.ContractEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
public class HotelDTO
{
    private Long id;
    private String name;
    private String location;
    private String contactNumber;
}
