/*var appController = (function(message) {
  alert(message);
}('foo'));*/

/**
 * Module
 * 
 * Description ['ngLodash', 'angular-timeline', 'ui.router', 'ngAnimate',
 * 'ngTouch', 'ui.grid', 'ui.grid.cellNav', 'ui.grid.edit',
 * 'ui.grid.resizeColumns', 'ui.grid.pinning', 'ui.grid.selection',
 * 'ui.grid.moveColumns', 'ui.grid.exporter', 'ui.grid.importer',
 * 'ui.grid.grouping']
 */

var App = angular.module("sandwich", [ 'ui.router', 'angular-timeline',
		'ui.grid.edit', 'ui.grid.resizeColumns', 'ui.grid.pinning',
		'ui.grid.selection', 'ui.grid.moveColumns', 'ui.grid.grouping' ]);

App.config(function($stateProvider, $urlRouterProvider) {
	$urlRouterProvider.otherwise("/")

	$stateProvider.state('incident', {
		url : "/",
		templateUrl:"template/base.html"
	})
	$stateProvider.state('incident.dashboard', {
		url : "incident",
		views:{
			'@':{
				templateUrl : "/template/inc.html",
				controller : GlobalController		
			}
		}
	}).state('incident.dashboard.detail', {
		url : ":incId",
		views:{
			'incidentChildView@incident.dashboard.detail':{
				templateUrl : "/template/incDetail.html",
				controller:IncidentDetailController	
			}
		}
		
	});
});
