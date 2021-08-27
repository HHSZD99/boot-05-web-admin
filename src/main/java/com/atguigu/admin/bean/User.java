package com.atguigu.admin.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor//有参构造器
@NoArgsConstructor//无参构造器
@Data
@TableName("user_tbl") //对应的表，让MyBatis-plus去通过User找数据库里的表user_tbl
public class User {

    /**
     * 所有属性都应该在数据库中
     */
    @TableField(exist = false)  //当前属性表中不存在
    private String userName;
    @TableField(exist = false)
    private String password;


    //以下是数据库字段
    private Long id;
    private String name;
    private Integer age;
    private String email;


}
