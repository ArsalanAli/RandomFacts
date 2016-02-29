package com.example.arsalan.randomfacts;

import android.app.DownloadManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by arsalan on 2/29/2016.
 */
public class FactsDB extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 2;
    private static final String Facts_Table_Name  = "Facts";
    private static final String Sfacts = "Sfacts";
    private static final String Cfacts = "Cfacts";
    private static final String Key = "Key";
    private static final String Facts_Table_Create = "CREATE TABLE " + Facts_Table_Name + "(" +
            Key + " INTEGER," + Sfacts + " TEXT," + Cfacts + " TEXT);";
    private static FactsDB sInstance;
    public FactsDB(Context context) {
        super(context, Facts_Table_Name, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Facts_Table_Create);
        ContentValues v = new ContentValues();
        v.put(Key, 1);
        v.put(Sfacts, "Sports Fact 1");
        v.put(Cfacts, "Crazy Fact 1");
        db.insert(Facts_Table_Name, null,v);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != newVersion){
            db.execSQL("DROP TABLE IF EXISTS" + Facts_Table_Name);
            onCreate(db);
        }
    }
    public String getfact(){
        SQLiteDatabase db = getReadableDatabase();
        String[] colums = {Sfacts};
        return db.query(Facts_Table_Name, colums, null,null, null,null,null ).getString(1);
    }
    public static synchronized FactsDB getsInstance(Context context){
        if (sInstance == null){
            sInstance = new FactsDB(context.getApplicationContext());
        }
        return sInstance;
    }
}
