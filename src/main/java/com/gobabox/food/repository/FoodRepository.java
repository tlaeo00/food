package com.gobabox.food.repository;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FoodRepository {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    private final static String NAMESPACE = "FoodMapper";

    public List<String> selectUser() {
        return sqlSessionTemplate.selectList(StringUtils.join(NAMESPACE, ".", "selectUser"));
    }

}
