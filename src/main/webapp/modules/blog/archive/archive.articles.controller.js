
app.controller("ArchiveArticleController",function ($scope,$routeParams,ArchiveService) {

    $scope.getArchiveArticles=function (name) {
        ArchiveService.getArticles(name).then(function (data) {
            console.log(data);
            $scope.archiveArticles = data.resultData;
        });
    }
    $scope.init=function () {
        if($routeParams.archiveName!=''){
            $scope.getArchiveArticles($routeParams.archiveName);
        }
    }
    $scope.init();
})