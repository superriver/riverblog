/**
 * Created by phn on 2016/2/2.
 */

var app = angular.module("webApp", ["ngRoute",
		'ui.bootstrap', "ngSanitize", "ui.router", "ngFileUpload" ]);


app.config(function($routeProvider,$locationProvider){
	$routeProvider.when("/",
			{
				templateUrl:"modules/index/index.view.html",
				controller:'IndexController'
			}
		);
    $locationProvider.hashPrefix('!');
});