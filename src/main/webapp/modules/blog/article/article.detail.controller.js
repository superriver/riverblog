/**
 * Created by Administrator on 2017-10-5.
 */
app.controller("ArticleDetailController",function($scope,$routeParams,ArticleService){

    $scope.get=function (articleCode) {
        ArticleService.get (articleCode).then(function(data){
            if(data.resultCode==0)
            {
                $scope.error=true;
            }else{
                $scope.article =data.resultData.currentArticle;
            }
        });
    }


    $scope.get($routeParams.articleCode)
})