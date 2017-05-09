package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 17/4/25.
 */
public class FindNewVersionPageUI extends BasePageUI {

    public static final CommonUIBean UPDATETIP_PAGE = new CommonUIBean(
            GetElementWay.ID, "com.pingan.papd:id/rl_upgrade_content",
            GetElementWay.NAME, "",
            "发现新版本页面");
    //立即升级
    public static final CommonUIBean UPDATE_NOW = new CommonUIBean(
            GetElementWay.NAME, "立即升级",
            GetElementWay.NAME, "",
            "立即升级");
    //稍后提醒
    public static final CommonUIBean UPDATE_LATER = new CommonUIBean(
            GetElementWay.NAME, "稍后提醒",
            GetElementWay.NAME, "",
            "稍后提醒");
}
