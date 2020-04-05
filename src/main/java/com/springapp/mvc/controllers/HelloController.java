package com.springapp.mvc.controllers;

import com.springapp.mvc.dto.PassengerDTO;
import com.springapp.mvc.services.TaxiPassengerTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/taxiPassengerTracking",method = RequestMethod.GET)
public class HelloController {

    @Autowired
    private TaxiPassengerTrackService taxiPassengerTrackService;

    @RequestMapping(value = "/taxiDetails",method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public PassengerDTO getPassengerDetails() {

      return   taxiPassengerTrackService.getPassengerDetail();
    }
}