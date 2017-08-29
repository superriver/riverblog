/**
 * Created by Administrator on 2017-8-26.
 */
app.controller("IndexController",function (IndexService,$scope) {
    var getlist=function () {
        console.log("IndexController--");
        IndexService.list().then(function (data) {
            console.log("IndexController"+data);
            $scope.datas=data.resultData;
        });
    };
    getlist();
})