/**
 * Created by Administrator on 2017-8-26.
 */
app.controller("IndexController",function (IndexService,$scope) {
    var getlist=function () {
        IndexService.list().then(function (data) {
            console.log("IndexController"+data);
            $scope.datas=data.resultData;
        });
    };
    getlist();
})