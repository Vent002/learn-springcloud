package cn.hsmxg1204.service;

import cn.hsmxg1204.entity.Product;
import org.springframework.web.bind.annotation.Mapping;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-04-24 14:49
 */
public interface ProductService {
    //根据pid查询商品信息
    Product findByPid(Integer pid);

    //扣减库存
    void reduceInventory(Integer pid, Integer number);
}
