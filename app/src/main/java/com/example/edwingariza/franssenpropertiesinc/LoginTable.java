package com.example.edwingariza.franssenpropertiesinc;

import android.provider.BaseColumns;

/**
 * Created by edwingariza on 4/9/17.
 */

public class LoginTable {

    public LoginTable(){

    }

    public static abstract class TableInfo  implements BaseColumns {

        public static final String USER_NAME =  "user_name";
        public static final String USER_PASS = "user_pass";
        public static final String DATABASE_NAME = "user_info";
        public static final String TABLE_NAME = "reg_info";
    }
}
