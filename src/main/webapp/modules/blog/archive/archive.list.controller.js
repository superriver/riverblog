/**
 * Created by Administrator on 2017/10/10.
 */
app.controller("ArchiveController",function ($window,$location,$routeParams,$rootScope,$scope,ArchiveService) {
    console.log("ArchiveController--");
    $scope.getArchiveList=function () {
        ArchiveService.get().then(function(data){
            $scope.archives = data.resultData;
        });
    };
    $scope.selectArchive=function (name) {
           $location.path("/blog/archive/"+name);
    }

    $scope.getArchiveList();
})