package com.suntravels.accommodationbooking.service;

import com.suntravels.accommodationbooking.dto.ContractDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ContractService
{
    ContractDTO saveContract( ContractDTO contractDTO);
    List<ContractDTO> getAllContracts();
    void deleteContract(Long contractId);

}
