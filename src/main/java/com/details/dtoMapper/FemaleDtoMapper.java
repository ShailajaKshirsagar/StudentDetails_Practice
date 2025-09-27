package com.details.dtoMapper;

import com.details.dto.StudentDto;
import com.details.entity.FemaleStudent;
import com.details.entity.MaleStudent;

public class FemaleDtoMapper
{
    public static FemaleStudent toDto(StudentDto dto) {
        return FemaleStudent.builder()
                .fname(dto.getFName())
                .lname(dto.getLName())
                .city(dto.getCity())
                .build();
    }
}
