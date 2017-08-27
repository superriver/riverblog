/**
 * Created by Administrator on 2017-8-26.
 */
app.controller("IndexController",function (IndexService,$scope) {

    $scope.list=function () {
        IndexService.list().then(function (data) {
            $scope.datas=data.resultData;
        });

    };
    $scope.list();
})