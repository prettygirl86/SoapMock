package com.codenotfound.ws.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.codenotfound.types.flightsearch.FareMasterPriceResponseVO;
import com.codenotfound.types.flightsearch.Flight;
import com.codenotfound.types.flightsearch.Flightadv;
import com.codenotfound.types.flightsearch.Flightinfo;
import com.codenotfound.types.helloworld.Greeting;
//import com.codenotfound.types.helloworld.ObjectFactory;
import com.codenotfound.types.flightsearch.ObjectFactory;
import com.codenotfound.types.helloworld.Person;


public class HelloWorldClient extends WebServiceGatewaySupport {

  private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldClient.class);

	  public FareMasterPriceResponseVO getFlight(Flight flight) {
    
    LOGGER.info("Client sending flight[source={},destination={},dteofjourney={}]", flight.getSource(),
            flight.getDestination(),flight.getDteofjourney());

    FareMasterPriceResponseVO flightinfo = (FareMasterPriceResponseVO) getWebServiceTemplate().marshalSendAndReceive(flight,new SoapActionCallback("http://codenotfound.com/types/flightsearch/FareMasterPriceResponseVO"));

    
    LOGGER.info("Client received flightinfo='{}'", flightinfo.toString());
    return flightinfo;
  }
	  
	  public FareMasterPriceResponseVO getFlightForAdvanced(Flightadv a) {
		    
		    LOGGER.info("Client sending getFlightForAdvanced flight[source={},destination={},dteofjourney={}]", a.getSource(),
		    		a.getDestination(),a.getDteofjourney());

		    FareMasterPriceResponseVO flightinfo = (FareMasterPriceResponseVO) getWebServiceTemplate().marshalSendAndReceive(a,new SoapActionCallback("http://codenotfound.com/types/flightsearch/FareMasterPriceResponseVO"));

		    
		    LOGGER.info("Client received flightinfo='{}'", flightinfo.toString());
		    return flightinfo;
		  }
}
