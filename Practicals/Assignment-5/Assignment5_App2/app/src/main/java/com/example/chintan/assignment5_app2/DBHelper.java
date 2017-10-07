package com.example.chintan.assignment5_app2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chintan on 26-09-2017.
 */
public class DBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "student_demo";
    public static final String TABLE_STUDENT = "student_table";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public int flag = 0;

    public DBHelper(Context context) {
        super(context,  DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        flag=1;
        db.execSQL("CREATE TABLE " + TABLE_STUDENT + " (" + COLUMN_ID + " integer primary key , " + COLUMN_NAME + " text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        flag=2;
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_STUDENT);
        onCreate(db);
    }

    public boolean insertDATA(int id,String name){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues mContentValues =new ContentValues();
        mContentValues.put(COLUMN_ID,id);
        mContentValues.put(COLUMN_NAME, name);
        db.insert(TABLE_STUDENT, null, mContentValues);
//db.execSQL();
        return  true;
    }
    public void getAllData(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor mCursor=  db.rawQuery("SELECT * FROM "+TABLE_STUDENT,null);
        mCursor.moveToFirst();

        while(!mCursor.isAfterLast()){
            Log.i("ID", mCursor.getString(mCursor.getColumnIndex(COLUMN_ID)));
            Log.i("Name", mCursor.getString(mCursor.getColumnIndex(COLUMN_NAME)));
            mCursor.moveToNext();
        }
        mCursor.close();
    }

    public int updatedb(String oldName, String newName)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues mContentValues =new ContentValues();
        mContentValues.put(COLUMN_NAME, newName);
        String[] param = {oldName};
        int cnt = db.update(TABLE_STUDENT,mContentValues,COLUMN_NAME+" =? ",param);
        return cnt;
    }

    public int deletedb(String name)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String[] param = {name};
        int cnt = db.delete(TABLE_STUDENT, COLUMN_NAME + " =? ", param);
        return cnt;
    }

    public int login(String name)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        String [] param = {name};
        String q = "SELECT * FROM " + TABLE_STUDENT + " where name=?";
        Cursor mCursor=  db.rawQuery(q, param);
        mCursor.moveToFirst();
        if (mCursor != null) {
            if(mCursor.getCount() >0)
            {
                return mCursor.getInt(mCursor.getColumnIndex(COLUMN_ID));
            }
        }
        return 0;
    }

}
