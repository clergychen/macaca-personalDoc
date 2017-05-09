package com.personalDoc.utils;

import java.io.File;


public class Config {

   // 根目录
   public static final String RootPath                 = System.getProperty("user.dir");
   //截图保存目录
   public static final String ScreenshotPath           = RootPath + File.separator + "screenshot";
   //结果日志保存文件
   public static final String ResultLogPath            = RootPath + File.separator + "result.log";

   // 用户名
   public static final String USER_NAME = "username";
   // 密码
   public static final String PASSWORD = "password";
   // 目标平台- ios android
   public static final String PLATFORM = "ios";
   // 是否覆盖安装 3-覆盖安装,1-删除新装;;;;;0: 清楚数据并重装 app。 1: (默认) 卸载并重装 app。 2: 仅重装 app。 3: 在测试结束后保持 app 状态
   public static final String REUSE = "3";

   // ios平台相关信息 各参数含义参考 https://macacajs.github.io/macaca/desired-caps.html
   public static final String IOS_PLATFORM_NAME = "iOS";
   public static final String IOS_DEVICE_NAME = "iPhone";//"iPhone 6s Plus"; //"iPhone 6";
   public static final String IOS_APP = RootPath + File.separator + "app/PAPersonalDoctor.app";
   public static final String IOS_UDID = "1DA3F43B-6CF1-494D-A728-F68B18D7D14F";

   //我的模拟器 "D87B52CC-9E1E-4F8C-9D0E-64040366199D"
   //服务器的iphone7模拟器 "1DA3F43B-6CF1-494D-A728-F68B18D7D14F"
   //我的手机 "a4d977911662b2ba1205eb8a1f24d7caf84d5955";
   //丁鑫伟测试机 "9405af739152604f6551c70ac849145d406e7cfb";
   //汪吉琛测试机 "a54af13fce5979b3fc176d99028a58b2fffa1259";
   //android小米note:"a56cb0f7"
   //我的小米:"4c53c0e7"

   // 安卓平台相关信息
   public static final String ADR_PLATFORM_NAME = "Android";
   public static final String ADR_APP = RootPath + File.separator + "app/personaldoc_test_V_4.2.0_1_false.apk";
   // 多台设备时，如果指定某一台设备可以在这里指定udid
   public static final String ADR_UDID = "DU2TAN14A7012855";
}