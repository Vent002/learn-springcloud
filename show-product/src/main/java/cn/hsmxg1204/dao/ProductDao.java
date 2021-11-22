package cn.hsmxg1204.dao;

import cn.hsmxg1204.entity.Product;
import cn.hsmxg1204.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-04-24 14:46
 */
public interface ProductDao extends JpaRepository<Product, Integer> {
}
