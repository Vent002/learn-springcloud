package cn.hsmxg1204.controller;

import cn.hsmxg1204.entity.Order;
import cn.hsmxg1204.entity.Product;
import cn.hsmxg1204.service.OrderService;
import cn.hsmxg1204.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-04-24 16:40
 */
@RestController
@Slf4j
public class OrderController2 {

    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;

    /**
     * 基于OpenFeign 调用
     * @param pid
     * @return
     */
    @RequestMapping("/order/prod2/{pid}")
    public Order order(@PathVariable("pid") Integer pid){
        log.info("pid{}",pid);
        Product product = productService.findById(pid);
        try {
            Thread.sleep(200001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("return result {}",product);
        Order order = new Order();
        order.setUid(1);
        order.setUsername("testUser");
        order.setPid(pid);
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
//        orderService.createOrder(order);
        log.info("order create success{}",order);
        return order;
    }

    @RequestMapping("order/message")
    public String message(){
        return "测试高并发";
    }
}
