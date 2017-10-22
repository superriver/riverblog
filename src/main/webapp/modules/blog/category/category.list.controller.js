/**
 * Created by Administrator on 2017/10/10.
 */
app.controller("CategoryController",function ($window,$location,$routeParams,$rootScope,$scope,CategoryService) {
    console.log("CategoryController--");
    $scope.getCategoryList=function () {
        CategoryService.get().then(function(data){
            $scope.categorys = data.resultData;
        });
    };

    $scope.getCategoryList();
})