package com.codenotfound.ws.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.codenotfound.types.flightsearch.FareMasterPriceResponseVO;
import com.codenotfound.types.flightsearch.Flight;
//import com.codenotfound.types.flightsearch.Flightinfo;
//import com.codenotfound.types.helloworld.Greeting;
import com.codenotfound.types.flightsearch.ObjectFactory;
//import com.codenotfound.types.helloworld.Person;

@Component
public class HelloWorldClient {

  private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldClient.class);

  @Autowired
  private WebServiceTemplate webServiceTemplate;

  public String getFlight(String source, String destination, String dte) {
    ObjectFactory factory = new ObjectFactory();
    /*Person person = factory.createPerson();

    person.setFirstName(firstName);
    person.setLastName(lastName);
*/
    Flight flight = factory.createFlight();
    flight.setSource(source);
    flight.setDestination(destination);
    flight.setDteofjourney(dte);
    
    
    
   /* LOGGER.info("Client sending person[firstName={},lastName={}]", person.getFirstName(),
        person.getLastName());*/
    
    LOGGER.info("Client sending flight[source={},destination={},dteofjourney={}]", flight.getSource(),
            flight.getDestination(),flight.getDteofjourney());

    //Greeting greeting = (Greeting) webServiceTemplate.marshalSendAndReceive(person);
    
    FareMasterPriceResponseVO flightinfo = (FareMasterPriceResponseVO) webServiceTemplate.marshalSendAndReceive(flight);

    /*LOGGER.info("Client received greeting='{}'", greeting.getGreeting());
    return greeting.getGreeting();*/
    
    LOGGER.info("Client received flightinfo='{}'", flightinfo.toString());
    return flightinfo.toString();
  }
}
