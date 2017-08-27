package studio.river.common;

import java.util.List;

/**
 * Created by Administrator on 2017-8-27.
 */
public class CommonResult<E> {
    private int resultCode;
    private String resultMsg;
    private List<E> resultData;

    public CommonResult(int resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public CommonResult(int resultCode, String resultMsg, List<E> resultData) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.resultData = resultData;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public List<E> getResultData() {
        return resultData;
    }

    public void setResultData(List<E> resultData) {
        this.resultData = resultData;
    }
}
