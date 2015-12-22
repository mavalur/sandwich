(function ()
{
    'use strict';

    angular
        .module('app.sandwich')
        .controller('DetailController', DetailController);

    /** @ngInject */
    function DetailController(SampleData,$stateParams)
    {
        var vm = this; 
        this.incId = $stateParams.incId;
        this.widget5 = this.widget5 || {};
        this.widget5.title = 'Recent Incident Issues';

        this.widget6= this.widget6 || {};
        this.widget6.title = 'Task Distribution';

        this.widget7= this.widget7 || {};
        this.widget7.title = 'Some other widget';
        
        this.viewerUrl  = '';
        
        $('.shared').hide();
        
	    screenleap.onScreenShareStart = function() {
	        alert('Your screen is now shared.');
       		$('.shared').show();
       		$('.not-shared').hide();
       		$('.paused').hide();
       		$('.resumed').show();
	    };
	    
	    screenleap.onScreenShareEnd = function() {
	        alert('Your screen share has ended.');
       		$('.shared').hide();
       		$('.not-shared').show();
	    };
	    
	    screenleap.onPause = function() {
       		$('.paused').show();
       		$('.resumed').hide();
	    }

	    screenleap.onResume = function() {
       		$('.paused').hide();
       		$('.resumed').show();
	    }
	    
	    screenleap.error = function(action, errorMessage, xhr) {
	        var msg = action + ': ' + errorMessage;
	        if (xhr) {
	            msg += ' (' + xhr.status + ')';
	        }
	        alert('Error in ' + msg);
	    };
		

	    this.startShare = function() {
	    	$.ajax({
	        	url: "/screenshare",
	        	type: "POST"
	    	}).done(function(data) {
		    	screenleap.startSharing('NATIVE', data);
	       		vm.viewerUrl = screenleap.getViewerUrl();
	    	});
	    };
    
	    this.pauseShare =  function() {
	    	screenleap.pauseSharing(); 
	    }

	    this.resumeShare= function() {
	    	screenleap.resumeSharing(); 
	    }
	    
	    this.stopShare= function() {
	    	screenleap.stopSharing();
       		vm.viewerUrl = '';
	    }
    }
})();
