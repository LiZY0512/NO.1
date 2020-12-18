package com.example.zy8.bean;

import com.example.zy8.R;

import java.util.ArrayList;

public class Planet {

    public int image;
    public String name;
    public String desc;

    public Planet(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    private static int[] iconArray = {
            R.drawable.balm, R.drawable.computer,
            R.drawable.eardrop, R.drawable.lipstick,
            R.drawable.huawei, R.drawable.ukulele,
            R.drawable.watches, R.drawable.wine};
    private static String[] nameArray = { "camera", "cup", "digitalclock", "fruitdrinks", "mobilephoneshell", "perfume","ring","umbrella"};
    private static String[] descArray = {
            "balm 故宫香体膏香水 古法纯植物手工 女士古风香膏 固体香水持久淡香",
            "computer 联想(Lenovo)拯救者R7000P 15.6英寸游戏笔记本电脑 钛晶灰",
            "erdrop 故宫 勾莲耳线 镀金中国风 古风耳饰耳坠 长款耳环",
            "lipstick 故宫 花想容古风 涂抹式口红膏 哑光—海棠",
            "huawei Huawei华为 Mate 40 Pro 5G手机 遇见非凡",
            "ukulele 歌芮拉樱花尤克里里 女生款可爱初学者入门小吉他 23寸单板乌克丽丽",
            "watches  星皇 2020新款手表女士 全自动机械表陶瓷镂空情侣手表 送女友时尚休闲镶钻防水夜光学生腕表 【女神款】玫瑰金",
            "wine 半朵悠莲晚安酒 10度花果酒 280ml 夏有荔枝"
    };

    public static ArrayList<Planet> getDefaultList() {
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        for (int i = 0; i < iconArray.length; i++) {
            planetList.add(new Planet(iconArray[i], nameArray[i], descArray[i]));
        }
        return planetList;
    }
}