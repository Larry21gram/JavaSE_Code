package com.function;

import net.sf.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class CallBack {


    /**
     * success : 1
     * result : {"status":"ALREADY_ATT","phone":"13800138000","area":"010","postno":"100000","att":"中国,北京","ctype":"中国移动138卡","par":"1380013","prefix":"138","operators":"中国移动","style_simcall":"中国,北京","style_citynm":"中华人民共和国,北京市"}
     */

    private String success;
    private ResultBean result;

    public static void main(String[] args) throws IOException {
        callBackFond("18702770923");
    }

    public static void callBackFond(String number) throws IOException {
        // 1、查询归属地

        // 建立资源定位符
        URL url = new URL("http://api.k780.com/?app=phone.get&phone="+number + "&appkey=10003&sign" +
                "=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json");

        URLConnection connection = url.openConnection();

        //从网络中获取数据， 建立流。
        InputStream inputStream = connection.getInputStream();

        //获得json字符串
        byte[] bytes = new byte[1024 * 8];
        StringBuffer buffer = new StringBuffer();

        int len = 0;
        while ((len = inputStream.read(bytes)) != -1) {
            buffer.append(new String(bytes, 0, len));
        }

        //解析获得的数据
        JSONObject jsonObject = JSONObject.fromObject(buffer.toString());
        CallBack callBack = (CallBack) JSONObject.toBean(jsonObject,CallBack.class);

        System.out.println(callBack);

        inputStream.close();
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CallBack{" + result + '}';
    }

    public static class ResultBean {
        /**
         * status : ALREADY_ATT
         * phone : 13800138000
         * area : 010
         * postno : 100000
         * att : 中国,北京
         * ctype : 中国移动138卡
         * par : 1380013
         * prefix : 138
         * operators : 中国移动
         * style_simcall : 中国,北京
         * style_citynm : 中华人民共和国,北京市
         */

        private String status;
        private String phone;
        private String area;
        private String postno;
        private String att;
        private String ctype;
        private String par;
        private String prefix;
        private String operators;
        private String style_simcall;
        private String style_citynm;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getPostno() {
            return postno;
        }

        public void setPostno(String postno) {
            this.postno = postno;
        }

        public String getAtt() {
            return att;
        }

        public void setAtt(String att) {
            this.att = att;
        }

        public String getCtype() {
            return ctype;
        }

        public void setCtype(String ctype) {
            this.ctype = ctype;
        }

        public String getPar() {
            return par;
        }

        public void setPar(String par) {
            this.par = par;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getOperators() {
            return operators;
        }

        public void setOperators(String operators) {
            this.operators = operators;
        }

        public String getStyle_simcall() {
            return style_simcall;
        }

        public void setStyle_simcall(String style_simcall) {
            this.style_simcall = style_simcall;
        }

        public String getStyle_citynm() {
            return style_citynm;
        }

        public void setStyle_citynm(String style_citynm) {
            this.style_citynm = style_citynm;
        }

        @Override
        public String toString() {
            return "phone='" + phone + '\'' +
                    ", operators='" + operators + '\'' +
                    ", style_citynm='" + style_citynm ;
        }
    }
}
