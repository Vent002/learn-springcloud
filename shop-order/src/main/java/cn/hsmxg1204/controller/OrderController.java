package cn.hsmxg1204.controller;

import cn.hsmxg1204.entity.Order;
import cn.hsmxg1204.entity.Product;
import cn.hsmxg1204.service.OrderService;
import cn.hsmxg1204.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-04-24 16:40
 */
@RestController
@Slf4j
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderService orderService;

    @Autowired
    private DiscoveryClient discoveryClient;
//    @RequestMapping("/order/prod/{pid}")
//    public Order order(@PathVariable("pid") Integer pid){
//        log.info("pid{}",pid);
//        List<ServiceInstance> instances = discoveryClient.getInstances("service-product");
//        ServiceInstance instance = instances.get(0);
//        Product product = restTemplate.getForObject("http://"+instance.getHost()+":"+instance.getPort()+"/product/" + pid, Product.class);
//        log.info("return result {}",product);
//        Order order = new Order();
//        order.setUid(1);
//        order.setUsername("testUser");
//        order.setPid(pid);
//        order.setPname(product.getPname());
//        order.setPprice(product.getPprice());
//        orderService.createOrder(order);
//        log.info("order create success{}",order);
//        return order;
//    }
    /**
     * 下单自定义负载均衡
     */
//    @RequestMapping("/order/prod/{pid}")
//    public Order order(@PathVariable("pid") Integer pid){
//        log.info("pid{}",pid);
//        List<ServiceInstance> instances = discoveryClient.getInstances("service-product");
//        int index = new Random().nextInt(instances.size());
//        ServiceInstance instance = instances.get(index);
//        log.info("调用service-product:{}",index);
//        Product product = restTemplate.getForObject("http://"+instance.getHost()+":"+instance.getPort()+"/product/" + pid, Product.class);
//        log.info("return result {}",product);
//        Order order = new Order();
//        order.setUid(1);
//        order.setUsername("testUser");
//        order.setPid(pid);
//        order.setPname(product.getPname());
//        order.setPprice(product.getPprice());
//        orderService.createOrder(order);
//        log.info("order create success{}",order);
//        return order;
//    }

    /**
     * ribbon 实现负载均衡
     * @param pid
     * @return
     */
//    @RequestMapping("/order/prod/{pid}")
//    public Order order(@PathVariable("pid") Integer pid){
//        log.info("pid{}",pid);
//        Product product = restTemplate.getForObject("http://service-product/product/" + pid, Product.class);
//        log.info("return result {}",product);
//        Order order = new Order();
//        order.setUid(1);
//        order.setUsername("testUser");
//        order.setPid(pid);
//        order.setPname(product.getPname());
//        order.setPprice(product.getPprice());
//        orderService.createOrder(order);
//        log.info("order create success{}",order);
//        return order;
//    }

    /**
     * 基于OpenFeign 调用
     * @param pid
     * @return
     */

    @Autowired
    private ProductService productService;

    @RequestMapping("/order/prod/{pid}")
    public Order order(@PathVariable("pid") Integer pid){
        log.info("pid{}",pid);
        Product product = productService.findById(pid);
        log.info("return result {}",product);
        Order order = new Order();
        order.setUid(1);
        order.setUsername("testUser");
        order.setPid(pid);
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        orderService.createOrder(order);
        log.info("order create success{}",order);
        return order;
    }
}
