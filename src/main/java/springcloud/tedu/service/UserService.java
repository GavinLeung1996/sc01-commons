package springcloud.tedu.service;

import springcloud.tedu.pojo.User;

public interface UserService {
//  根据用户编号获取用户信息
    User getUser(Integer id);
//  根据用户编号和积分为用户增加积分
    void addScore(Integer id, Integer score);
}
