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
    ).
    when("/blog",
        {
            templateUrl: "modules/blog/article/article.view.html",
            controller: 'ArticleController'
        }).
    when("/blog/article/:articleCode", {
        templateUrl : "modules/blog/article/article.detail.view.html",
        controller : 'ArticleDetailController'
    }).
    when("/blog/archive",{
        templateUrl : "modules/blog/archive/archive.list.view.html",
        controller:'ArchiveController'
    }).
    when("/blog/archive/:archiveName",{
        templateUrl : "modules/blog/archive/archive.articles.view.html",
        controller:'ArchiveArticleController'
    });

    $locationProvider.hashPrefix('!');
});