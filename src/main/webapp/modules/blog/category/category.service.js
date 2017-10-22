/**
 * Created by Administrator on 2017/10/10.
 */
app.service("CategoryService",function (RequestService) {
    console.log("CategoryService--");
    this.get = function () {
        return RequestService.getRequest('/blog/category', cfg_form);
    };
    this.getArticles=function (name) {
        return RequestService.getRequest('/blog/category/'+name, cfg_form);
    }
})