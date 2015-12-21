(function() {
	'use-strict';
	App.factory('IncidentService', [ '$http', '$stateParams',
			function($http, $stateParams) {
				return {
					sayHello : function() {
						return "hello";
					}
				};
			} ]);

}());
