package com.details.repository;

import com.details.entity.MaleStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaleRepository extends JpaRepository<MaleStudent,Integer> {
}
