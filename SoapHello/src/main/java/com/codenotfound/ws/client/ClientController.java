package com.codenotfound.ws.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codenotfound.types.flightsearch.FareMasterPriceResponseVO;
import com.codenotfound.types.flightsearch.Flight;
import com.codenotfound.types.flightsearch.Flightadv;
import com.codenotfound.types.flightsearch.Flightinfo;

@Controller

public class ClientController {
	
	@Autowired
	private HelloWorldClient usc;
    //@RequestMapping(value="/getGreeting",method=RequestMethod.GET)
	@RequestMapping(value="/getFlight",method=RequestMethod.POST)
    @ResponseBody
		public FareMasterPriceResponseVO  info(@RequestBody Flight flight) {
                    System.out.println(" Inside call Soap info ");
                    
                    FareMasterPriceResponseVO response = usc.getFlight(flight);
                    //System.out.println(response);
                    return response;
	}
	@RequestMapping(value="/getFlightforAdvanced",method=RequestMethod.POST)
    @ResponseBody
		public FareMasterPriceResponseVO  getAdvancedFlightInfo(@RequestBody Flightadv flightadv) {
                    System.out.println(" Inside call Soap getAdvancedFlightInfo");
                    
                    FareMasterPriceResponseVO response = usc.getFlightForAdvanced(flightadv);
                    return response;
	}
}
