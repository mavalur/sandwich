(function ()
{
    'use strict';

    angular
        .module('app.sandwich')
        .controller('ChatController', ChatController);

    /** @ngInject */
    function ChatController(SampleData)
    {
        var ctrl = this;

        // Data
        ctrl.helloText = SampleData.data.helloText;

        // Methods

        //////////
    }
})();
