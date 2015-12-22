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
        
        this.shareViewerUrl = '';
        
		window.onload = function() {
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
		}

	    function startShare() {
	    	$.ajax({
	        	url: "/screenshare"
	    	}).done(function(data) {
		    	screenleap.startSharing('NATIVE', data);
		    	this.shareViewerUrl = data.viewerUrl;
	       		$('#viewerUrl').attr('href', data.viewerUrl);
	       		$('#viewerUrl').text(data.viewerUrl);
	    	});
	    }
    
	    function pauseShare() {
	    	screenleap.pauseSharing(); 
	    }

	    function resumeShare() {
	    	screenleap.resumeSharing(); 
	    }
	    
	    function stopShare() {
	    	screenleap.stopSharing();
	    	this.shareViewerUrl = '';
       		$('#viewerUrl').attr('href', '');
       		$('#viewerUrl').text('');
	    }
    }
})();
