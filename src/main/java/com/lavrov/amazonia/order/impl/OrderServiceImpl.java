package com.lavrov.amazonia.order.impl;

import com.lavrov.amazonia.order.OrderDTO;
import com.lavrov.amazonia.order.OrderRepository;
import com.lavrov.amazonia.order.OrderService;
import com.lavrov.amazonia.order.OrderValidator;
import com.lavrov.amazonia.util.OrderMapper;
import com.lavrov.amazonia.util.exceptions.EmptyFieldException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private OrderMapper orderMapper;
    @Override
    public OrderDTO saveOrder(OrderDTO orderDTO) throws EmptyFieldException {
        OrderValidator.validateOrder(orderMapper.toEntity(orderDTO));
        this.orderRepository.save(this.orderMapper.toEntity(orderDTO));
        return orderDTO;
    }

    @Override
    public void deleteOrder(Integer id) throws EmptyFieldException {
        OrderValidator.validateInteger(id);
        this.orderRepository.deleteById(id);
    }

    @Override
    public OrderDTO findById(Integer id) throws EmptyFieldException {
        OrderValidator.validateInteger(id);
        return this.orderMapper.toDTO(this.orderRepository.findById(id).orElse(null));
    }

    @Override
    public List<OrderDTO> findAll() {
        return this.orderRepository.findAll().stream().map(this.orderMapper::toDTO).collect(Collectors.toList());
    }
}
