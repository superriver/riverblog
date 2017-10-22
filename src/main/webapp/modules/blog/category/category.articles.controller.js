
app.controller("CategoryArticleController",function ($scope,$routeParams,ArchiveService) {

    $scope.getCategoryArticles=function (name) {
        ArchiveService.getArticles(code).then(function (data) {
            console.log(data);
            $scope.categoryArticles = data.resultData;
        });
    }
    $scope.getCategoryArticles($routeParams.code)
})