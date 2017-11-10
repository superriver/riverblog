/**
 * Created by Administrator on 2017-8-26.
 */
app.controller("IndexController",function (IndexService,$scope) {
    var getList=function () {
        IndexService.list().then(function (data) {
            $scope.articles=data.resultData;
        });
    };
    getList();
})