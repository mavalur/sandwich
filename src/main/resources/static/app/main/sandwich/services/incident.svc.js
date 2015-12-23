(function() {
	'use strict';

	angular.module('app.sandwich').factory('IncidentService', IncidentService);

	/** @ngInject */
	function IncidentService($window, $http) {
		return {
			initiateBridge : function() {
				var data = $.param({
					json : JSON.stringify({
						incidentId : 'INC1234',
						numbers : '+15083536038,+18623362045'
					})
				});
				$http.post("https://a6891304.ngrok.io/broadcast/send", data)
						.success(function(data, status) {
							$scope.hello = data;
						});
			}
		}
	}
}());