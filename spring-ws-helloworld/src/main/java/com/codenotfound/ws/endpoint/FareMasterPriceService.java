package com.codenotfound.ws.endpoint;

import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.codenotfound.types.flightsearch.CompanyVO;
import com.codenotfound.types.flightsearch.Flight;
import com.codenotfound.types.flightsearch.FlightDetailsVO;
import com.codenotfound.types.flightsearch.FlightIndexVO;
import com.codenotfound.types.flightsearch.FlightInfoVO;
import com.codenotfound.types.flightsearch.Flightadv;
//import com.codenotfound.types.flightsearch.FlightInformation;
import com.codenotfound.types.flightsearch.GroupOfFlightsVO;
import com.codenotfound.types.flightsearch.ItemNumIdVO;
import com.codenotfound.types.flightsearch.ItemNumberVO;
import com.codenotfound.types.flightsearch.LocationVO;
import com.codenotfound.types.flightsearch.PaxFareDetailVO;
import com.codenotfound.types.flightsearch.PaxFareProduct;
//import com.codenotfound.types.flightsearch.ProductDateTime;
import com.codenotfound.types.flightsearch.FareMasterPriceResponseVO;
import com.codenotfound.types.flightsearch.ProductDateTimeVO;
import com.codenotfound.types.flightsearch.RecPriceInfoVO;
import com.codenotfound.types.flightsearch.RecommendationVO;
import com.codenotfound.types.flightsearch.SegFlightRefVO;

@Component
public class FareMasterPriceService {
	
	//private static FlightInformation flightInformation  ;
	private static FlightInfoVO flightInfoVO = new FlightInfoVO();
	//private static FlightInfoVO flightInfoVO;
	private static FlightIndexVO flightIndexVO = new FlightIndexVO();
	private static List<GroupOfFlightsVO> grpofFlightsVOList = new ArrayList<GroupOfFlightsVO>();
	private static GroupOfFlightsVO groupOfFlightsVO1= new GroupOfFlightsVO();
	private static List<FlightDetailsVO> grpofFlightsDetailsVOList = new ArrayList<FlightDetailsVO>();
	private static FlightDetailsVO flightDetailsVO1 = new FlightDetailsVO();
	private static FareMasterPriceResponseVO fareMasterResponse = new FareMasterPriceResponseVO();
	private static ItemNumIdVO itemNumberId=new ItemNumIdVO();
	private static ItemNumberVO itemNumber =new ItemNumberVO();
	private static PaxFareDetailVO paxFareDetail=new PaxFareDetailVO();
	private static PaxFareProduct paxFareProduct =new PaxFareProduct();
	private static RecPriceInfoVO recPriceInfo=new RecPriceInfoVO();
	private static SegFlightRefVO segflref1=new SegFlightRefVO();
	private static SegFlightRefVO segflref2=new SegFlightRefVO();
	private static List<SegFlightRefVO> segmentFlightRef=new ArrayList<SegFlightRefVO>();

private static List<RecommendationVO> recommendation= new ArrayList<RecommendationVO>();
	private static RecommendationVO recommendation1=new RecommendationVO();
	
	
	
	
	static {
		//Initialize Data
		//ProductDateTimeVO  productDateTime =  new ProductDateTimeVO("101617","9:35 AM ","101617","11:40 AM");		// mm,dd,yyyy
		//flightInfoVO = new FlightInfoVO(productDateTime,null,null,null);
		//flightInfoVO.setProductDateTime(productDateTime);
		flightDetailsVO1.setFlightInformation(flightInfoVO);
		grpofFlightsDetailsVOList.add(flightDetailsVO1);
		groupOfFlightsVO1.setFlightDetails(grpofFlightsDetailsVOList);
		grpofFlightsVOList.add(groupOfFlightsVO1);
		flightIndexVO.setGroupOfFlights(grpofFlightsVOList);
		fareMasterResponse.setFlightindex(flightIndexVO);
		//flightInformation = new FlightInformation(productDateTime,"LON","SAW");
		
		itemNumberId.setNumber(1);
		itemNumber.setItemNumberId(itemNumberId);
		segmentFlightRef.add(segflref1);
		segmentFlightRef.add(segflref2);
		paxFareDetail.setPaxFareNum(1);
		paxFareDetail.setTotalFareAmount(247.96);
		paxFareProduct.setPaxFareDetail(paxFareDetail);
		recommendation1.setItemNumber(itemNumber);
		recommendation1.setPaxFareProduct(paxFareProduct);
fareMasterResponse.setRecommendations(recommendation);
		recommendation.add(recommendation1);
	}
	
