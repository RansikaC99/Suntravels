package com.suntravels.accommodationbooking.service.impl;

import com.suntravels.accommodationbooking.dto.ContractDTO;
import com.suntravels.accommodationbooking.entity.ContractEntity;
import com.suntravels.accommodationbooking.repository.ContractRepository;
import com.suntravels.accommodationbooking.service.ContractService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractServiceImpl implements ContractService
{
    @Autowired
    private ContractRepository contractRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public ContractDTO saveContract( ContractDTO contractDTO )
    {
        ContractEntity contractEntity = modelMapper.map(contractDTO, ContractEntity.class);
        contractEntity = contractRepository.save(contractEntity);
        return modelMapper.map(contractEntity, ContractDTO.class);
    }

    @Override
    public List<ContractDTO> getAllContracts()
    {
        List<ContractEntity> listOfContracts =  (List<ContractEntity>)contractRepository.findAll();
        List<ContractDTO> contractList = new ArrayList<>();
        for(ContractEntity ce: listOfContracts){
            ContractDTO dto = modelMapper.map(ce, ContractDTO.class);
            contractList.add(dto);
        }
        return contractList;
    }

    @Override
    public List<ContractDTO> searchByHotelName( String name) {
        List<ContractEntity> contractEntities= contractRepository.findByHotelName(name);
        List<ContractDTO> contractList = new ArrayList<>();
        for(ContractEntity ce: contractEntities){
            ContractDTO dto = modelMapper.map(ce, ContractDTO.class);
            contractList.add(dto);
        }
        return contractList;
    }


    @Override
    public void deleteContract( Long contractId )
    {
        contractRepository.deleteById( contractId );
    }

}
