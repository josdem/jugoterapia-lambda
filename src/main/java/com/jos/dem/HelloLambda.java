package com.jos.dem;

import com.amazonaws.services.lambda.runtime.Context;

public class Hello {

  public String mainHandler(String name, Context context) {
    return String.format("Hello %s.", name);
  }

}

