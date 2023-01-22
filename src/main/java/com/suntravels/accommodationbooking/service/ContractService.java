package com.suntravels.accommodationbooking.service;

import com.suntravels.accommodationbooking.dto.ContractDTO;

import java.util.List;

public interface ContractService
{
    ContractDTO saveContract( ContractDTO contractDTO);
    List<ContractDTO> getAllContracts();
    List<ContractDTO> searchByHotelName( String name);
    void deleteContract(Long contractId);

}
