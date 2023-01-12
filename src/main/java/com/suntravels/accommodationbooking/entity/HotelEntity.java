package com.suntravels.accommodationbooking.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Table(name="HOTEL_TABLE")
@Getter
@Setter
@NoArgsConstructor
public class HotelEntity
{
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    @Column( name = "id", nullable = false )
    private Long id;
    private String name;
    private String location;
    private String contactNumber;

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }
}
