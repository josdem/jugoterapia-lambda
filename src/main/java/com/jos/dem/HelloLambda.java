package com.jos.dem;

import com.amazonaws.services.lambda.runtime.Context;

public class HelloLambda {

  public ResponseClass mainHandler(RequestClass request, Context context) {
    String greeting = String.format("Hello %s %s", request.name, request.lastname);
    return new ResponseClass(greeting);
  }

}

