package cn.hsmxg1204.service.impl;

import cn.hsmxg1204.dao.OrderDao;
import cn.hsmxg1204.entity.Order;
import cn.hsmxg1204.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-04-24 16:41
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Override
    public void createOrder(Order order) {
        orderDao.save(order);
    }
}
