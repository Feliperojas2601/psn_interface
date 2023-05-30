package com.example.psn_interface.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import com.example.psn_interface.entities.TwoF;

@Controller
public class TwoFController {

  @QueryMapping
  public TwoF getTwoF() {
      return new TwoF("TwoF");
  }
}
