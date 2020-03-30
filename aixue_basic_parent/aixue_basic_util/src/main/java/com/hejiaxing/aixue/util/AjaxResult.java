package com.hejiaxing.aixue.util;

public class AjaxResult {
    private Boolean success=true;

    private String msg="操作成功";

    private  Object object;//返回的object的对象

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return  this;
    }

    //提供一个获取对象的方法
    public static  AjaxResult me(){
        return  new AjaxResult();
    }

  /*   *成功的构造器

    public AjaxResult() {
    }
     * 失败的构造
    public AjaxResult( String msg) {
        this.success = false;
        this.msg = msg;
    }*/

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return  this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return  this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
