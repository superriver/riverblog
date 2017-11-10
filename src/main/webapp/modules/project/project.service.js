/**
 * Created by Administrator on 2017/10/30.
 */
app.service("ProjectService",function (RequestService) {

    this.getList = function () {
        return RequestService.getRequest("/blog/project",cfg_form);
    }
});