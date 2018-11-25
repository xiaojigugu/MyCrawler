package com.example.mycrawler.data;

import java.util.List;

public class BeanBookInfo {

    /**
     * status : 1
     * info : success
     * data : {"Id":314829,"Name":"修罗帝尊","Img":"xiuluodizun.jpg","Author":"孤单地飞","Desc":"少年石皓，反夺舍无上强者，得无尽功法、武技、阵法、丹术、符术等秘传，开启了传奇之路。\r\n　　什么天才、什么霸主，在我面前，皆得匍匐。\r\n　　不服者，杀！","CId":95,"CName":"玄幻奇幻","LastTime":"10/3/2018 12:06:06 AM","FirstChapterId":1630268,"LastChapter":"第137章 突破养魂","LastChapterId":1696579,"BookStatus":"连载","SameUserBooks":[{"Id":44902,"Name":"神道丹尊","Author":"孤单地飞","Img":"shendaodanzun.jpg","LastChapterId":2713230,"LastChapter":"新书《修罗帝尊》已经上传","Score":0},{"Id":80,"Name":"剑动九天","Author":"孤单地飞","Img":"jiandongjiutian.jpg","LastChapterId":653136,"LastChapter":"完本感言","Score":0},{"Id":2175,"Name":"横扫荒宇","Author":"孤单地飞","Img":"hengsaohuangyu.jpg","LastChapterId":5058573,"LastChapter":"新书《掌御天下》求支持","Score":0},{"Id":7999,"Name":"永恒天帝","Author":"孤单地飞","Img":"yonghengtiandi.jpg","LastChapterId":4581815,"LastChapter":"第648章 超脱 大结局","Score":0},{"Id":31541,"Name":"掌御天下","Author":"孤单地飞","Img":"zhangyutianxia.jpg","LastChapterId":1961922,"LastChapter":"第八十七章 新的征途","Score":0},{"Id":2543,"Name":"网游之战御天下","Author":"孤单地飞","Img":"wangyouzhizhanyutianxia.jpg","LastChapterId":5064310,"LastChapter":"开新书了","Score":0}],"SameCategoryBooks":[{"Id":308369,"Name":"女装妹妹从没少过麻烦","Img":"nvzhuangmeimeicongmeishaoguomafan.jpg","Score":0},{"Id":269478,"Name":"龙族Ⅴ：悼亡者的归来","Img":"longzuⅤ：daowangzhedeguilai.jpg","Score":0},{"Id":181706,"Name":"无魂无魄","Img":"wuhunwupo.jpg","Score":0},{"Id":234813,"Name":"极品透视学生","Img":"jipintoushixuesheng.jpg","Score":0},{"Id":221121,"Name":"至尊修罗","Img":"zhizunxiuluo.jpg","Score":0},{"Id":301231,"Name":"乡村暧昧高手","Img":"xiangcunaimeigaoshou.jpg","Score":0},{"Id":243523,"Name":"第一狂兵","Img":"diyikuangbing.jpg","Score":0},{"Id":274274,"Name":"竞速编年史","Img":"jingsubiannianshi.jpg","Score":0},{"Id":257374,"Name":"傲世生死行","Img":"aoshishengsixing.jpg","Score":0},{"Id":317996,"Name":"女战神的黑包群","Img":"nvzhanshendeheibaoqun.jpg","Score":0},{"Id":281110,"Name":"镇魂王座","Img":"zhenhunwangzuo.jpg","Score":0},{"Id":198800,"Name":"壹号卫","Img":"yihaowei.jpg","Score":0}],"BookVote":{"BookId":314829,"TotalScore":61,"VoterCount":7,"Score":8.7}}
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
         * Id : 314829
         * Name : 修罗帝尊
         * Img : xiuluodizun.jpg
         * Author : 孤单地飞
         * Desc : 少年石皓，反夺舍无上强者，得无尽功法、武技、阵法、丹术、符术等秘传，开启了传奇之路。
         　　什么天才、什么霸主，在我面前，皆得匍匐。
         　　不服者，杀！
         * CId : 95
         * CName : 玄幻奇幻
         * LastTime : 10/3/2018 12:06:06 AM
         * FirstChapterId : 1630268
         * LastChapter : 第137章 突破养魂
         * LastChapterId : 1696579
         * BookStatus : 连载
         * SameUserBooks : [{"Id":44902,"Name":"神道丹尊","Author":"孤单地飞","Img":"shendaodanzun.jpg","LastChapterId":2713230,"LastChapter":"新书《修罗帝尊》已经上传","Score":0},{"Id":80,"Name":"剑动九天","Author":"孤单地飞","Img":"jiandongjiutian.jpg","LastChapterId":653136,"LastChapter":"完本感言","Score":0},{"Id":2175,"Name":"横扫荒宇","Author":"孤单地飞","Img":"hengsaohuangyu.jpg","LastChapterId":5058573,"LastChapter":"新书《掌御天下》求支持","Score":0},{"Id":7999,"Name":"永恒天帝","Author":"孤单地飞","Img":"yonghengtiandi.jpg","LastChapterId":4581815,"LastChapter":"第648章 超脱 大结局","Score":0},{"Id":31541,"Name":"掌御天下","Author":"孤单地飞","Img":"zhangyutianxia.jpg","LastChapterId":1961922,"LastChapter":"第八十七章 新的征途","Score":0},{"Id":2543,"Name":"网游之战御天下","Author":"孤单地飞","Img":"wangyouzhizhanyutianxia.jpg","LastChapterId":5064310,"LastChapter":"开新书了","Score":0}]
         * SameCategoryBooks : [{"Id":308369,"Name":"女装妹妹从没少过麻烦","Img":"nvzhuangmeimeicongmeishaoguomafan.jpg","Score":0},{"Id":269478,"Name":"龙族Ⅴ：悼亡者的归来","Img":"longzuⅤ：daowangzhedeguilai.jpg","Score":0},{"Id":181706,"Name":"无魂无魄","Img":"wuhunwupo.jpg","Score":0},{"Id":234813,"Name":"极品透视学生","Img":"jipintoushixuesheng.jpg","Score":0},{"Id":221121,"Name":"至尊修罗","Img":"zhizunxiuluo.jpg","Score":0},{"Id":301231,"Name":"乡村暧昧高手","Img":"xiangcunaimeigaoshou.jpg","Score":0},{"Id":243523,"Name":"第一狂兵","Img":"diyikuangbing.jpg","Score":0},{"Id":274274,"Name":"竞速编年史","Img":"jingsubiannianshi.jpg","Score":0},{"Id":257374,"Name":"傲世生死行","Img":"aoshishengsixing.jpg","Score":0},{"Id":317996,"Name":"女战神的黑包群","Img":"nvzhanshendeheibaoqun.jpg","Score":0},{"Id":281110,"Name":"镇魂王座","Img":"zhenhunwangzuo.jpg","Score":0},{"Id":198800,"Name":"壹号卫","Img":"yihaowei.jpg","Score":0}]
         * BookVote : {"BookId":314829,"TotalScore":61,"VoterCount":7,"Score":8.7}
         */

