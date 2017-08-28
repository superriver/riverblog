/**
 * Created by Administrator on 2017-8-26.
 */
app.controller("IndexController",function (IndexService,$scope) {
    console.log("IndexController");
    $scope.list=function () {
        IndexService.list().then(function (data) {
            console.log("IndexController"+data);
            $scope.datas=data.resultData;
        });

    };
    $scope.list();
})