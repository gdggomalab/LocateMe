package com.gdggoma.locateme.android.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.gdggoma.locateme.android.model.Place;
import com.gdggoma.locateme.android.model.Town;

public class LocateMeHelper {

	private static final int DB_VERSION=1;
	private static final String DB_NAME="locateme.db";
	private static final String DB_TAG="LocateMe";
	
	private DBHelper dbh;
	private SQLiteDatabase locatemedb;
	private final Context ctx;
	
	private static final String place_table="place";
	private static final String town_table="town";
	private static final String user_table="user";
	
	public static final String KEY_ID="_id";
	
	public static final String town_id="idt";
	public static final String town_name="nametown";
	public static final String town_country="country";
	
	public static final String place_id="id";
	public static final String place_name="name";
	public static final String place_idt="idt";
	public static final String place_adress="adress";
	public static final String place_description="description";
	public static final String place_latitude="latitude";
	public static final String place_longitude="longitude";
	public static final String place_altitude="altitude";
	public static final String place_entrydate="entrydate";
	public static final String place_photo="photo";
	
	
	private static final String create_table_place=
			"create table if not exists " + place_table + "(" +
			KEY_ID + " integer primary key autoincrement, " +
		    place_id + " text not null, " +
			place_name + " text not null, " +
			place_idt + " text not null, " +
			place_adress + " text, " +
			place_description + " text, " +
			place_latitude + " double, " +
			place_longitude + " double, " +
			place_altitude + " integer, " +
			place_entrydate + " text, " +
			place_photo + " text )"; 
			
	private static final String create_table_town=
			"create table if not exists " + town_table + "(" +
			KEY_ID + " integer primary key autoincrement, " +
			town_id + " text not null, " +
			town_name + " text not null, " +
			town_country + " text )";
	
	
	
	//Definition du context
	public LocateMeHelper(Context context){
		this.ctx=context;
	}
	
	//Methode qui permettra d'ouvrir la connexion a la base des donnees
	public LocateMeHelper open() throws SQLException{
		dbh=new DBHelper(ctx);
		locatemedb=dbh.getWritableDatabase();
		return this;
	}
	
	//Ferme la base des donnees
	public void close(){
		if(dbh != null){
			dbh.close();
		}
	}
	
	
	public class DBHelper extends SQLiteOpenHelper{

		public DBHelper(Context context) {
			super(context, DB_NAME, null, DB_VERSION);
			
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// creation de la base des donnees et des tables
			Log.w(DB_TAG, "Create database\'s tables");			
			//db.execSQL(create_table_user);
			db.execSQL(create_table_town);
			db.execSQL(create_table_place);
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// Upgrade de la Base des donnees
			Log.w(DB_TAG, "Update database from version "+ oldVersion +" to version " + newVersion);
			db.execSQL("DROP TABLE IF EXIST " + user_table);
			db.execSQL("DROP TABLE IF EXIST " + town_table);
			db.execSQL("DROP TABLE IF EXIST " + place_table);
			onCreate(db);
			
		}
	}
	
	public long insertTown(Town t){
		ContentValues c=new ContentValues();
		c.put(town_id, t.getIdt());
		c.put(town_name, t.getNametown());
		c.put(town_country, t.getCountry());
		
		return locatemedb.insert(town_table, null, c);
	}
	
	public long insertPlace(Place p){
		ContentValues c=new ContentValues();
		c.put(place_id, p.getId());
		c.put(place_name, p.getName());
		c.put(place_idt, p.getIdt());
		c.put(place_description, p.getDescription());
		c.put(place_latitude, p.getLatitude());
		c.put(place_longitude, p.getLongitude());
		c.put(place_adress, p.getAdress());
		
		return locatemedb.insert(place_table, null, c);
	}
	
	
}
