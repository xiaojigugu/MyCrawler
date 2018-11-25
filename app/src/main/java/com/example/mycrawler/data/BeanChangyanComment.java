package com.example.mycrawler.data;

import java.util.List;

public class BeanChangyanComment {

    /**
     * cmt_cnt : 540
     * cmt_sum : 540
     * comments : [{"attachments":[],"comment_id":1577618949,"comments":[],"content":"道基毁了？我想应该会有更好的筑基方法吧，毕竟王宝乐可是主角！好看的书，情节安排紧凑又合理，有惊险也有安闲，不时甩个段子，看上瘾了，希望更新快点，耳根加油！","create_time":1538798866000,"elite":false,"floor_count":0,"from":"Goodwap版","hide":false,"hide_floor":false,"highlight":false,"ip":"42.242.128.239","ip_location":"云南省","metadata":"{\"clientPort\":\"26439\"}","metadataAsJson":{"clientPort":"26439"},"oppose_count":0,"passport":{"expired":false,"fee":0,"followers_count":0,"from":"","grant":false,"img_url":"http://sucimg.itc.cn/avatarimg/10081154506282_1538748825444_c55","is_official":false,"is_shared":false,"nickname":"Itsagoodboy","platform_id":3,"user_id":10081154506282},"quick":false,"reply_count":0,"reply_id":0,"score":0,"status":0,"support_count":0,"top":false,"userScore":{"isvId":0,"level":2,"levelUp":0,"privilege":{},"score":2,"title":"冒泡","userId":0},"user_id":10081154506282},{"attachments":[],"comment_id":1577615038,"comments":[],"content":"编主注意身体，好身体才能有一个好的写作环境","create_time":1538795645000,"elite":false,"floor_count":0,"from":"Good客户端","hide":false,"hide_floor":false,"highlight":false,"ip":"61.158.149.76","ip_location":"河南省开封市","metadata":"metadata","oppose_count":0,"passport":{"expired":false,"fee":0,"followers_count":0,"from":"","grant":false,"img_url":"http://sucimg.itc.cn/avatarimg/10081020497060_1538713608464_c55","is_official":false,"is_shared":false,"nickname":"妓","platform_id":-1,"user_id":10081020497060},"quick":false,"reply_count":0,"reply_id":0,"score":1,"status":0,"support_count":0,"top":false,"userScore":{"isvId":0,"level":2,"levelUp":0,"privilege":{},"score":3,"title":"冒泡","userId":0},"user_id":10081020497060},{"attachments":[],"comment_id":1577613134,"comments":[],"content":"扎个根，插个眼，到时候养肥了再看","create_time":1538794040000,"elite":false,"floor_count":0,"from":"Goodwap版","hide":false,"hide_floor":false,"highlight":false,"ip":"223.104.65.184","ip_location":"","metadata":"{\"clientPort\":\"7404\"}","metadataAsJson":{"clientPort":"7404"},"oppose_count":0,"passport":{"expired":false,"fee":0,"followers_count":0,"from":"","grant":false,"img_url":"http://sucimg.itc.cn/avatarimg/10079091205258_1538115396020_c55","is_official":false,"is_shared":false,"nickname":"小号一号","platform_id":3,"user_id":10079091205258},"quick":false,"reply_count":0,"reply_id":0,"score":0,"status":0,"support_count":0,"top":false,"userScore":{"isvId":0,"level":2,"levelUp":0,"privilege":{},"score":3,"title":"冒泡","userId":0},"user_id":10079091205258}]
     * topic_id : 4732097367
     */

    private int cmt_cnt;
    private int cmt_sum;
    private long topic_id;
    private List<CommentsBean> comments;

    public int getCmt_cnt() {
        return cmt_cnt;
    }

    public void setCmt_cnt(int cmt_cnt) {
        this.cmt_cnt = cmt_cnt;
    }

    public int getCmt_sum() {
        return cmt_sum;
    }

    public void setCmt_sum(int cmt_sum) {
        this.cmt_sum = cmt_sum;
    }

    public long getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(long topic_id) {
        this.topic_id = topic_id;
    }

