package com.example.mycrawler.data;

import java.io.Serializable;
import java.util.List;

public class BeanRanking{

    /**
     * status : 1
     * info : success
     * data : {"BookList":[{"Id":275933,"Name":"三寸人间","Author":"耳根","Img":"sancunrenjian.jpg","Desc":"星空古剑，万族进化，缥缈道院，谁与争锋天下万物，神兵不朽，宇宙苍穹，太虚称尊青木年华，悠悠牧之，其意欢快，恰似朝阳少年宝乐，心怀梦想，以兵入道，指天摘月仕途多舛，法器克之，灵宝制之，法兵镇之\u2026\u2026若皆无果，神兵斩之！蓦然回首，才知\u2026\u2026举头三尺已无神明，掌心三寸方是人间。这是耳根继《仙逆》《求魔》《我欲封天》《一念永恒》后，创作的第五部长篇小说","CName":"玄幻奇幻","Score":7.9},{"Id":146769,"Name":"剑来","Author":"烽火戏诸侯","Img":"jianlai.jpg","Desc":"大千世界，无奇不有。我陈平安，唯有一剑，可搬山，倒海，降妖，镇魔，敕神，摘星，断江，摧城，开天！","CName":"玄幻奇幻","Score":9.1},{"Id":272397,"Name":"天下第九","Author":"鹅是老五","Img":"tianxiadijiu.jpg","Desc":"修仙觅长生，热血任逍遥，踏莲曳波涤剑骨，凭虚御风塑圣魂！无尽宇宙之中有八道鸿蒙道则，这八道道则每一道都被一个无上强者融合。没有人知道，宇宙之中还有第九道道则，这一道道则破开鸿蒙，无人可触。","CName":"都市言情","Score":6.3},{"Id":279359,"Name":"全球高武","Author":"老鹰吃小鸡","Img":"quanqiugaowu.jpg","Desc":"今日头条\u2014\u2014 　　\u201c大马宗师突破九品，征战全球！\u201d 　　\u201c小马宗师问鼎至高，横扫欧亚！\u201d 　　\u201c乔帮主再次出手，疑似九品大宗师境！\u201d 　　\u201c股神宝刀未老，全球宗师榜再入前十！\u201d 　　\u201c\u2026\u2026\u201d 　　看着一条条新闻闪现，方平心好累，这剧本不对啊！","CName":"都市言情","Score":8.2},{"Id":284964,"Name":"神澜奇域无双珠","Author":"唐家三少","Img":"shenlanqiyuwushuangzhu.jpg","Desc":"唐家三少最新力作，神澜奇域，神秘莫测的六大域，波澜壮阔的七色海，庞大的法蓝世界，种族林立，谁与争锋！预计今年年底震撼发布，随同发布的是斗罗系列最后一部，斗罗大陆Ⅳ作为最后一部，斗罗4无疑是更受期待的，斗罗系列从冷兵器到热兵器再到目前的高科技时代，以后将是星际时代！每本书世界观相隔一万年，作为一个大轮回，有可能回到最初的起点吗？","CName":"玄幻奇幻","Score":5.7},{"Id":214602,"Name":"伏天氏","Author":"净无痕","Img":"futianshi.jpg","Desc":"心潮澎湃，无限幻想，迎风挥击千层浪，少年不败热血！东方神州，有人皇立道统，有圣贤宗门传道，有诸侯雄踞一方王国，诸强林立，神州动乱千万载，值此之时，一代天骄叶青帝及东凰大帝横空出世，斩人皇，驭圣贤，诸侯臣服，东方神州一统！然，叶青帝忽然暴毙，世间雕像尽皆被毁，于世间除名，沦为禁忌；从此神州唯东凰大帝独尊！十五年后，东海青州城，一名为叶伏天的少年，开启了他的传奇之路\u2026","CName":"玄幻奇幻","Score":8.8},{"Id":86745,"Name":"圣墟","Author":"辰东","Img":"shengxu.jpg","Desc":"在破败中崛起，在寂灭中复苏。 　　 沧海成尘，雷电枯竭，那一缕幽雾又一次临近大地，世间的枷锁被打开了，一个全新的世界就此揭开神秘的一角\u2026\u2026","CName":"玄幻奇幻","Score":7.2},{"Id":214051,"Name":"太初","Author":"高楼大厦","Img":"taichu.jpg","Desc":"一树生的万朵花，天下道门是一家。 　　法术千般变化，人心却亘古不变","CName":"玄幻奇幻","Score":5.2},{"Id":303131,"Name":"神幻","Author":"薪意","Img":"shenhuan.jpg","Desc":"【火爆玄幻】古文明重现！ 　　焚书坑儒，焚的是何书，坑的又是何人？为何要筑十二金人建阿房宫？阿房宫真的被一把火烧毁？十二金人又下落何处？繁荣的诸子百家为何开始沉寂？始皇为何不顾反对坚持泰山封禅？长生炼丹之术，到底存不存在？ 　　何方站在山巅上说了三个字：\u201c骚，浪，贱！\u201d","CName":"玄幻奇幻","Score":8.8},{"Id":269478,"Name":"龙族Ⅴ：悼亡者的归来","Author":"江南","Img":"longzuⅤ：daowangzhedeguilai.jpg","Desc":"这是地狱中的魔王们相互撕咬。铁剑和利爪撕裂空气，留下霜冻和火焰的痕迹，血液刚刚飞溅出来，就被高温化作血红色的蒸汽，冲击波在长长的走廊上来来去去，早已没有任何完整的玻璃，连这座建筑物都摇摇欲坠。","CName":"玄幻奇幻","Score":9.4},{"Id":169753,"Name":"大王饶命","Author":"会说话的肘子","Img":"dawangraoming.jpg","Desc":"灵气复苏了，吕树眼瞅着一个个大能横空出世。 　　然后再看一眼自己不太正经的能力，倒吸一口冷气。 　　玩狗蛋啊！ 　　\u2026\u2026 　　这是一个吕树依靠毒鸡汤成为大魔王的故事。","CName":"都市言情","Score":8.4},{"Id":297890,"Name":"全职武神","Author":"流浪的蛤蟆","Img":"quanzhiwushen.jpg","Desc":"大神流浪的蛤蟆新书，大神流浪的蛤蟆新书，大神流浪的蛤蟆新书，大神流浪的蛤蟆新书，大神流浪的蛤蟆新书，大神流浪的蛤蟆新书，大神流浪的蛤蟆新书","CName":"武侠仙侠","Score":7.8},{"Id":276794,"Name":"上海，抱紧我","Author":"童鼎鼎1","Img":"shanghai，baojinwo.jpg","Desc":"和校花合租期间难以启齿的事。 　　写这书没什么目的，就让你放松放松，你笑了我就赢了。 　　不过，看哭了也别怪我，毕竟我是故意的。 　　来点温馨吧，男人也需要浪漫。 　　想哭就哭吧，每天来这里偷偷释放一下压力。 　　请放肆笑吧，人间不值得你悲伤。 　　我真希望，你是乌云边的那束阳光。","CName":"都市言情","Score":9.8},{"Id":140456,"Name":"超神机械师","Author":"齐佩甲","Img":"chaoshenjixieshi.jpg","Desc":"韩萧，《星海》骨灰级代练，被来自东（zuo）方(zhe)的神秘力量扔进穿越大军，携带玩家面板变成NPC，回到《星海》公测之前，毅然选择难度最高的机械系。 　　战舰列队纵横星海，星辰机甲夭矫如龙，幽能炮毁天灭地，还有无边无际的机械大军，静静待在随身仓库里。 　　一人，即是军团！ 　　如果不是玩家出现，本书就是正经严肃的穿越异界题材\u2026\u2026 　　作为NPC，正常NPC对玩家功能一应俱全\u2026\u2026发布任务","CName":"网游竞技","Score":9.6},{"Id":292949,"Name":"我有一座恐怖屋","Author":"我会修空调","Img":"woyouyizuokongbuwu.jpg","Desc":"散发异味的灵车停在了门口，天花板传来弹珠碰撞的声音，走廊里有人来回踱步，隔壁房间好像在切割什么东西。 　　卧室的门锁轻轻颤动，卫生间里水龙头已经拧紧，却还是滴答滴答个不停。 　　床底下隐隐约约，似乎有个皮球滚来滚去。 　　一个个沾染水渍的脚印不断在地板上浮现，正慢慢逼近。 　　凌晨三点，陈歌握着菜刀躲在暖气片旁边，手里的电话刚刚拨通。 　　\u201c房东！这就是你说的晚上有点热闹？！\u201d","CName":"科幻灵异","Score":9.8},{"Id":8975,"Name":"全职法师","Author":"乱","Img":"quanzhifashi.jpg","Desc":"一觉醒来，世界大变。 　　 　　 熟悉的高中传授的是魔法，告诉大家要成为一名出色的魔法师。 　　 　　 居住的都市之外游荡着袭击人类的魔物妖兽，虎视眈眈。 　　 　　 崇尚科学的世界变成了崇尚魔法，偏偏有着一样以学渣看待自己的老师，一样目光异样的同学，一样社会底层挣扎的爸爸，一样纯美却不能走路的非血缘妹妹\u2026\u2026 　　 　　 不过，莫凡发现绝大多数人都只能够主修一系魔法，自己却","CName":"玄幻奇幻","Score":9},{"Id":146948,"Name":"牧神记","Author":"宅猪","Img":"mushenji.jpg","Desc":"大墟的祖训说，天黑，别出门。 　　大墟残老村的老弱病残们从江边捡到了一个婴儿，取名秦牧，含辛茹苦将他养大。这一天夜幕降临，黑暗笼罩大墟，秦牧走出了家门\u2026\u2026 　　做个春风中荡漾的反派吧！ 　　瞎子对他说。 　　秦牧的反派之路，正在崛起！","CName":"玄幻奇幻","Score":9.1},{"Id":11,"Name":"武炼巅峰","Author":"莫默","Img":"11.jpg","Desc":"武炼巅峰最新章节列：小说《武炼巅峰》莫默/著,武炼巅峰全文阅读[新人写作季作品]武之巅峰，是孤独，是寂寞，是漫漫求索，是高处不胜寒逆境中成长，绝地里求生，不屈不饶，才能堪破武之极道。凌霄阁试炼弟子兼扫地小......","CName":"玄幻奇幻","Score":8.6},{"Id":3253,"Name":"帝霸","Author":"厌笔萧生","Img":"diba.jpg","Desc":"千万年前，李七夜栽下一株翠竹。八百万年前，李七夜养了一条鲤鱼。五百万年前，李七夜收养一个小女孩。\u2026\u2026\u2026\u2026\u2026\u2026\u2026\u2026\u2026\u2026今天，李七夜一觉醒来，翠竹修练成神灵，鲤鱼化作金龙，小女孩成为九界女帝。这是一个养成的故事，一个不死的人族小子养成了妖神、养成了仙兽、养成了女帝的故事","CName":"玄幻奇幻","Score":5.7},{"Id":282068,"Name":"雷霆之主","Author":"萧舒","Img":"leitingzhizhu.jpg","Desc":"我是雷霆之主！携一方残缺雷印转世重生于武学昌盛的世界，禀持不成至尊白活一场之信念，奋力追逐拼命向上，精彩人生。","CName":"武侠仙侠","Score":5.8},{"Id":253077,"Name":"黎明之剑","Author":"远瞳","Img":"limingzhijian.jpg","Desc":"高文穿越了，但穿越的时候稍微出了点问题。在某个异界大陆上空飘了十几万年之后，他觉得自己可能需要一具身体才算是成为一个完整的穿越者，但他并没想到自己好不容易成功之后竟然还需要带着这具身体从棺材里爬出来，并且面对两个吓蒙了的曾曾曾曾\u2026\u2026曾孙女。以及一个即将迎来纪元终结的世界。","CName":"科幻灵异","Score":8.9}],"Page":1,"HasNext":true}
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
         * BookList : [{"Id":275933,"Name":"三寸人间","Author":"耳根","Img":"sancunrenjian.jpg","Desc":"星空古剑，万族进化，缥缈道院，谁与争锋天下万物，神兵不朽，宇宙苍穹，太虚称尊青木年华，悠悠牧之，其意欢快，恰似朝阳少年宝乐，心怀梦想，以兵入道，指天摘月仕途多舛，法器克之，灵宝制之，法兵镇之\u2026\u2026若皆无果，神兵斩之！蓦然回首，才知\u2026\u2026举头三尺已无神明，掌心三寸方是人间。这是耳根继《仙逆》《求魔》《我欲封天》《一念永恒》后，创作的第五部长篇小说","CName":"玄幻奇幻","Score":7.9},{"Id":146769,"Name":"剑来","Author":"烽火戏诸侯","Img":"jianlai.jpg","Desc":"大千世界，无奇不有。我陈平安，唯有一剑，可搬山，倒海，降妖，镇魔，敕神，摘星，断江，摧城，开天！","CName":"玄幻奇幻","Score":9.1},{"Id":272397,"Name":"天下第九","Author":"鹅是老五","Img":"tianxiadijiu.jpg","Desc":"修仙觅长生，热血任逍遥，踏莲曳波涤剑骨，凭虚御风塑圣魂！无尽宇宙之中有八道鸿蒙道则，这八道道则每一道都被一个无上强者融合。没有人知道，宇宙之中还有第九道道则，这一道道则破开鸿蒙，无人可触。","CName":"都市言情","Score":6.3},{"Id":279359,"Name":"全球高武","Author":"老鹰吃小鸡","Img":"quanqiugaowu.jpg","Desc":"今日头条\u2014\u2014 　　\u201c大马宗师突破九品，征战全球！\u201d 　　\u201c小马宗师问鼎至高，横扫欧亚！\u201d 　　\u201c乔帮主再次出手，疑似九品大宗师境！\u201d 　　\u201c股神宝刀未老，全球宗师榜再入前十！\u201d 　　\u201c\u2026\u2026\u201d 　　看着一条条新闻闪现，方平心好累，这剧本不对啊！","CName":"都市言情","Score":8.2},{"Id":284964,"Name":"神澜奇域无双珠","Author":"唐家三少","Img":"shenlanqiyuwushuangzhu.jpg","Desc":"唐家三少最新力作，神澜奇域，神秘莫测的六大域，波澜壮阔的七色海，庞大的法蓝世界，种族林立，谁与争锋！预计今年年底震撼发布，随同发布的是斗罗系列最后一部，斗罗大陆Ⅳ作为最后一部，斗罗4无疑是更受期待的，斗罗系列从冷兵器到热兵器再到目前的高科技时代，以后将是星际时代！每本书世界观相隔一万年，作为一个大轮回，有可能回到最初的起点吗？","CName":"玄幻奇幻","Score":5.7},{"Id":214602,"Name":"伏天氏","Author":"净无痕","Img":"futianshi.jpg","Desc":"心潮澎湃，无限幻想，迎风挥击千层浪，少年不败热血！东方神州，有人皇立道统，有圣贤宗门传道，有诸侯雄踞一方王国，诸强林立，神州动乱千万载，值此之时，一代天骄叶青帝及东凰大帝横空出世，斩人皇，驭圣贤，诸侯臣服，东方神州一统！然，叶青帝忽然暴毙，世间雕像尽皆被毁，于世间除名，沦为禁忌；从此神州唯东凰大帝独尊！十五年后，东海青州城，一名为叶伏天的少年，开启了他的传奇之路\u2026","CName":"玄幻奇幻","Score":8.8},{"Id":86745,"Name":"圣墟","Author":"辰东","Img":"shengxu.jpg","Desc":"在破败中崛起，在寂灭中复苏。 　　 沧海成尘，雷电枯竭，那一缕幽雾又一次临近大地，世间的枷锁被打开了，一个全新的世界就此揭开神秘的一角\u2026\u2026","CName":"玄幻奇幻","Score":7.2},{"Id":214051,"Name":"太初","Author":"高楼大厦","Img":"taichu.jpg","Desc":"一树生的万朵花，天下道门是一家。 　　法术千般变化，人心却亘古不变","CName":"玄幻奇幻","Score":5.2},{"Id":303131,"Name":"神幻","Author":"薪意","Img":"shenhuan.jpg","Desc":"【火爆玄幻】古文明重现！ 　　焚书坑儒，焚的是何书，坑的又是何人？为何要筑十二金人建阿房宫？阿房宫真的被一把火烧毁？十二金人又下落何处？繁荣的诸子百家为何开始沉寂？始皇为何不顾反对坚持泰山封禅？长生炼丹之术，到底存不存在？ 　　何方站在山巅上说了三个字：\u201c骚，浪，贱！\u201d","CName":"玄幻奇幻","Score":8.8},{"Id":269478,"Name":"龙族Ⅴ：悼亡者的归来","Author":"江南","Img":"longzuⅤ：daowangzhedeguilai.jpg","Desc":"这是地狱中的魔王们相互撕咬。铁剑和利爪撕裂空气，留下霜冻和火焰的痕迹，血液刚刚飞溅出来，就被高温化作血红色的蒸汽，冲击波在长长的走廊上来来去去，早已没有任何完整的玻璃，连这座建筑物都摇摇欲坠。","CName":"玄幻奇幻","Score":9.4},{"Id":169753,"Name":"大王饶命","Author":"会说话的肘子","Img":"dawangraoming.jpg","Desc":"灵气复苏了，吕树眼瞅着一个个大能横空出世。 　　然后再看一眼自己不太正经的能力，倒吸一口冷气。 　　玩狗蛋啊！ 　　\u2026\u2026 　　这是一个吕树依靠毒鸡汤成为大魔王的故事。","CName":"都市言情","Score":8.4},{"Id":297890,"Name":"全职武神","Author":"流浪的蛤蟆","Img":"quanzhiwushen.jpg","Desc":"大神流浪的蛤蟆新书，大神流浪的蛤蟆新书，大神流浪的蛤蟆新书，大神流浪的蛤蟆新书，大神流浪的蛤蟆新书，大神流浪的蛤蟆新书，大神流浪的蛤蟆新书","CName":"武侠仙侠","Score":7.8},{"Id":276794,"Name":"上海，抱紧我","Author":"童鼎鼎1","Img":"shanghai，baojinwo.jpg","Desc":"和校花合租期间难以启齿的事。 　　写这书没什么目的，就让你放松放松，你笑了我就赢了。 　　不过，看哭了也别怪我，毕竟我是故意的。 　　来点温馨吧，男人也需要浪漫。 　　想哭就哭吧，每天来这里偷偷释放一下压力。 　　请放肆笑吧，人间不值得你悲伤。 　　我真希望，你是乌云边的那束阳光。","CName":"都市言情","Score":9.8},{"Id":140456,"Name":"超神机械师","Author":"齐佩甲","Img":"chaoshenjixieshi.jpg","Desc":"韩萧，《星海》骨灰级代练，被来自东（zuo）方(zhe)的神秘力量扔进穿越大军，携带玩家面板变成NPC，回到《星海》公测之前，毅然选择难度最高的机械系。 　　战舰列队纵横星海，星辰机甲夭矫如龙，幽能炮毁天灭地，还有无边无际的机械大军，静静待在随身仓库里。 　　一人，即是军团！ 　　如果不是玩家出现，本书就是正经严肃的穿越异界题材\u2026\u2026 　　作为NPC，正常NPC对玩家功能一应俱全\u2026\u2026发布任务","CName":"网游竞技","Score":9.6},{"Id":292949,"Name":"我有一座恐怖屋","Author":"我会修空调","Img":"woyouyizuokongbuwu.jpg","Desc":"散发异味的灵车停在了门口，天花板传来弹珠碰撞的声音，走廊里有人来回踱步，隔壁房间好像在切割什么东西。 　　卧室的门锁轻轻颤动，卫生间里水龙头已经拧紧，却还是滴答滴答个不停。 　　床底下隐隐约约，似乎有个皮球滚来滚去。 　　一个个沾染水渍的脚印不断在地板上浮现，正慢慢逼近。 　　凌晨三点，陈歌握着菜刀躲在暖气片旁边，手里的电话刚刚拨通。 　　\u201c房东！这就是你说的晚上有点热闹？！\u201d","CName":"科幻灵异","Score":9.8},{"Id":8975,"Name":"全职法师","Author":"乱","Img":"quanzhifashi.jpg","Desc":"一觉醒来，世界大变。 　　 　　 熟悉的高中传授的是魔法，告诉大家要成为一名出色的魔法师。 　　 　　 居住的都市之外游荡着袭击人类的魔物妖兽，虎视眈眈。 　　 　　 崇尚科学的世界变成了崇尚魔法，偏偏有着一样以学渣看待自己的老师，一样目光异样的同学，一样社会底层挣扎的爸爸，一样纯美却不能走路的非血缘妹妹\u2026\u2026 　　 　　 不过，莫凡发现绝大多数人都只能够主修一系魔法，自己却","CName":"玄幻奇幻","Score":9},{"Id":146948,"Name":"牧神记","Author":"宅猪","Img":"mushenji.jpg","Desc":"大墟的祖训说，天黑，别出门。 　　大墟残老村的老弱病残们从江边捡到了一个婴儿，取名秦牧，含辛茹苦将他养大。这一天夜幕降临，黑暗笼罩大墟，秦牧走出了家门\u2026\u2026 　　做个春风中荡漾的反派吧！ 　　瞎子对他说。 　　秦牧的反派之路，正在崛起！","CName":"玄幻奇幻","Score":9.1},{"Id":11,"Name":"武炼巅峰","Author":"莫默","Img":"11.jpg","Desc":"武炼巅峰最新章节列：小说《武炼巅峰》莫默/著,武炼巅峰全文阅读[新人写作季作品]武之巅峰，是孤独，是寂寞，是漫漫求索，是高处不胜寒逆境中成长，绝地里求生，不屈不饶，才能堪破武之极道。凌霄阁试炼弟子兼扫地小......","CName":"玄幻奇幻","Score":8.6},{"Id":3253,"Name":"帝霸","Author":"厌笔萧生","Img":"diba.jpg","Desc":"千万年前，李七夜栽下一株翠竹。八百万年前，李七夜养了一条鲤鱼。五百万年前，李七夜收养一个小女孩。\u2026\u2026\u2026\u2026\u2026\u2026\u2026\u2026\u2026\u2026今天，李七夜一觉醒来，翠竹修练成神灵，鲤鱼化作金龙，小女孩成为九界女帝。这是一个养成的故事，一个不死的人族小子养成了妖神、养成了仙兽、养成了女帝的故事","CName":"玄幻奇幻","Score":5.7},{"Id":282068,"Name":"雷霆之主","Author":"萧舒","Img":"leitingzhizhu.jpg","Desc":"我是雷霆之主！携一方残缺雷印转世重生于武学昌盛的世界，禀持不成至尊白活一场之信念，奋力追逐拼命向上，精彩人生。","CName":"武侠仙侠","Score":5.8},{"Id":253077,"Name":"黎明之剑","Author":"远瞳","Img":"limingzhijian.jpg","Desc":"高文穿越了，但穿越的时候稍微出了点问题。在某个异界大陆上空飘了十几万年之后，他觉得自己可能需要一具身体才算是成为一个完整的穿越者，但他并没想到自己好不容易成功之后竟然还需要带着这具身体从棺材里爬出来，并且面对两个吓蒙了的曾曾曾曾\u2026\u2026曾孙女。以及一个即将迎来纪元终结的世界。","CName":"科幻灵异","Score":8.9}]
         * Page : 1
         * HasNext : true
         */

