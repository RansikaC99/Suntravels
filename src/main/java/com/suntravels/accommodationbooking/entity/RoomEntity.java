package com.suntravels.accommodationbooking.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="ROOM_TABLE")
@Getter
@Setter
@NoArgsConstructor
public class RoomEntity
{
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    @Column( name = "id", nullable = false )
    private Long id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "contract_id")
    private ContractEntity contract;
    private String roomType;
    private BigDecimal price;
    private Integer noOfRooms;
    private Integer availableRooms;
    private Integer maxAdults;

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }
}
