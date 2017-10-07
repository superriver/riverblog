/**
 * Created by Administrator on 2017/9/1.
 */
app.service("ArticleService",function (RequestService) {
    this.list=function (pageNumber, pageSize) {
        console.log("ArticleService--" + pageNumber);
        return RequestService.postRequest("/blog",$.param({
            "pageNumber":pageNumber,
            "pageSize":pageSize
        }),cfg_form);


    };
    this.get = function (code) {
        return RequestService.getRequest('/blog/article/' + code, cfg_form);
    };
});