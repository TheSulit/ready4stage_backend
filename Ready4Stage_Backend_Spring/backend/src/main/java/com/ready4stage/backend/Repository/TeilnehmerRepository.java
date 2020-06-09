package com.ready4stage.backend.Repository;

import com.ready4stage.backend.Entity.TeilnehmerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeilnehmerRepository extends JpaRepository<TeilnehmerModel, Integer> {

}