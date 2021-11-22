package cn.hsmxg1204.service.impl;

import cn.hsmxg1204.dao.OrderDao;
import cn.hsmxg1204.entity.Order;
import cn.hsmxg1204.service.OrderService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
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
public class OrderServiceImpl3{

    @SentinelResource("message")
    public String  message() {
        return "message";
    }
}
