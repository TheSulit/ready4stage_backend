package com.ready4stage.backend.Repository;

import com.ready4stage.backend.Entity.DozentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DozentRepository extends JpaRepository<DozentModel, Integer> {

}