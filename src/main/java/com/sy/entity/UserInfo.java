package com.sy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class UserInfo {
   /**
    * 用户id id
    */
   @TableId(value = "id",type = IdType.AUTO)
   private Integer id ;//int primary key auto_increment,
   /**
    * 年龄 age
    */
   private Integer age ;// int,
   /**
    * 用户名称 username
    */
   private String  username  ;//varchar(20),
   /**
    * 用户密码 password
    */
   private String password  ;//varchar(50),
   /**
    * 邮箱 email
    */
   private String email  ;//varchar(50),
   /**
    * sex
    */
   private String sex  ;//varchar(20),
   /**
    * word id
    */
   private Integer wid  ;//int

   @TableField(exist = false)
   private String wname;

}
