package com.tyh.i.lo.ve.yo.u.springboot.gridControll;

import com.tyh.i.lo.ve.yo.u.springboot.Dao.gridDao;
import com.tyh.i.lo.ve.yo.u.springboot.Server.gridServer;
import com.tyh.i.lo.ve.yo.u.springboot.entity.gridCup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController(value = "/")
public class hiControll {

    @Autowired
   private gridServer gridServer;

    @GetMapping(value = "/gridAll")
    public List<gridCup> selAll(){

        String a= System.getProperty("os.name");
        System.out.print(a);
        return gridServer.selAll();
    }

    @PostMapping(value = "/gridAdd")
    public gridCup addGrid( @RequestParam(value = "age") int age,@RequestParam(value = "cupSize") String cupSize){
        gridCup g=new gridCup();
        g.setAge(age);
        g.setCutSize(cupSize);
        return gridServer.Addone(g);
    }

    @DeleteMapping(value = "/delgrid/{Id}")
    public List<gridCup> delGrid(@PathVariable int Id){
        gridCup g=new gridCup();
        g.setGid(Id);
        return gridServer.delgrid(g);
    }

    @PutMapping(value = "/update")
    public  List<gridCup> updateGrid(@RequestParam(value = "Id") int Id,@RequestParam(value = "age") int age,@RequestParam(value = "cupSize") String cupSize){
            gridCup g=new gridCup();
            g.setGid(Id);
            g.setCutSize(cupSize);
            g.setAge(age);
         return gridServer.updateGrid(g);
    }




//    @Scheduled(cron = "0/2 * * * * *")
//    public void timer() throws InterruptedException {
//        //获取当前时间
//
//            LocalDateTime localDateTime =LocalDateTime.now();
//            System.out.println("当前时间为:" + localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//
//    }
}
