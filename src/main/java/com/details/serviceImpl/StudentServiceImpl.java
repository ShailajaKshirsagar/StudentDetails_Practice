package com.details.serviceImpl;

import com.details.dto.StudentDto;
import com.details.dtoMapper.FemaleDtoMapper;
import com.details.dtoMapper.MaleDtoMapper;
import com.details.entity.FemaleStudent;
import com.details.entity.MaleStudent;
import com.details.repository.FemaleRepository;
import com.details.repository.MaleRepository;
import com.details.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService

{
    @Autowired
    private MaleRepository maleRepository;

    @Autowired
    private FemaleRepository femaleRepository;

    @Override
    public String saveStudent(StudentDto student) {

        if (student.getGender() == StudentDto.genderType.MALE) {

            MaleStudent male = MaleDtoMapper.toDto(student);
            maleRepository.save(male);
        } else {

            FemaleStudent female = FemaleDtoMapper.toDto(student);
            femaleRepository.save(female);
        }
        return "Student Saved";
    }
}
