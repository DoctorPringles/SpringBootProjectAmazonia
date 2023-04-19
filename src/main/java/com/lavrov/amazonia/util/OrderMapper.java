package com.lavrov.amazonia.util;

import com.lavrov.amazonia.order.Order;
import com.lavrov.amazonia.order.OrderDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    Order toEntity(OrderDTO orderDTO);
    OrderDTO toDTO(Order order);
}
