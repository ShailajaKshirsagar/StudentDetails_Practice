package com.details.repository;

import com.details.entity.FemaleStudent;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FemaleRepository extends JpaRepository<FemaleStudent,Integer> {
}
