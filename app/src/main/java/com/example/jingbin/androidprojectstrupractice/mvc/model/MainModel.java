package com.example.jingbin.androidprojectstrupractice.mvc.model;

/**
 * Created by jingbin on 2016/11/4.
 */

public class MainModel {

    private MainImpl main;

    public interface MainImpl {
        void success(String text);
    }

    public void load(MainImpl main) {
        this.main = main;
        // 一系列处理后得到text
        String text = "MVC模式在Android中的应用，获取到的Model中处理的数据";
        main.success(text);
    }
}
