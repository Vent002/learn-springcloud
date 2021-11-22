package cn.hsmxg1204.service;

import cn.hsmxg1204.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-09-05 12:28
 */

/**
 *  value 指定调用 nacos 下哪个微服务
 * @author Administrator
 */
@FeignClient(value = "service-product")
public interface ProductService {
    /**
     * 指定请求URI地址 = @FeignClient 的value +  @RequestMapping的value
     * @param pid  商品ID
     * @return
     */
    @RequestMapping("/product/{pid}")
    Product findById(@PathVariable Integer pid);
}
