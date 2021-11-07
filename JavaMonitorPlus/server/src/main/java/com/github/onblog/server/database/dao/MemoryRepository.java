package com.github.onblog.server.database.dao;

import com.github.onblog.server.database.entity.CpuEntity;
import com.github.onblog.server.database.entity.MemoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author pengkangzaia@foxmail.com
 * @create 2021-11-01 9:00
 **/
@Repository
public interface MemoryRepository extends JpaRepository<MemoryEntity, Integer> {

    List<MemoryEntity> findAllByAddress(String address);
}
