package com.imooc.o2o.util;
/**
 * 路径转化类
 * @author Administrator
 *
 */
public class PathUtil {
	private static String seperator = System.getProperty("file.separator");

	public static String getImgBasePath() {
		String os = System.getProperty("os.name");
		String basePath = "";
		if (os.toLowerCase().startsWith("win")) {
			basePath = "D:/projectdev/image/";
		} else {
			basePath = "/Users/baidu/work/image/";
		}
		basePath = basePath.replace("/", seperator);
		return basePath;
	}
    /**
     * 存储在各自的店铺下
     * @param shopId
     * @return
     */
	public static String getShopImagePath(long shopId) {
		String imagePath = "upload/item/shop/" + shopId + "/";
		return imagePath.replace("/", seperator);
	}
}
