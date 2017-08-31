/**
 * Created by phn on 2016/2/2.
 */

var app = angular.module("webApp", ["ngRoute",
    "ui.bootstrap", "ngSanitize", "ui.router", "ngFileUpload"]);

// app.config(function($httpProvider) {
//     $httpProvider.interceptors.push('HttpInterceptor');
// });
app.config(function ($routeProvider, $locationProvider) {
    $routeProvider.when("/",
        {
            templateUrl: "modules/index/index.view.html",
            controller: 'IndexController'
        }
    ).when("/blog",
        {
            templateUrl: "modules/blog/article.view.html",
            controller: 'ArticleController'
        });
    $locationProvider.hashPrefix('!');
});