	/*public  FlightInformation getAllFares() {
			return flightInformation;
	}*/
	
	//method added by Rinchu
	public FareMasterPriceResponseVO getAllFlight(String fromStr, String toStr) {
		//FareMasterPriceResponseVO fareMasterResponse = new FareMasterPriceResponseVO();


		//fareMasterResponse.setFlightindex(getFlightIndexVO(fromStr, toStr));
		return fareMasterResponse;
	}
	
	
		public FareMasterPriceResponseVO getAllFlightXML(Flight flight) {
			FareMasterPriceResponseVO fareMasterResponse = new FareMasterPriceResponseVO();


			fareMasterResponse.setFlightindex(getFlightIndexVO(flight));
			fareMasterResponse.setRecommendations(FareMasterPriceService.fareMasterResponse.getRecommendations());
			
			return fareMasterResponse;
		}
		
		public FareMasterPriceResponseVO getAllFlightXMLForAdvanced(Flightadv flight) {
			FareMasterPriceResponseVO fareMasterResponse = new FareMasterPriceResponseVO();


			fareMasterResponse.setFlightindex(getFlightIndexVOAdv(flight));
			fareMasterResponse.setRecommendations(FareMasterPriceService.fareMasterResponse.getRecommendations());
			
			return fareMasterResponse;
		}
	
	//Jerald method
	/*public FareMasterPriceResponseVO getAllFlight(String fromStr, String toStr) {
		FareMasterPriceResponseVO fareMasterResponse = new FareMasterPriceResponseVO();
		fareMasterResponse.setFlightindex(getFlightIndexVO(fromStr, toStr));
		return fareMasterResponse;
	}*/
	
	public FlightIndexVO getFlightIndexVO(Flight flight) {
		String fromStr = flight.getSource();
		String toStr = flight.getDestination();
		String preferedAirline = flight.getPreferredAirline();
		String bookingClass=flight.getBookingClass();
		FlightIndexVO flightIndex = new FlightIndexVO();
		getFlightFromXML(fromStr, toStr,preferedAirline, bookingClass, flightIndex);
		return flightIndex;
	}
	
	public FlightIndexVO getFlightIndexVOAdv(Flightadv flight) {
		String fromStr = flight.getSource();
		String toStr = flight.getDestination();
		String preferedAirline = flight.getPreferredAirline();
		String bookingClass=flight.getBookingClass();
		FlightIndexVO flightIndex = new FlightIndexVO();
		getFlightFromXML(fromStr, toStr,preferedAirline, bookingClass, flightIndex);
		return flightIndex;
	}
	
