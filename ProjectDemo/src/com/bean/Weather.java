package com.bean;

import net.sf.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class Weather {

    /**
     * date : 20171213
     * message : Success !
     * status : 200
     * city : 北京
     * count : 1022
     * data : {"shidu":"28%","pm25":27,"pm10":53,"quality":"良","wendu":"-7","ganmao":"极少数敏感人群应减少户外活动","yesterday":{"date":"12日星期二","sunrise":"07:26","high":"高温 -1.0℃","low":"低温 -8.0℃","sunset":"16:50","aqi":25,"fx":"东风","fl":"<3级","type":"多云","notice":"绵绵的云朵，形状千变万化"},"forecast":[{"date":"13日星期三","sunrise":"07:26","high":"高温 0.0℃","low":"低温 -7.0℃","sunset":"16:50","aqi":47,"fx":"东风","fl":"<3级","type":"晴","notice":"lovely sunshine，尽情享受阳光的温暖吧"},{"date":"14日星期四","sunrise":"07:27","high":"高温 -1.0℃","low":"低温 -5.0℃","sunset":"16:50","aqi":70,"fx":"南风","fl":"<3级","type":"阴","notice":"阴天是彩虹的前期之景"},{"date":"15日星期五","sunrise":"07:28","high":"高温 4.0℃","low":"低温 -5.0℃","sunset":"16:50","aqi":57,"fx":"西北风","fl":"<3级","type":"晴","notice":"天气干燥，请适当增加室内湿度"},{"date":"16日星期六","sunrise":"07:29","high":"高温 2.0℃","low":"低温 -7.0℃","sunset":"16:50","aqi":30,"fx":"西北风","fl":"3-4级","type":"晴","notice":"天气干燥，请适当增加室内湿度"},{"date":"17日星期日","sunrise":"07:29","high":"高温 5.0℃","low":"低温 -6.0℃","sunset":"16:51","aqi":81,"fx":"西南风","fl":"<3级","type":"晴","notice":"lovely sunshine，尽情享受阳光的温暖吧"}]}
     */

    private String date;
    private String message;
    private int status;
    private String city;
    private int count;
    private DataBean data;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' + data + '}';
    }

    public static class DataBean {
        /**
         * shidu : 28%
         * pm25 : 27.0
         * pm10 : 53.0
         * quality : 良
         * wendu : -7
         * ganmao : 极少数敏感人群应减少户外活动
         * yesterday : {"date":"12日星期二","sunrise":"07:26","high":"高温 -1.0℃","low":"低温 -8.0℃","sunset":"16:50","aqi":25,"fx":"东风","fl":"<3级","type":"多云","notice":"绵绵的云朵，形状千变万化"}
         * forecast : [{"date":"13日星期三","sunrise":"07:26","high":"高温 0.0℃","low":"低温 -7.0℃","sunset":"16:50","aqi":47,"fx":"东风","fl":"<3级","type":"晴","notice":"lovely sunshine，尽情享受阳光的温暖吧"},{"date":"14日星期四","sunrise":"07:27","high":"高温 -1.0℃","low":"低温 -5.0℃","sunset":"16:50","aqi":70,"fx":"南风","fl":"<3级","type":"阴","notice":"阴天是彩虹的前期之景"},{"date":"15日星期五","sunrise":"07:28","high":"高温 4.0℃","low":"低温 -5.0℃","sunset":"16:50","aqi":57,"fx":"西北风","fl":"<3级","type":"晴","notice":"天气干燥，请适当增加室内湿度"},{"date":"16日星期六","sunrise":"07:29","high":"高温 2.0℃","low":"低温 -7.0℃","sunset":"16:50","aqi":30,"fx":"西北风","fl":"3-4级","type":"晴","notice":"天气干燥，请适当增加室内湿度"},{"date":"17日星期日","sunrise":"07:29","high":"高温 5.0℃","low":"低温 -6.0℃","sunset":"16:51","aqi":81,"fx":"西南风","fl":"<3级","type":"晴","notice":"lovely sunshine，尽情享受阳光的温暖吧"}]
         */

        private String shidu;
        private double pm25;
        private double pm10;
        private String quality;
        private String wendu;
        private String ganmao;
        private YesterdayBean yesterday;
        private List<ForecastBean> forecast;

        public String getShidu() {
            return shidu;
        }

        public void setShidu(String shidu) {
            this.shidu = shidu;
        }

        public double getPm25() {
            return pm25;
        }

        public void setPm25(double pm25) {
            this.pm25 = pm25;
        }

        public double getPm10() {
            return pm10;
        }

        public void setPm10(double pm10) {
            this.pm10 = pm10;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        @Override
        public String toString() {
            return "  湿度：'" + shidu + '\'' +
                    ", pm2.5 ：" + pm25 +
                    ", 空气质量：'" + quality + '\'' +
                    ", 温度：" + wendu + '\'' +
                    ", 适宜：'" + ganmao + '\'' +
                    forecast +
                    '}';
        }

        public static class YesterdayBean {
            /**
             * date : 12日星期二
             * sunrise : 07:26
             * high : 高温 -1.0℃
             * low : 低温 -8.0℃
             * sunset : 16:50
             * aqi : 25.0
             * fx : 东风
             * fl : <3级
             * type : 多云
             * notice : 绵绵的云朵，形状千变万化
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private double aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public double getAqi() {
                return aqi;
            }

            public void setAqi(double aqi) {
                this.aqi = aqi;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }
        }

        public static class ForecastBean {
            @Override
            public String toString() {
                return date + '\'' +
                        " " + sunrise + '\'' +
                        ", 高温：'" + high + '\'' +
                        ", 低温：" + low + '\'' +
                        ", 日落：" + sunset + '\'' +
                        ", 空气质量：" + aqi +
                        ", 风向：" + fx + '\'' +
                        ", 风级：" + fl + '\'' +
                        ", 天气类型：" + type + '\'' +
                        ", 注：" + notice + '\'' +
                        '}';
            }

            /**
             * date : 13日星期三
             * sunrise : 07:26
             * high : 高温 0.0℃
             * low : 低温 -7.0℃
             * sunset : 16:50
             * aqi : 47.0
             * fx : 东风
             * fl : <3级
             * type : 晴
             * notice : lovely sunshine，尽情享受阳光的温暖吧
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private double aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public double getAqi() {
                return aqi;
            }

            public void setAqi(double aqi) {
                this.aqi = aqi;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }
        }
    }
}
