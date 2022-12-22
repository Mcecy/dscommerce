package com.mcecy.dscommerce.controllers.handlers;

@ControllerAdvice
public class ControllerExceptionHandler {
@ExceptionHandler(CustomException.class)
public ResponseEntity<CustomError> customName(CustomException e, HttpServletRequest request) {
HttpStatus status = HttpStatus.NOT_FOUND;
CustomError err = new ...
return ResponseEntity.status(status).body(err);
}
}