	public FlightIndexVO getFlightFromXML(String fromStr, String toStr,String preferredAirline, String bookingClass, FlightIndexVO flightIndex) {
		
		try {
			
			File inputXml = new File("D:\\deem\\FlightDetails.xml"); //C:\deem
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	        Document doc = dBuilder.parse(inputXml);
	        doc.getDocumentElement().normalize();
	        NodeList nList = doc.getElementsByTagName("Flight");
	        
	        List<GroupOfFlightsVO> listGroupOfFlights = new ArrayList<GroupOfFlightsVO>();
	        for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               String strFrom = eElement.getElementsByTagName("From").item(0).getTextContent();
	               String strTo = eElement.getElementsByTagName("To").item(0).getTextContent();
	               String strPreferredAirline = eElement.getElementsByTagName("Name").item(0).getTextContent();
	               String strBookingClass=eElement.getElementsByTagName("Class").item(0).getTextContent();
	               if(strFrom.equalsIgnoreCase(fromStr) && strTo.equalsIgnoreCase(toStr)) {
	            	   
	            	   if(!preferredAirline.equalsIgnoreCase("")){
	            		   if(!strPreferredAirline.equalsIgnoreCase(preferredAirline)){
	            			   continue;
	            		   }
	            	   }
	            	   
	            	   if(!bookingClass.equalsIgnoreCase("")){
	            		   if(!strBookingClass.equalsIgnoreCase(bookingClass)){
	            			   continue;
	            		   }
	            	   }
	            	   
	            	   listGroupOfFlights.add(setFlightIndexVO(eElement,fromStr,toStr));
	            	   
	               }  // IF for FROM and TO matches
	                           	   
	            } // End of For
	            flightIndex.setGroupOfFlights(listGroupOfFlights);
	        }
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return flightIndex;
	}
	
	public GroupOfFlightsVO setFlightIndexVO(Element eElement,String strFrom,String strTo){
		
		
		Element fromElement = (Element)eElement.getElementsByTagName("From").item(0);
 	   Element toElement = (Element)eElement.getElementsByTagName("To").item(0);
 	  // ProductDateTime productDateTime = new ProductDateTime(fromElement.getAttribute("date"), fromElement.getAttribute("time"), toElement.getAttribute("date"), toElement.getAttribute("time"));
 	//   FlightInformation flightInfo = new FlightInformation(productDateTime, strFrom, strTo);
 	   
 	   ProductDateTimeVO productDateTimeVO = new ProductDateTimeVO();
 	   productDateTimeVO.setDateOfDeparture(fromElement.getAttribute("date"));
 	   productDateTimeVO.setTimeOfDeparture(fromElement.getAttribute("time"));
 	   productDateTimeVO.setDateOfArrival(toElement.getAttribute("date"));
 	   productDateTimeVO.setTimeOfArrival(toElement.getAttribute("time"));
 	   
 	   FlightInfoVO flightInfoVO = new FlightInfoVO();
 	   flightInfoVO.setProductDateTime(productDateTimeVO);
 	   //flightInfoVO.setFlightOrtrainNumber("809");
 	   flightInfoVO.setFlightOrtrainNumber(eElement.getElementsByTagName("Name").item(0).getTextContent()); 
 	   
 	   CompanyVO companyVO = new CompanyVO();
 	   companyVO.setAlliance("*A");
 	   companyVO.setMarketingCarrier("SK");
 	   companyVO.setOperatingCarrier("SK");
 	   companyVO.setBookingClass(eElement.getElementsByTagName("Class").item(0).getTextContent());
 	   flightInfoVO.setCompanyId(companyVO);
 	   
 	   LocationVO locationFrom = new LocationVO();
 	   locationFrom.setLocationId(strFrom);
 	   LocationVO locationTo = new LocationVO();
 	   locationTo.setLocationId(strTo);
 	   
 	   List<LocationVO> list = new ArrayList<LocationVO>();
 	   list.add(locationFrom);
 	   list.add(locationTo);
 	   flightInfoVO.setLocation(list);
 	   
 	   FlightDetailsVO flightDetail = new FlightDetailsVO();
 	   flightDetail.setFlightInformation(flightInfoVO);
 	   
 	  List<FlightDetailsVO> listFlight = new ArrayList<FlightDetailsVO>();
 	   listFlight.add(flightDetail);
 	  GroupOfFlightsVO groupOfFlights = new GroupOfFlightsVO();
	   groupOfFlights.setFlightDetails(listFlight);
		
		return groupOfFlights;
		
	}
	
	
}
