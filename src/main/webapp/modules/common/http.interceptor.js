/**
 * Created by Administrator on 2017/8/29.
 */
app.factory("HttpInterceptor",function () {
        return {
            request:function (config) {

                return config;
            }
        };
})