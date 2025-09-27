package com.details.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
//DTO
public class StudentDto {

        private String fName;
        private String lName;
        private String city;
        @Enumerated(EnumType.STRING)
        private genderType gender;

    public enum genderType{
        MALE,
        FEMALE
    }
}


