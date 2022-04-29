package com.atguigu.springboot;

//import org.junit.Test;
//import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@SpringBootTest
//@RunWith(SpringRunner.class)
public class Springboot04AccessdataApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private JdbcTemplate template;



    @Autowired
    private DataSource dataSource;
    @Test
    public void testTemp(){
        Long aLong = template.queryForObject("select count(*) from t_emp", Long.class);
        //System.out.println(dataSource.getClass());
        System.out.println("along="+aLong);
    }

    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    public void testRedis(){
        System.out.println(redisTemplate.getClass());
        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("hello666","hello Redis666");
        String hello = valueOperations.get("hello666");
        System.out.println(hello);
    }
}
