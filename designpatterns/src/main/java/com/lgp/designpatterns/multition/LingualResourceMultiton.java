package com.lgp.designpatterns.multition;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/13 9:46
 * @DESCRIPTION 无上限的多例模式，本质上就是使用map
 * <p>
 * 估计大家看了这几个模式都领悟了map在设计模式的使用了
 **/
public class LingualResourceMultiton {
    private String language = "en";
    private String region = "US";
    private String localeCode = "en_US";
    public static final String FILE_NAME = "res";
    private static HashMap instances = new HashMap(19);
    private static Locale locale = null;
    private static ResourceBundle resourceBundle = null;
    private static LingualResourceMultiton lingualResourceMultiton;

    private LingualResourceMultiton(String language, String region) {
        this.language = language;
        this.region = region;
        this.localeCode = makeLocaleCode(language, region);
        locale = new Locale(language, region);
        resourceBundle = ResourceBundle.getBundle(FILE_NAME, locale);
        instances.put(makeLocaleCode(language, region), resourceBundle);
    }

    private LingualResourceMultiton() {

    }

    synchronized public static LingualResourceMultiton getInstance(String language, String region) {
        if (null != instances.get(makeLocaleCode(language, region))) {
            locale = new Locale(language, region);
            resourceBundle = ResourceBundle.getBundle(FILE_NAME, locale);
            instances.put(makeLocaleCode(language, region), resourceBundle);
            return lingualResourceMultiton;
        } else {
            return new LingualResourceMultiton(language, region);
        }
    }

    public String getLocaleString(String code) {
        return resourceBundle.getString(code);
    }

    private static String makeLocaleCode(String language, String region) {
        return language + "_" + region;
    }


    public static void main(String[] args) throws UnsupportedEncodingException {
        LingualResourceMultiton ling = LingualResourceMultiton.getInstance("en", "US");
        String usDollar = ling.getLocaleString("USD");
        System.out.println(usDollar);
        LingualResourceMultiton ling2 = LingualResourceMultiton.getInstance("zh", "CH");
        String usDollar2 = ling2.getLocaleString("JPY");
//        System.out.println(URLEncoder.encode(usDollar2,"UTF-8"));
        System.out.println(new String(usDollar2.getBytes("ISO-8859-1"), "UTF-8"));
//        System.out.println(new String(usDollar2.getBytes("GBK"), "UTF-8"));
    }
}
