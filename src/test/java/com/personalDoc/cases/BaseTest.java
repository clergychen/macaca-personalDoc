package com.personalDoc.cases;

import java.io.File;
import java.util.Random;

import com.personalDoc.pages.*;
import com.personalDoc.pageuis.*;
import macaca.java.biz.BaseErrorType;
import macaca.java.biz.BaseMacacaClient;
import macaca.java.biz.ResultGenerator;
import macaca.java.biz.BaseMacacaClient.PlatformType;
import com.personalDoc.utils.Config;
import com.alibaba.fastjson.JSONObject;
import org.testng.Assert;
import org.testng.annotations.*;


public class BaseTest {

	// 屏幕截图的数目，为了实现递增的顺序
	private int screenNum = 1;

	BaseMacacaClient driver= new BaseMacacaClient();

	String port;
	String udid;
	String reuse;
	@Parameters({"port","udid","reuse"})

	@BeforeTest
	public void beforeSuite(String port, String udid,String reuse){
		this.port = port;
		this.udid = udid;
		this.reuse = reuse;
	}

	@BeforeClass
	public void setUp() throws Exception {

		// 清除日志记录
		ResultGenerator.clearOldData();
		//清理截图重新记录
		File file = new File(Config.ScreenshotPath);
		deleteOldScreen(file);

		// 初始化应用基础信息
		JSONObject props = new JSONObject();
		if (Config.PLATFORM.equals("ios")) {

			// 创建ios实例
			props.put("app", Config.IOS_APP);
			props.put("platformName", Config.IOS_PLATFORM_NAME);
			props.put("deviceName", Config.IOS_DEVICE_NAME);
//			props.put("udid", Config.IOS_UDID);
			driver.setCurPlatform(PlatformType.IOS);
		} else {

			//创建安卓实例
			props.put("app", Config.ADR_APP);
			props.put("platformName", Config.ADR_PLATFORM_NAME);
//			props.put("udid", Config.ADR_UDID);
			driver.setCurPlatform(PlatformType.ANDROID);
		}

		// 覆盖安装
		props.put("reuse", reuse);
		props.put("udid",udid);

		JSONObject desiredCapabilities = new JSONObject();
		desiredCapabilities.put("host", "10.0.6.40"); // custom server  host
		desiredCapabilities.put("port", Integer.parseInt(port)); // custom server  port
		desiredCapabilities.put("desiredCapabilities", props);
			if(port.equals("3457"))
			{
				Thread.sleep(2000);
			}
		driver.initDriver(desiredCapabilities);


		/////////////////////////////商城初始化逻辑,新装app和覆盖安装情况下操作到商城首页/////////////////////////////
		if (reuse.equals("1")) {
			System.out.println("卸载安装了");

			//数据准备
			//搞个随机数
			Random random = new Random(System.currentTimeMillis());
			int randInt = random.nextInt(900000) + 100000;
			//定义登陆唯一
			String receiverNo = String.valueOf(randInt);
			System.out.println("手机号码=13564" + receiverNo);
			String phoneNum = "13564" + receiverNo;
			// 欢迎页
			WelcomePage welcomePage = new WelcomePage("欢迎页");
			welcomePage.setDriver(driver);
			if (welcomePage.hasPageShown(WelcomePageUI.WEL_VIEW)) {
				saveScreen(welcomePage.pageDesc);
				ResultGenerator.loadPageSucc(welcomePage);

				// 滑动
				welcomePage.scroll();
				driver.sleep(2000);
			} else {
				ResultGenerator.loadPageFail(welcomePage);

			}

			// 处理登录
			LoginPage loginPage = new LoginPage("登录页");
			loginPage.setDriver(driver);
			if (loginPage.hasPageShown(LoginPageUI.VERIFY_BTN)) {
				saveScreen(loginPage.pageDesc);
				ResultGenerator.loadPageSucc(loginPage);

				//登陆参数
				loginPage.login(phoneNum, "666666");
			} else {
				ResultGenerator.loadPageFail(loginPage);

			}

			// locationAlert页
			AlertPage alertPage = new AlertPage("定位选择弹出框");
			alertPage.setDriver(driver);
			if (alertPage.hasPageShown(AlertPageUI.ALERT_TEXT)) {
				saveScreen(alertPage.pageDesc);
				ResultGenerator.loadPageSucc(alertPage);
				alertPage.locationAlert();
				driver.sleep(500);
			}
			if (alertPage.hasPageShown(AlertPageUI.ALERT_TEXT)) {
				alertPage.locationAlert();
			} else {
				ResultGenerator.loadPageFail(alertPage);

			}

			// 任意门
			AnyDoorPage anyDoorPage = new AnyDoorPage("任意门Alert");
			anyDoorPage.setDriver(driver);
			if (anyDoorPage.hasPageShown(AnyDoorPageUI.ANY_DOOR)) {
				saveScreen(anyDoorPage.pageDesc);
				ResultGenerator.loadPageSucc(anyDoorPage);
				//
				anyDoorPage.leaveMe();
			}

			// 信息收集(新用户)
			NewGuyPage newguyPage = new NewGuyPage("信息收集页");
			newguyPage.setDriver(driver);
			if (newguyPage.hasPageShown(NewGuyPageUI.WELCOME)) {
				saveScreen(newguyPage.pageDesc);
				ResultGenerator.loadPageSucc(newguyPage);
				//创建用户
				String user = "uitest" + phoneNum;
				newguyPage.newguy(user);
			} else {
				ResultGenerator.loadPageFail(newguyPage);
			}

			// 顶通页(新用户)
			DingTongPage dingtongPage = new DingTongPage("顶通页");
			dingtongPage.setDriver(driver);
			if (dingtongPage.hasPageShown(DingTongPageUI.DINGTONG_BACK)) {
				saveScreen(dingtongPage.pageDesc);
				ResultGenerator.loadPageSucc(dingtongPage);
				//
				dingtongPage.dingtong();
			} else {
				ResultGenerator.loadPageFail(dingtongPage);
			}

			// 发现新版本页
			FindNewVersionPage findNewVersionPage = new FindNewVersionPage("发现新版本页");
			findNewVersionPage.setDriver(driver);
			if (findNewVersionPage.hasPageShown(FindNewVersionPageUI.UPDATETIP_PAGE)) {
				saveScreen(findNewVersionPage.pageDesc);
				ResultGenerator.loadPageSucc(findNewVersionPage);
				//
				findNewVersionPage.updateLater();
			} else {
				ResultGenerator.loadPageFail(findNewVersionPage);
			}

			// 主客首页
			ZhuKeHomePage zhukehomePage = new ZhuKeHomePage("主客首页");
			zhukehomePage.setDriver(driver);
			if (zhukehomePage.hasPageShown(ZhuKeHomePageUI.MALL_TAB)) {
				saveScreen(zhukehomePage.pageDesc);
				ResultGenerator.loadPageSucc(zhukehomePage);
				// 进入商城首页
				zhukehomePage.tabMall();
//            saveScreen("进入商城首页");
			} else {
				// 首页没有加载成功，后面的用例都不用执行了，return
				ResultGenerator.loadPageFail(zhukehomePage);
				return;
			}
		}

		else if (reuse.equals("2")) {
			System.out.println("覆盖安装了");
			// 任意门
			AnyDoorPage anyDoorPage = new AnyDoorPage("任意门Alert");
			anyDoorPage.setDriver(driver);
			if (anyDoorPage.hasPageShown(AnyDoorPageUI.ANY_DOOR)) {
				saveScreen(anyDoorPage.pageDesc);
				ResultGenerator.loadPageSucc(anyDoorPage);
				//
				anyDoorPage.leaveMe();
			}

			// 顶通页
			DingTongPage dingtongPage = new DingTongPage("顶通页");
			dingtongPage.setDriver(driver);
			if (dingtongPage.hasPageShown(DingTongPageUI.DINGTONG_BACK)) {
				saveScreen(dingtongPage.pageDesc);
				ResultGenerator.loadPageSucc(dingtongPage);
				//
				dingtongPage.dingtong();
			}

			// 发现新版本页
			FindNewVersionPage findNewVersionPage = new FindNewVersionPage("发现新版本页");
			findNewVersionPage.setDriver(driver);
			if (findNewVersionPage.hasPageShown(FindNewVersionPageUI.UPDATETIP_PAGE)) {
				saveScreen(findNewVersionPage.pageDesc);
				ResultGenerator.loadPageSucc(findNewVersionPage);
				//
				findNewVersionPage.updateLater();
			} else {
				ResultGenerator.loadPageFail(findNewVersionPage);
			}

			// 主客首页
			ZhuKeHomePage zhukehomePage = new ZhuKeHomePage("主客首页");
			zhukehomePage.setDriver(driver);
			if (zhukehomePage.hasPageShown(ZhuKeHomePageUI.MALL_TAB)) {
				driver.waitForElement(ZhuKeHomePageUI.ME);
				saveScreen(zhukehomePage.pageDesc);
				ResultGenerator.loadPageSucc(zhukehomePage);
				// 进入商城首页
				zhukehomePage.tabMall();
				driver.sleep(1000);
			} else {
				// 首页没有加载成功，后面的用例都不用执行了，return
				ResultGenerator.loadPageFail(zhukehomePage);
				Assert.fail();
				return;
			}
		}
	}


