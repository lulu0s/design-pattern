package org.halo.staticed;

/**
 * @author halo.lu , created at 2019-03-13
 * @version 1.0.0
 * @since jdk1.8
 */
public class OrderService implements IOrderService {
    private OrderDao orderDao;

    public OrderService() {
        //如果使用Spring 应该是自动注入的
        //为了使用方便，在构造方法中将orderDao直接初始化了
        this.orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService 调用 OrderDao 创建订单");
        return this.orderDao.insert(order);
    }
}
