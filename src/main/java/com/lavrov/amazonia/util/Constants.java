package com.lavrov.amazonia.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface Constants {
    public static final ResponseEntity EMPTY_FIELD_RESPONSE_ENTITY = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
}
