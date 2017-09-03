/**
 * Created by Administrator on 2017/9/1.
 */
app.service("ArticleService",function (RequestService) {
    this.list=function () {
        return RequestService.getRequest("/blog",cfg_form)
    };
})