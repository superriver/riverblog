app.controller("CategoryArticleController",function ($scope,$routeParams,CategoryService) {
    console.log("CategoryArticleController--");

    $scope.getCategoryArticles=function (code) {
        CategoryService.getArticles(code).then(function (data) {
            console.log(data);
            $scope.categoryArticles = data.resultData;
        });
    }
    console.log("CategoryArticleController--"+$routeParams.categoryCode);

    $scope.getCategoryArticles($routeParams.categoryCode)
})