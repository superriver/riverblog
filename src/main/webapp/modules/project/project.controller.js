
/**
 * Created by Administrator on 2017/10/30.
 */
app.controller("ProjectController",function ($scope,ProjectService) {
    this.getList =  ProjectService.getList().then(function (data) {
        $scope.projects = data.resultData;
    });
    getList();
})