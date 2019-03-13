package org.halo.staticed;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author halo.lu , created at 2019-03-13
 * @version 1.0.0
 * @since jdk1.8
 */
public class ProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2010/03/01");
            order.setCreateTime(date.getTime());
            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
