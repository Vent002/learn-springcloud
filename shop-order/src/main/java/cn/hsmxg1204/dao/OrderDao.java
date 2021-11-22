package cn.hsmxg1204.dao;

import cn.hsmxg1204.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-04-24 16:41
 */
public interface OrderDao extends JpaRepository<Order,Integer> {
}
