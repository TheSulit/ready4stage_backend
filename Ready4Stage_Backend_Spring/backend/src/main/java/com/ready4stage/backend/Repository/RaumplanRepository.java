package com.ready4stage.backend.Repository;

import com.ready4stage.backend.Entity.RaumplanModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaumplanRepository extends JpaRepository<RaumplanModel, Integer>{
    
}