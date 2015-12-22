(function ()
{
    'use strict';

    angular
        .module('app.sandwich')
        .controller('DetailController', DetailController);

    /** @ngInject */
    function DetailController(SampleData,$stateParams)
    {
        var ctrl = this;

        // Data
        ctrl.helloText = SampleData.data.helloText;
        ctrl.incidentId = $stateParams.incId;

        // Methods

        //////////
    }
})();