        private int Page;
        private boolean HasNext;
        private List<BookListBean> BookList;

        public int getPage() {
            return Page;
        }

        public void setPage(int Page) {
            this.Page = Page;
        }

        public boolean isHasNext() {
            return HasNext;
        }

        public void setHasNext(boolean HasNext) {
            this.HasNext = HasNext;
        }

        public List<BookListBean> getBookList() {
            return BookList;
        }

        public void setBookList(List<BookListBean> BookList) {
            this.BookList = BookList;
        }

        public static class BookListBean{
            /**
             * Id : 275933
             * Name : 三寸人间
             * Author : 耳根
             * Img : sancunrenjian.jpg
             * Desc : 星空古剑，万族进化，缥缈道院，谁与争锋天下万物，神兵不朽，宇宙苍穹，太虚称尊青木年华，悠悠牧之，其意欢快，恰似朝阳少年宝乐，心怀梦想，以兵入道，指天摘月仕途多舛，法器克之，灵宝制之，法兵镇之……若皆无果，神兵斩之！蓦然回首，才知……举头三尺已无神明，掌心三寸方是人间。这是耳根继《仙逆》《求魔》《我欲封天》《一念永恒》后，创作的第五部长篇小说
             * CName : 玄幻奇幻
             * Score : 7.9
             */

            private int Id;
            private String Name;
            private String Author;
            private String Img;
            private String Desc;
            private String CName;
            private double Score;

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

            public String getDesc() {
                return Desc;
            }

            public void setDesc(String Desc) {
                this.Desc = Desc;
            }

            public String getCName() {
                return CName;
            }

            public void setCName(String CName) {
                this.CName = CName;
            }

            public double getScore() {
                return Score;
            }

            public void setScore(double Score) {
                this.Score = Score;
            }
        }
    }
}
