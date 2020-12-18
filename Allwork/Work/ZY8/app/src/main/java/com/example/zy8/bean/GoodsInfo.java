package com.example.zy8.bean;

import com.example.zy8.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "balm", "computer", "erdrop", "lipstick", "huawei", "ukulele","watches","wine"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "balm 故宫香体膏香水 古法纯植物手工 女士古风香膏 固体香水持久淡香",
            "computer 联想(Lenovo)拯救者R7000P 15.6英寸游戏笔记本电脑 钛晶灰",
            "erdrop 故宫 勾莲耳线 镀金中国风 古风耳饰耳坠 长款耳环",
            "lipstick 故宫 花想容古风 涂抹式口红膏 哑光—海棠",
            "huawei Huawei华为 Mate 40 Pro 5G手机 遇见非凡",
            "ukulele 歌芮拉樱花尤克里里 女生款可爱初学者入门小吉他 23寸单板乌克丽丽",
            "watches  星皇 2020新款手表女士 全自动机械表陶瓷镂空情侣手表 送女友时尚休闲镶钻防水夜光学生腕表 【女神款】玫瑰金",
            "wine 半朵悠莲晚安酒 10度花果酒 280ml 夏有荔枝"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {48, 7999, 84, 99, 9798, 442, 798, 59};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.balm_s, R.drawable.computer_s,
            R.drawable.eardrop_s, R.drawable.lipstick_s,
            R.drawable.huawei_s, R.drawable.ukulele_s,
            R.drawable.watches_s, R.drawable.wine_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.balm, R.drawable.computer,
            R.drawable.eardrop, R.drawable.lipstick,
            R.drawable.huawei, R.drawable.ukulele,
            R.drawable.watches, R.drawable.wine
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
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