        private int Id;
        private String Name;
        private String Img;
        private String Author;
        private String Desc;
        private int CId;
        private String CName;
        private String LastTime;
        private int FirstChapterId;
        private String LastChapter;
        private int LastChapterId;
        private String BookStatus;
        private BookVoteBean BookVote;
        private List<SameUserBooksBean> SameUserBooks;
        private List<SameCategoryBooksBean> SameCategoryBooks;

        public int getId() {
            return Id;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getImg() {
            return Img;
        }

        public void setImg(String Img) {
            this.Img = Img;
        }

        public String getAuthor() {
            return Author;
        }

        public void setAuthor(String Author) {
            this.Author = Author;
        }

        public String getDesc() {
            return Desc;
        }

        public void setDesc(String Desc) {
            this.Desc = Desc;
        }

        public int getCId() {
            return CId;
        }

        public void setCId(int CId) {
            this.CId = CId;
        }

        public String getCName() {
            return CName;
        }

        public void setCName(String CName) {
            this.CName = CName;
        }

        public String getLastTime() {
            return LastTime;
        }

        public void setLastTime(String LastTime) {
            this.LastTime = LastTime;
        }

        public int getFirstChapterId() {
            return FirstChapterId;
        }

        public void setFirstChapterId(int FirstChapterId) {
            this.FirstChapterId = FirstChapterId;
        }

        public String getLastChapter() {
            return LastChapter;
        }

        public void setLastChapter(String LastChapter) {
            this.LastChapter = LastChapter;
        }

        public int getLastChapterId() {
            return LastChapterId;
        }

        public void setLastChapterId(int LastChapterId) {
            this.LastChapterId = LastChapterId;
        }

        public String getBookStatus() {
            return BookStatus;
        }

        public void setBookStatus(String BookStatus) {
            this.BookStatus = BookStatus;
        }

        public BookVoteBean getBookVote() {
            return BookVote;
        }

        public void setBookVote(BookVoteBean BookVote) {
            this.BookVote = BookVote;
        }

        public List<SameUserBooksBean> getSameUserBooks() {
            return SameUserBooks;
        }

        public void setSameUserBooks(List<SameUserBooksBean> SameUserBooks) {
            this.SameUserBooks = SameUserBooks;
        }

        public List<SameCategoryBooksBean> getSameCategoryBooks() {
            return SameCategoryBooks;
        }

        public void setSameCategoryBooks(List<SameCategoryBooksBean> SameCategoryBooks) {
            this.SameCategoryBooks = SameCategoryBooks;
        }

        public static class BookVoteBean {
            /**
             * BookId : 314829
             * TotalScore : 61
             * VoterCount : 7
             * Score : 8.7
             */

            private int BookId;
            private int TotalScore;
            private int VoterCount;
            private double Score;

            public int getBookId() {
                return BookId;
            }

            public void setBookId(int BookId) {
                this.BookId = BookId;
            }

            public int getTotalScore() {
                return TotalScore;
            }

            public void setTotalScore(int TotalScore) {
                this.TotalScore = TotalScore;
            }

            public int getVoterCount() {
                return VoterCount;
            }

            public void setVoterCount(int VoterCount) {
                this.VoterCount = VoterCount;
            }

            public double getScore() {
                return Score;
            }

            public void setScore(double Score) {
                this.Score = Score;
            }
        }

        public static class SameUserBooksBean {
            /**
             * Id : 44902
             * Name : 神道丹尊
             * Author : 孤单地飞
             * Img : shendaodanzun.jpg
             * LastChapterId : 2713230
             * LastChapter : 新书《修罗帝尊》已经上传
             * Score : 0
             */

            private int Id;
            private String Name;
            private String Author;
            private String Img;
            private int LastChapterId;
            private String LastChapter;
            private int Score;

            public int getId() {
                return Id;
            }

            public void setId(int Id) {
                this.Id = Id;
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public String getAuthor() {
                return Author;
            }

            public void setAuthor(String Author) {
                this.Author = Author;
            }

            public String getImg() {
                return Img;
            }

            public void setImg(String Img) {
                this.Img = Img;
            }

            public int getLastChapterId() {
                return LastChapterId;
            }

            public void setLastChapterId(int LastChapterId) {
                this.LastChapterId = LastChapterId;
            }

            public String getLastChapter() {
                return LastChapter;
            }

            public void setLastChapter(String LastChapter) {
                this.LastChapter = LastChapter;
            }

            public int getScore() {
                return Score;
            }

            public void setScore(int Score) {
                this.Score = Score;
            }
        }

        public static class SameCategoryBooksBean {
            /**
             * Id : 308369
             * Name : 女装妹妹从没少过麻烦
             * Img : nvzhuangmeimeicongmeishaoguomafan.jpg
             * Score : 0
             */

            private int Id;
            private String Name;
            private String Img;
            private int Score;

            public int getId() {
                return Id;
            }

            public void setId(int Id) {
                this.Id = Id;
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public String getImg() {
                return Img;
            }

            public void setImg(String Img) {
                this.Img = Img;
            }

            public int getScore() {
                return Score;
            }

            public void setScore(int Score) {
                this.Score = Score;
            }
        }
    }
}
