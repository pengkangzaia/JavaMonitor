package com.github.onblog.server.database.service;

import com.github.onblog.server.database.dao.MemoryRepository;
import com.github.onblog.server.database.entity.MemoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pengkangzaia@foxmail.com
 * @create 2021-11-01 9:32
 **/
@Service
public class MemoryService {

    @Autowired
    private MemoryRepository memoryRepository;


    public List<MemoryEntity> findAllByAddress(String address) {
        return memoryRepository.findAllByAddress(address);
    }


    public void write(String address, String date, String memoryUsage) {
        MemoryEntity entity = new MemoryEntity();
        entity.setAddress(address);
        entity.setDate(date);
        entity.setMemoryUsage(memoryUsage);
        memoryRepository.save(entity);
    }

    public void clearAll() {
        memoryRepository.deleteAll();
    }


}
