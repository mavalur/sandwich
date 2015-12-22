(function ()
{
    'use strict';

    angular
        .module('app.sandwich', [])
        .config(config);

    /** @ngInject */
    function config($stateProvider, $translatePartialLoaderProvider, msNavigationServiceProvider)
    {
        // State
        $stateProvider
            .state('app.dashboard', {
                url    : '/incident',
                views  : {
                    'content@app': {
                        templateUrl: 'app/main/sandwich/dashboard/dashboard.tpl.html',
                        controller : 'DashboardProjectController as vm'
                    }
                },
            resolve  : {
                DashboardData: function (apiResolver)
                {
                    return {
                            data:{
                                helloText:'detail page'
                            }
                        }
                }
            },
            bodyClass: 'dashboard-project'        
            }).state('app.dashboard.detail', {
                url    : '/:incId',
                views  : {
                    'content@app': {
                        templateUrl: 'app/main/sandwich/detail/detail.tpl.html',
                        controller : 'DetailController as vm'
                    }
                },
                resolve: {
                    SampleData: function (apiResolver)
                    {
                        return {
                            data:{
                                helloText:'detail page'
                            }
                        }
                    }
                }
            }).state('app.dashboard.detail.chat', {
                url    : '/chat',
                views  : {
                    'content@app': {
                        templateUrl: 'app/main/sandwich/chat/chat.tpl.html',
                        controller : 'ChatController as ctrl'
                    }
                },
                resolve: {
                    SampleData: function (apiResolver)
                    {
                        return {
                            data:{
                                helloText:'Chat page'
                            }
                        }
                    }
                }
            });

        
    }
})();