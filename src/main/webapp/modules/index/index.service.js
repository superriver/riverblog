
/**
 * Created by Administrator on 2017-8-26.
 */
app.service("IndexService",function (RequestService) {
    this.list=function () {
        return RequestService.getRequest('/recent',cfg_form);
    };
});