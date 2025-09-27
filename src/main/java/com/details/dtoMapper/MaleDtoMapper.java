package com.details.dtoMapper;

import com.details.dto.StudentDto;
import com.details.entity.MaleStudent;

public class MaleDtoMapper
{
    public static MaleStudent toDto(StudentDto dto) {
        return MaleStudent.builder()
                .fname(dto.getFName())
                .lname(dto.getLName())
                .city(dto.getCity())
                .build();
    }
}
