package com.github.camille.server.database.dao;

import com.github.camille.server.database.entity.CpuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author pengkangzaia@foxmail.com
 * @create 2021-11-01 8:57
 **/
@Repository
public interface CpuRepository extends JpaRepository<CpuEntity, Integer> {
    List<CpuEntity> findAllByAddress(String address);
}
