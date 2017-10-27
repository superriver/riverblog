/**
 * Created by Administrator on 2017-10-5.
 */
app.controller("ArticleDetailController",function($scope,$routeParams,ArticleService){

    $scope.get=function (articleCode) {
        ArticleService.get(articleCode).then(function(data){
            if(data.resultCode==0)
            {
                $scope.error=true;
            }else{
                console.log("ArticleDetailController--"+data)
                $scope.article =data.resultData.currentArticle;
                $scope.preArticle = data.resultData.preArticle;
                $scope.nextArticle = data.resultData.nextArticle;
            }
        });
    }


    $scope.get($routeParams.articleCode)
})