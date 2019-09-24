package in.karthiks.demo.orders.controller;

import in.karthiks.demo.orders.model.Order;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @GetMapping
    public List<Order> getOrdersForUser(@RequestParam String userId) {
        return Arrays.asList(
                new Order("order-1", userId, new Date(), BigDecimal.valueOf(23.30)),
                new Order("order-2", userId, new Date(), BigDecimal.valueOf(100.00))
        );
    }
}
