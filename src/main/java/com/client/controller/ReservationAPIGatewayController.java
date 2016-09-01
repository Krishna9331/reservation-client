package com.client.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mishrk3 on 8/31/2016.
 */
@RestController
@RequestMapping("/reservations")
public class ReservationAPIGatewayController {

	@Autowired
    private RestTemplate template;

    @RequestMapping(method = RequestMethod.GET, value = "/names")
	public Collection<String> getReservationNames() {
    return null;
	}
}
