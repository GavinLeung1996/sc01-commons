package springcloud.tedu.service;

import springcloud.tedu.pojo.Item;

import java.util.List;

public interface ItemService {
//  根据订单id获取全部商品
    List<Item> getItems(String orderId);
//  减少商品数量
    void decreaseNumbers(List<Item> items);
}
