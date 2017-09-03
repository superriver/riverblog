/**
 * Created by Administrator on 2017/9/1.
 */
app.controller("ArticleController", function (ArticleService, $scope, $location) {
    var p = $location.search().page;
    $scope.currentPage = p ? p : 1;
    $scope.pageSize = 10;

    var getList = function (currentPage, pageSize) {
        if (currentPage > $scope.totalItems || currentPage <= 0) {
            $location.search(currentPage);
        } else {
            ArticleService.list().then(function (data) {
                if (data.resultCode == 1) {
                    console.log("IndexController" + data);
                    $scope.articles = data.resultData;
                    //$scope.totalItems = data.
                    $scope.currentPage = currentPage;
                } else {

                }

            });
        }

    };
    getList();
});