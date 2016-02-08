package com.example.berraco.databasetest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by berraco on 07/02/16.
 */
public class BDAlumnos extends SQLiteOpenHelper{

    String sqlCreate = "CREATE TABLE Alumnos (codigo INTEGER,nombre TEXT)";
    String slqCreate2 = "CREATE TABLE Alumnos (codigo INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, direccion TEXT)";

    public BDAlumnos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // si no existe la base de datos la crea y ejecuta los siguientes comandos
        db.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            //se elimina la version anterior de la tabla
        db.execSQL("DROP TABLE IF EXISTS Alumnos");

        //Se crea la nueva version de la tabla
        db.execSQL(slqCreate2);

    }




}
