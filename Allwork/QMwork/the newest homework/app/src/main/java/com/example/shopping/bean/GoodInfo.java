package com.example.shopping.bean;

import com.example.shopping.R;

import java.util.ArrayList;

public class GoodInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号
    public String eva;
    public GoodInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        eva="";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "张三", "李四", "王五", "赵六", "马七", "杨八","鲍九","刘十"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "源计划：拼搏 张三",
            "源计划：奉献 李四",
            "源计划：努力 王五",
            "源计划：乐观 赵六",
            "源计划：助人 马七",
            "源计划：雄心 杨八",
            "源计划：进取 鲍九",
            "源计划：低调 刘十"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {79,99, 79, 99, 79, 79,99,69};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.aike_s, R.drawable.hanbing_s,
            R.drawable.jianji_s, R.drawable.jiansheng_s,
            R.drawable.jin_s, R.drawable.kate_s,
            R.drawable.weien_s, R.drawable.yasuo_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.aike, R.drawable.hanbing,
            R.drawable.jianji, R.drawable.jiansheng,
            R.drawable.jin, R.drawable.kate,
            R.drawable.weien, R.drawable.yasuo
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodInfo> getDefaultList() {
        ArrayList<GoodInfo> goodsList = new ArrayList<GoodInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodInfo info = new GoodInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
