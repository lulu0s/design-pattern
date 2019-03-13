package org.halo.dynamic;

import org.halo.staticed.IOrderService;
import org.halo.staticed.Order;
import org.halo.staticed.OrderService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author halo.lu , created at 2019-03-13
 * @version 1.0.0
 * @since jdk1.8
 */
public class OrderDynamicProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2020/01/01");
            order.setCreateTime(date.getTime());
            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
