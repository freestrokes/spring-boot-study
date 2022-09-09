package com.freestrokes;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("fruit")
public class FruitProperty {

    private List<Fruit> list;

    public List<Fruit> getList() {
        return this.list;
    }

    public void setList(List<Fruit> list) {
        this.list = list;
    }

}
