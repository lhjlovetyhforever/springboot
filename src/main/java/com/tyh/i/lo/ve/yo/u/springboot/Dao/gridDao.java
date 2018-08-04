package com.tyh.i.lo.ve.yo.u.springboot.Dao;

import com.tyh.i.lo.ve.yo.u.springboot.entity.gridCup;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface gridDao extends JpaRepository<gridCup,Long> {
}
