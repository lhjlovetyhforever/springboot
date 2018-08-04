package com.tyh.i.lo.ve.yo.u.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public  class gridCup {
    @Id
    @GeneratedValue
    private int gid;
    private  String cutSize;
    private  Integer age;

    public gridCup() {
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getCutSize() {
        return cutSize;
    }

    public void setCutSize(String cutSize) {
        this.cutSize = cutSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