    public List<CommentsBean> getComments() {
        return comments;
    }

    public void setComments(List<CommentsBean> comments) {
        this.comments = comments;
    }

    public static class CommentsBean {
        /**
         * attachments : []
         * comment_id : 1577618949
         * comments : []
         * content : 道基毁了？我想应该会有更好的筑基方法吧，毕竟王宝乐可是主角！好看的书，情节安排紧凑又合理，有惊险也有安闲，不时甩个段子，看上瘾了，希望更新快点，耳根加油！
         * create_time : 1538798866000
         * elite : false
         * floor_count : 0
         * from : Goodwap版
         * hide : false
         * hide_floor : false
         * highlight : false
         * ip : 42.242.128.239
         * ip_location : 云南省
         * metadata : {"clientPort":"26439"}
         * metadataAsJson : {"clientPort":"26439"}
         * oppose_count : 0
         * passport : {"expired":false,"fee":0,"followers_count":0,"from":"","grant":false,"img_url":"http://sucimg.itc.cn/avatarimg/10081154506282_1538748825444_c55","is_official":false,"is_shared":false,"nickname":"Itsagoodboy","platform_id":3,"user_id":10081154506282}
         * quick : false
         * reply_count : 0
         * reply_id : 0
         * score : 0
         * status : 0
         * support_count : 0
         * top : false
         * userScore : {"isvId":0,"level":2,"levelUp":0,"privilege":{},"score":2,"title":"冒泡","userId":0}
         * user_id : 10081154506282
         */

        private int comment_id;
        private String content;
        private long create_time;
        private boolean elite;
        private int floor_count;
        private String from;
        private boolean hide;
        private boolean hide_floor;
        private boolean highlight;
        private String ip;
        private String ip_location;
        private String metadata;
        private MetadataAsJsonBean metadataAsJson;
        private int oppose_count;
        private PassportBean passport;
        private boolean quick;
        private int reply_count;
        private int reply_id;
        private int score;
        private int status;
        private int support_count;
        private boolean top;
        private UserScoreBean userScore;
        private long user_id;
        private List<?> attachments;
        private List<?> comments;

        public int getComment_id() {
            return comment_id;
        }

