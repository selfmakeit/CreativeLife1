package com.bs.create_life.util;


/**
 * 用作返回的标识
 */
public class JsonValue {

    private Boolean success;

    private Integer code;

    private Object object;

    private String message;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static JsonValue ok() {
        JsonValue jsonValue = new JsonValue();
        jsonValue.setCode(200);
        jsonValue.setMessage("操作成功");
        jsonValue.setSuccess(true);
        return jsonValue;
    }

    public static JsonValue okDate(Object object) {
        JsonValue jsonValue = new JsonValue();
        jsonValue.setCode(200);
        jsonValue.setMessage("操作成功");
        jsonValue.setSuccess(true);
        jsonValue.setObject(object);
        return jsonValue;
    }

    public static JsonValue okMessage(String message) {
        JsonValue jsonValue = new JsonValue();
        jsonValue.setCode(200);
        jsonValue.setMessage(message);
        jsonValue.setSuccess(true);
        return jsonValue;
    }


    public static JsonValue err() {
        JsonValue jsonValue = new JsonValue();
        jsonValue.setCode(500);
        jsonValue.setSuccess(false);
        jsonValue.setMessage("操作失败");
        return jsonValue;
    }

    public static JsonValue errMessage(String message) {
        JsonValue jsonValue = new JsonValue();
        jsonValue.setCode(500);
        jsonValue.setSuccess(false);
        jsonValue.setMessage(message);
        return jsonValue;
    }

    public static JsonValue errData(Object object) {
        JsonValue jsonValue = new JsonValue();
        jsonValue.setCode(500);
        jsonValue.setSuccess(false);
        jsonValue.setObject(object);
        return jsonValue;
    }


}
