package com.apps4society.turistandopb.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class TuristandoPBDto {
    
    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotBlank
    private String city;

    @NotBlank
    @Size(max = 2)
    private String state;

    private String imagemURL;

    private String latitude;

    private String longitude;

    private String time;
    
    @NotBlank
    private String type;

    @NotBlank
    private String moreInfo;

    @NotBlank
    private String category;
}