        public void setComment_id(int comment_id) {
            this.comment_id = comment_id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public long getCreate_time() {
            return create_time;
        }

        public void setCreate_time(long create_time) {
            this.create_time = create_time;
        }

        public boolean isElite() {
            return elite;
        }

        public void setElite(boolean elite) {
            this.elite = elite;
        }

        public int getFloor_count() {
            return floor_count;
        }

        public void setFloor_count(int floor_count) {
            this.floor_count = floor_count;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public boolean isHide() {
            return hide;
        }

        public void setHide(boolean hide) {
            this.hide = hide;
        }

        public boolean isHide_floor() {
            return hide_floor;
        }

        public void setHide_floor(boolean hide_floor) {
            this.hide_floor = hide_floor;
        }

        public boolean isHighlight() {
            return highlight;
        }

        public void setHighlight(boolean highlight) {
            this.highlight = highlight;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getIp_location() {
            return ip_location;
        }

        public void setIp_location(String ip_location) {
            this.ip_location = ip_location;
        }

        public String getMetadata() {
            return metadata;
        }

        public void setMetadata(String metadata) {
            this.metadata = metadata;
        }

        public MetadataAsJsonBean getMetadataAsJson() {
            return metadataAsJson;
        }

        public void setMetadataAsJson(MetadataAsJsonBean metadataAsJson) {
            this.metadataAsJson = metadataAsJson;
        }

        public int getOppose_count() {
            return oppose_count;
        }

        public void setOppose_count(int oppose_count) {
            this.oppose_count = oppose_count;
        }

        public PassportBean getPassport() {
            return passport;
        }

        public void setPassport(PassportBean passport) {
            this.passport = passport;
        }

        public boolean isQuick() {
            return quick;
        }

        public void setQuick(boolean quick) {
            this.quick = quick;
        }

        public int getReply_count() {
            return reply_count;
        }

        public void setReply_count(int reply_count) {
            this.reply_count = reply_count;
        }

        public int getReply_id() {
            return reply_id;
        }

        public void setReply_id(int reply_id) {
            this.reply_id = reply_id;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getSupport_count() {
            return support_count;
        }

        public void setSupport_count(int support_count) {
            this.support_count = support_count;
        }

        public boolean isTop() {
            return top;
        }

        public void setTop(boolean top) {
            this.top = top;
        }

        public UserScoreBean getUserScore() {
            return userScore;
        }

        public void setUserScore(UserScoreBean userScore) {
            this.userScore = userScore;
        }

        public long getUser_id() {
            return user_id;
        }

        public void setUser_id(long user_id) {
            this.user_id = user_id;
        }

        public List<?> getAttachments() {
            return attachments;
        }

        public void setAttachments(List<?> attachments) {
            this.attachments = attachments;
        }

        public List<?> getComments() {
            return comments;
        }

        public void setComments(List<?> comments) {
            this.comments = comments;
        }

        public static class MetadataAsJsonBean {
            /**
             * clientPort : 26439
             */

            private String clientPort;

            public String getClientPort() {
                return clientPort;
            }

            public void setClientPort(String clientPort) {
                this.clientPort = clientPort;
            }
        }

        public static class PassportBean {
            /**
             * expired : false
             * fee : 0
             * followers_count : 0
             * from :
             * grant : false
             * img_url : http://sucimg.itc.cn/avatarimg/10081154506282_1538748825444_c55
             * is_official : false
             * is_shared : false
             * nickname : Itsagoodboy
             * platform_id : 3
             * user_id : 10081154506282
             */

            private boolean expired;
            private int fee;
            private int followers_count;
            private String from;
            private boolean grant;
            private String img_url;
            private boolean is_official;
            private boolean is_shared;
            private String nickname;
            private int platform_id;
            private long user_id;

            public boolean isExpired() {
                return expired;
            }

            public void setExpired(boolean expired) {
                this.expired = expired;
            }

            public int getFee() {
                return fee;
            }

            public void setFee(int fee) {
                this.fee = fee;
            }

            public int getFollowers_count() {
                return followers_count;
            }

            public void setFollowers_count(int followers_count) {
                this.followers_count = followers_count;
            }

            public String getFrom() {
                return from;
            }

            public void setFrom(String from) {
                this.from = from;
            }

            public boolean isGrant() {
                return grant;
            }

            public void setGrant(boolean grant) {
                this.grant = grant;
            }

            public String getImg_url() {
                return img_url;
            }

            public void setImg_url(String img_url) {
                this.img_url = img_url;
            }

            public boolean isIs_official() {
                return is_official;
            }

            public void setIs_official(boolean is_official) {
                this.is_official = is_official;
            }

            public boolean isIs_shared() {
                return is_shared;
            }

            public void setIs_shared(boolean is_shared) {
                this.is_shared = is_shared;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public int getPlatform_id() {
                return platform_id;
            }

            public void setPlatform_id(int platform_id) {
                this.platform_id = platform_id;
            }

            public long getUser_id() {
                return user_id;
            }

            public void setUser_id(long user_id) {
                this.user_id = user_id;
            }
        }

        public static class UserScoreBean {
            /**
             * isvId : 0
             * level : 2
             * levelUp : 0
             * privilege : {}
             * score : 2
             * title : 冒泡
             * userId : 0
             */

            private int isvId;
            private int level;
            private int levelUp;
            private PrivilegeBean privilege;
            private int score;
            private String title;
            private int userId;

            public int getIsvId() {
                return isvId;
            }

            public void setIsvId(int isvId) {
                this.isvId = isvId;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public int getLevelUp() {
                return levelUp;
            }

            public void setLevelUp(int levelUp) {
                this.levelUp = levelUp;
            }

            public PrivilegeBean getPrivilege() {
                return privilege;
            }

            public void setPrivilege(PrivilegeBean privilege) {
                this.privilege = privilege;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public static class PrivilegeBean {
            }
        }
    }
}
