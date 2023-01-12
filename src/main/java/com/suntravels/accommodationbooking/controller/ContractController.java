package com.suntravels.accommodationbooking.controller;

import com.suntravels.accommodationbooking.dto.ContractDTO;
import com.suntravels.accommodationbooking.dto.HotelDTO;
import com.suntravels.accommodationbooking.service.ContractService;
import com.suntravels.accommodationbooking.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ContractController
{
    @Autowired
    private ContractService contractService;

    @PostMapping("/contracts")
    public ResponseEntity<ContractDTO> saveContract( @RequestBody ContractDTO contractDTO){
        contractService.saveContract( contractDTO );
        return new ResponseEntity<>(contractDTO, HttpStatus.CREATED );
    }

    @GetMapping("/contracts")
    public ResponseEntity<List<ContractDTO>> getAllContracts(){
        List<ContractDTO> contractList = contractService.getAllContracts();
        return new ResponseEntity<>(contractList, HttpStatus.OK );
    }

    @DeleteMapping("/contracts/{contractId}")
    public ResponseEntity<ContractDTO> deleteContract(@PathVariable Long contractId){
        contractService.deleteContract( contractId );
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT );
    }
}
