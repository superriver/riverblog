/**
 * Created by Administrator on 2017/10/10.
 */
app.service("CategoryService",function (RequestService) {
    console.log("CategoryService--");
    this.get = function () {
        return RequestService.getRequest('/blog/category', cfg_form);
    };
    this.getArticles=function (code) {
        return RequestService.getRequest('/blog/category/'+code, cfg_form);
    }
})