var GlobalController = function SecondCtrl($scope, $http, $rootScope,
		IncidentService) {
	$scope.count = 0;
	$scope.increment = function() {
		$scope.count = $scope.count + 1;
	}
}


var IncidentDetailController = function SecondCtrl($scope, $stateParams,$rootScope,
		IncidentService) {
	$scope.pageValue = 'Incident Detail Page';
	$scope.incId = $stateParams.incId;
}