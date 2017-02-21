package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 17/2/20.
 */
public class TreasureBoxPageUI extends BasePageUI{
    //宝箱图片
    public static final CommonUIBean BOX_IMG = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"treasureBox_gold1",
            "treasureBox_gold1");
    //id_恭喜您获得一个宝箱
    public static final CommonUIBean BOX_TEXT = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"id_恭喜您获得一个宝箱",
            "id_恭喜您获得一个宝箱");
    //关闭按钮
    public static final CommonUIBean CLOSE_BTN = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"id_treasureBox_close",
            "id_treasureBox_close");


}

