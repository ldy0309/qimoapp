package com.example.qimoapp;

import android.app.ListActivity;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;

public class EditNote extends ListActivity {

    private int noteId = -1;
    private EditText etName, etContent;
    private MediaAdapter adapter;
    private NotesDB db;
    private SQLiteDatabase dbRead, dbWrite;
    private String currentPath = null;
 
    public static final int REQUEST_CODE_GET_PHOTO = 1;
    public static final int REQUEST_CODE_GET_VIDEO = 2;
 
    public static final String EXTRA_NOTE_ID = "noteId";
    public static final String EXTRA_NOTE_NAME = "noteName";
    public static final String EXTRA_NOTE_CONTENT = "noteContent";
 
        /**
         * 按钮点击的监听器，实现OnClickListener接口
         */


}
