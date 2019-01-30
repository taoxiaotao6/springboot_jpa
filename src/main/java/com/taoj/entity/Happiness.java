package com.taoj.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="happiness")
public class Happiness {

    @Id
    @GeneratedValue
    private Integer id;

    private String city;

    private String num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Happiness{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
