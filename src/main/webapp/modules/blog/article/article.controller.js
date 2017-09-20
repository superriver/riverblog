/**
 * Created by Administrator on 2017/9/1.
 */
app.controller("ArticleController", function (ArticleService, $scope, $location) {
    var p = $location.search().page;

    $scope.currentPage = p ? p : 1;
    $scope.pageSize = 3;
    $scope.pageChanged=function (currentPage) {
        $location.search({page:currentPage});
    };
    var getList = function (currentPage, pageSize) {
        if (currentPage > $scope.totalItems || currentPage <= 0) {
            $location.search(currentPage);
        } else {
            console.log("currentPage--" + currentPage);
            ArticleService.list(currentPage,pageSize).then(function (data) {
                if (data.resultCode == 1) {
                    console.log("ArticleController" + data.resultData.pageBean.totalCount);
                    $scope.articles = data.resultData.pageList;
                    $scope.totalItems = data.resultData.pageBean.totalCount;
                    $scope.currentPage = currentPage;
                } else {
                    console.log("ArticleController" + data.resultCode);
                }

            });
        }

    };
    getList( $scope.currentPage, $scope.pageSize);
});