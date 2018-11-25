package com.example.mycrawler.data;

public class BeanBookContent {

    /**
     * status : 1
     * info : success
     */

    private int status;
    private String info;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 146769
         * name : 剑来
         * cid : 7447717
         * cname : 第九章 天雨虽宽
         * pid : 7447716
         * nid : 7447718
         * hasContent : 1
         */

        private int id;
        private String name;
        private int cid;
        private String cname;
        private int pid;
        private int nid;
        private String content;
        private int hasContent;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCid() {
            return cid;
        }

        public void setCid(int cid) {
            this.cid = cid;
        }

        public String getCname() {
            return cname;
        }

        public void setCname(String cname) {
            this.cname = cname;
        }

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public int getNid() {
            return nid;
        }

        public void setNid(int nid) {
            this.nid = nid;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getHasContent() {
            return hasContent;
        }

        public void setHasContent(int hasContent) {
            this.hasContent = hasContent;
        }
    }
}
