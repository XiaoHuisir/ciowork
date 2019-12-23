package com.myproject.constants;



import com.myproject.app.MyApp;

import java.io.File;

public class Constant {

    public static final String Base_Url = "https://cdwan.cn/api/";


    //网络缓存的地址
    public static final String PATH_DATA = MyApp.myApp.getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/project";



}