	@AfterClass
	public void tearDown() throws Exception {

		try {
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
			ResultGenerator.fail("quit fail", "", BaseErrorType.FUNCTION_FAILED);
		}

	}

	 /**
	    * 保存当前屏幕截图-生成的截图会按照截图的先后顺序生成有序的名称
	    * @param fileName 图片名称，默认为.png格式,图片默认保存在screenShot目录下
	    */
	    public void saveScreen(String fileName) {
	        try {
	            // 判断是否存在对应目录，不存在的话则创建
	            File file = new File(Config.ScreenshotPath);
	            if (!file.exists() || !file.isDirectory()) {
	                // 没有目录 创建截屏目录
	                System.out.println("没有screenshot目录，创建目录");
	                boolean isMkdirSucc = file.mkdir();
	                if (isMkdirSucc) {
	                    System.out.println("创建screenshot目录成功");
	                } else {
	                    System.out.println("创建screenshot目录失败");
	                }
	            } else {
	                System.out.println("存在screenshot目录");
	            }

	            driver.saveScreenshot(
	                Config.ScreenshotPath + File.separator + screenNum + "_" + fileName + ".png");
	            screenNum++;
	        } catch (Exception e) {
	            // TODO: handle exception
	            ResultGenerator.fail("截屏异常", "", BaseErrorType.FUNCTION_FAILED);
	        }
	    }

	    //删除screenshot目录下旧的截图
	    public void deleteOldScreen(File oldScreen) {
	        if (oldScreen.exists() && oldScreen.isDirectory()) {
	            File[] files = oldScreen.listFiles();
	            for (File file : files) {
	                deleteOldScreen(file);
	            }
	        } else {
	            oldScreen.delete();
	        }

	    }
}
