package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface CityMapper {

    @Select("select * from city where id=#{id}")
    public City getById(Long id);


    @Insert("insert into  city(`name`,`state`,`country`) values(#{name},#{state},#{country})")
    @Options(useGeneratedKeys = true,keyProperty = "id")//在IndexController的savecity中返回得到自增ID的值
    public void insert(City city);

}
