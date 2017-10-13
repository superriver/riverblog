/**
 * Created by Administrator on 2017/10/10.
 */
app.service("ArchiveService",function (RequestService) {
    console.log("ArchiveService--");
    this.get = function () {
        return RequestService.getRequest('/blog/archive', cfg_form);
    };
    this.getArticles=function (name) {
        return RequestService.getRequest('/blog/archive/'+name, cfg_form);
    }
})