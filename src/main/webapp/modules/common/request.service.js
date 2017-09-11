/**
 * Created by Administrator on 2017-8-26.
 */
app.service("RequestService",function ($http,$q) {
        this.getRequest=function (url,paramType) {
            var deferred =$q.defer();
            console.log("---"+web_project_name+url,paramType);
            $http.get(web_project_name+url,paramType).success(function (data) {
                deferred.resolve(data);
            });
            return deferred.promise;
        };

        this.postRequest=function (url,params,paramType) {
            var deferred = $q.defer();
            $http.post(web_project_name+url,params,paramType).success(function (data) {
                deferred.resolve(data);
            }).error(function (e) {
                console.log(e);
            });
            return deferred.promise;
        };
})