package springcloud.tedu.service;

import springcloud.tedu.pojo.Order;

public interface OrderService {
//  根据订单id获取订单详细信息
    Order getOrder(String orderId);
//  保存订单
    void addOrder(Order order);
}
