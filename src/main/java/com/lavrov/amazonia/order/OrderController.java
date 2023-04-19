package com.lavrov.amazonia.order;


import com.lavrov.amazonia.util.Constants;
import com.lavrov.amazonia.util.exceptions.EmptyFieldException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/orders")
@RestController
public class OrderController implements Constants {
    private OrderService orderService;
    public OrderController(OrderService orderService){
        this.orderService=orderService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<OrderDTO>> findAll(){
        return new ResponseEntity<>(this.orderService.findAll(),HttpStatus.OK);
    }
    @GetMapping("/findById")
    public ResponseEntity<OrderDTO> findById(@RequestParam Integer id){
        try {
            return new ResponseEntity<>(this.orderService.findById(id),HttpStatus.OK);
        } catch (EmptyFieldException e) {
            return Constants.EMPTY_FIELD_RESPONSE_ENTITY;
        }
    }
    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTO orderDTO){
        try {
            return new ResponseEntity<>(this.orderService.saveOrder(orderDTO), HttpStatus.CREATED);
        } catch (EmptyFieldException e) {
        return Constants.EMPTY_FIELD_RESPONSE_ENTITY;
        }
    }
    @PostMapping("/deleteOrder")
    public ResponseEntity deleteVeicolo(@RequestParam Integer id){
        try {
            this.orderService.deleteOrder(id);
            return new ResponseEntity(HttpStatus.OK);
        }catch (EmptyFieldException e){
            return Constants.EMPTY_FIELD_RESPONSE_ENTITY;
        }
    }
}
