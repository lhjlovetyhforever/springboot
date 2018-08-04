package com.tyh.i.lo.ve.yo.u.springboot.Server;

import com.tyh.i.lo.ve.yo.u.springboot.Dao.gridDao;
import com.tyh.i.lo.ve.yo.u.springboot.entity.gridCup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = {"lemonCache"})
public class gridServer {
    @Autowired
    private gridDao gridDao;

    /**
     * 添加一条数据
     * @param gridCup
     * @return
     */
    @CachePut()
    public gridCup Addone(gridCup gridCup){
        return gridDao.save(gridCup);
    }

    /**
     * 查询全部数据
     * @return
     */

    @Cacheable(value = "people")
    public List<gridCup> selAll(){
        return gridDao.findAll();
    }

    /**
     * 删除一个数据
     * @param gridCup
     * @return
     */
    @CacheEvict()
    public List<gridCup>  delgrid(gridCup gridCup){
        gridDao.delete(gridCup);
        return selAll();
    }

    /**
     * 修改一条数据
     * @param gridCup
     * @return
     */
    @CachePut()
    public List<gridCup> updateGrid(gridCup gridCup){
        gridDao.save(gridCup);
        return selAll();
    }

}
