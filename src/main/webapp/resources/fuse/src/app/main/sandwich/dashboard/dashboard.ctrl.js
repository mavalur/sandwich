(function ()
{
    'use strict';

    angular
        .module('app.sandwich')
        .controller('DashboardProjectController', DashboardProjectController);

    /** @ngInject */
    function DashboardProjectController($scope, $interval,DashboardData,IncidentService)
    {
     	var vm = this; 
     	this.widget5 = this.widget5 || {};
     	this.widget5.title = 'Recent Incident Issues';

     	this.widget6= this.widget6 || {};
     	this.widget6.title = 'Task Distrubution';

     	this.widget7= this.widget7 || {};
     	this.widget7.title = 'Some other widget';

    }

})();