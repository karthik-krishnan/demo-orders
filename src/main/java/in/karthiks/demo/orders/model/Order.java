package in.karthiks.demo.orders.model;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    public String orderId;
    public String userId;
    public Date orderDate;
    public BigDecimal orderAmount;

    public Order(String orderId, String userId, Date orderDate, BigDecimal orderAmount) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }
}
