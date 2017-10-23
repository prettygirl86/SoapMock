angular.module('deemApp', ['ngAnimate', 'ngSanitize', 'ui.bootstrap']);
angular.module('deemApp').controller('DeemController', function ($scope,$http,$filter) {
	$scope.today = function() {
    this.dt = new Date();
  };
  $scope.today();

  $scope.clear = function() {
	  $scope.dt = null;
  };

  $scope.inlineOptions = {
    customClass: getDayClass,
    minDate: new Date(),
    showWeeks: true
  };

  $scope.dateOptions = {
    dateDisabled: disabled,
    formatYear: 'yy',
    maxDate: new Date(2020, 5, 22),
    minDate: new Date(),
    startingDay: 1
  };

  // Disable weekend selection
  function disabled(data) {
    var date = data.date,
      mode = data.mode;
    return mode === 'day' && (date.getDay() === 0 || date.getDay() === 6);
  }

  $scope.toggleMin = function() {
    $scope.inlineOptions.minDate = $scope.inlineOptions.minDate ? null : new Date();
    $scope.dateOptions.minDate = $scope.inlineOptions.minDate;
  };

  $scope.toggleMin();

  $scope.open1 = function() {
    $scope.popup1.opened = true;
  };

  $scope.open2 = function() {
    $scope.popup2.opened = true;
  };

  $scope.setDate = function(year, month, day) {
    $scope.dt = new Date(year, month, day);
  };

  $scope.formats = ['dd-MMMM-yyyy', 'yyyy/MM/dd', 'dd.MM.yyyy', 'shortDate'];
  $scope.format = $scope.formats[0];
  $scope.altInputFormats = ['M!/d!/yyyy'];

  $scope.popup1 = {
    opened: false
  };

  $scope.popup2 = {
    opened: false
  };

  var tomorrow = new Date();
  tomorrow.setDate(tomorrow.getDate() + 1);
  var afterTomorrow = new Date();
  afterTomorrow.setDate(tomorrow.getDate() + 1);
  $scope.events = [
    {
      date: tomorrow,
      status: 'full'
    },
    {
      date: afterTomorrow,
      status: 'partially'
    }
  ];

  function getDayClass(data) {
    var date = data.date,
      mode = data.mode;
    if (mode === 'day') {
      var dayToCheck = new Date(date).setHours(0,0,0,0);

      for (var i = 0; i < $scope.events.length; i++) {
        var currentDay = new Date($scope.events[i].date).setHours(0,0,0,0);

        if (dayToCheck === currentDay) {
          return $scope.events[i].status;
        }
      }
    }

    return '';
  }
  
  
  var self = $scope;
  $scope.flightindex;
  $scope.recommendation=[];
  $scope.errorMessage="";
  $scope.source="";
  $scope.destination="";
  $scope.passengerCount={};
 
  $scope.adultCountList = [0,1,2,3,4,5,6,7,8,9,10];
  $scope.childrenCountList = [0,1,2,3,4,5,6,7,8,9,10];
  $scope.infantCountList = [0,1,2];
  $scope.lowFareSearch=true;
  $scope.airlinePreffered="";
  $scope.airlineList = ["","Delta Airlines","Emirates","Ethihad","Lufthansa"];
  $scope.bookingClass="";
  $scope.bookingClassList = ["","Economy","Business"];
	 
	$scope.model = {
		    start: new Date('12/31/2014'),
		    end: new Date()
		  };

		  $scope.opened ={
		    start: false,
		    end: false
		  };
	
		  $scope.getFlights = function (){
			  console.log($scope.dt);
			  $scope.date = $filter('date')($scope.dt, "MM-dd-yyyy"); 
			  console.log($scope.date);
			var json ={};
			json.source = $scope.source;
			json.destination = $scope.destination;
			json.preferredAirline = "";
			json.date=$scope.date;
			json.bookingClass="";
			if($scope.lowFareSearch){
			$http.post('/getFlight',json).then(function successCallback(response) { 
				self.flightindex=response.data.flightindex;	
				self.recommendation = response.data.recommendations;
				self.errorMessage="";
				if(self.flightindex == null || self.flightindex == undefined || self.flightindex.groupOfFlights.length === 0 ){
					self.errorMessage = "No Flights available in this route";
				}
     
   }, function errorCallback(response) { 
	   $scope.errorMessage ="Error while retrieving data";
         
   }); 
			}
			else{
				json.preferredAirline = $scope.airlinePreffered;
				json.bookingClass=$scope.bookingClass;
				$http.post('/getFlightforAdvanced',json).then(function successCallback(response) { 
					self.flightindex=response.data.flightindex;	
					self.recommendation = response.data.recommendations;
					self.errorMessage="";
					if(self.flightindex == null || self.flightindex == undefined || self.flightindex.groupOfFlights.length === 0 ){
						self.errorMessage = "No Flights available in this route";
					}
					
	     
	   }, function errorCallback(response) { 
		   $scope.errorMessage ="Error while retrieving data";
	         
	   });
			}
      
  };
});