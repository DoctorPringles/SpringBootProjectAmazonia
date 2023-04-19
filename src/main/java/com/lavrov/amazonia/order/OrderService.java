package com.lavrov.amazonia.order;

import com.lavrov.amazonia.order.OrderDTO;
import com.lavrov.amazonia.util.exceptions.EmptyFieldException;

import java.util.List;

public interface OrderService {
    OrderDTO saveOrder(OrderDTO orderDTO) throws EmptyFieldException;
    void deleteOrder(Integer id) throws EmptyFieldException;
    OrderDTO findById(Integer id) throws EmptyFieldException;
    List<OrderDTO> findAll();
}
