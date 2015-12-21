(function ()
{
    'use strict';

    angular
        .module('app.sandwich')
        .controller('DashboardController', DashboardController);

    /** @ngInject */
    function DashboardController(SampleData)
    {
        var vm = this;

        // Data
        vm.helloText = SampleData.data.helloText;

        // Methods

        //////////
    }
})();
