package com.taoj.repository;

import com.taoj.entity.Happiness;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<Happiness, Integer> {

    Happiness findHappinessById(Integer id);

}
