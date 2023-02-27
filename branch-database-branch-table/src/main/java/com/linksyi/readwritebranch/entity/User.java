package com.linksyi.readwritebranch.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("user")
public class User {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    @TableField("account")
    private String account;

    @TableField("nickname")
    private String nickname;

    @TableField("password")
    private String password;

    @TableField("headimage_url")
    private String headimageUrl;

    @TableField("introduce")
    private String introduce;
}
