package com.krazevina.thioto;


import java.util.ArrayList;
import java.util.HashMap;

import android.view.View;

import com.krazevina.thioto.R;
import com.krazevina.thioto.objects.Dieu;
import com.krazevina.thioto.objects.ItemBienbao;
import com.krazevina.thioto.objects.ItemCauhoi;

public class Toancuc {

	public static Dieu rangedieu;
	
	public static int tabselected=-1;
	public static boolean duocxemmeothi=false;
	
	public static boolean viewing_detail=false;
	public static int dieuhientai=-1;
	
	public static boolean dangthi = false;
	public static boolean dongykethuc = false;
	public static HashMap<View, Integer> view_chuong = new HashMap<View, Integer>();

	
	public static ArrayList<ItemCauhoi> list_cauhoithi = new ArrayList<ItemCauhoi>();
	public static ArrayList<ItemCauhoi> list_cauhoi = new ArrayList<ItemCauhoi>();
	public static int baithi_current_cauhoi = -1;
	public static boolean on_datraloi = false;
	public static int thoigianlambai = 0;

	public static String giobatdau = "";
	public static String ngaybatdau = "";

	public static boolean chuathemdulieu = true;

	// dữ liệu biển báo
	public static ArrayList<ItemBienbao> list_item_bienbao = new ArrayList<ItemBienbao>();
     
	public static ArrayList<ItemCauhoi> list1 = new ArrayList<ItemCauhoi>();
	public static ArrayList<ItemCauhoi> list2 = new ArrayList<ItemCauhoi>();
	public static ArrayList<ItemCauhoi> list3 = new ArrayList<ItemCauhoi>();
	public static ArrayList<ItemCauhoi> list4 = new ArrayList<ItemCauhoi>();
	public static ArrayList<ItemCauhoi> list5 = new ArrayList<ItemCauhoi>();
	public static ArrayList<ItemCauhoi> list6 = new ArrayList<ItemCauhoi>();
	public static ArrayList<ItemCauhoi> list7 = new ArrayList<ItemCauhoi>();
	public static ArrayList<ItemCauhoi> list8 = new ArrayList<ItemCauhoi>();
	// dữ liệu bộ đề
	public static ArrayList<ItemCauhoi> luat_da_tl = new ArrayList<ItemCauhoi>();
	public static  ArrayList<ItemCauhoi> bienbao_da_tl = new ArrayList<ItemCauhoi>();
	public static  ArrayList<ItemCauhoi> tinhuong_da_tl = new ArrayList<ItemCauhoi>();

	public static  ArrayList<ItemCauhoi> luat_chua_tl = new ArrayList<ItemCauhoi>();
	public static  ArrayList<ItemCauhoi> bienbao_chua_tl = new ArrayList<ItemCauhoi>();
	public static  ArrayList<ItemCauhoi> tinhuong_chua_tl = new ArrayList<ItemCauhoi>();
	
	// du lieu nguyen goc 
	public static   ArrayList<ItemCauhoi> luat_list=new ArrayList<ItemCauhoi>(); ;
	public static   ArrayList<ItemCauhoi> bienbao_list=new ArrayList<ItemCauhoi>() ;
	public static   ArrayList<ItemCauhoi> tinhuong_list =new ArrayList<ItemCauhoi>();
	/// bien bao data
	public static  ArrayList<ItemBienbao> bb_biencams = new ArrayList<ItemBienbao>();
	public static  ArrayList<ItemBienbao> bb_nguyhiems = new ArrayList<ItemBienbao>();
	public static  ArrayList<ItemBienbao> bb_hieulenhs = new ArrayList<ItemBienbao>();
	public static  ArrayList<ItemBienbao> bb_chidans = new ArrayList<ItemBienbao>();
	public static  ArrayList<ItemBienbao> bb_bienphus = new ArrayList<ItemBienbao>();
	public static  ArrayList<ItemBienbao> bb_vachkes = new ArrayList<ItemBienbao>();

	
	public static HashMap<String, Integer> getMap() {

		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		hash.put("101.jpg",R.drawable.bienbao101);
		hash.put("102.jpg",R.drawable.bienbao102);
		hash.put("103a.jpg",R.drawable.bienbao103a);
		hash.put("103b.png",R.drawable.bienbao103b);
		hash.put("103c.png",R.drawable.bienbao103c);
		hash.put("104.jpg",R.drawable.bienbao104);
		hash.put("105.jpg",R.drawable.bienbao105);
		hash.put("106.jpg",R.drawable.bienbao106);
		hash.put("107.jpg",R.drawable.bienbao107);
		hash.put("108.jpg",R.drawable.bienbao108);
		hash.put("109.png",R.drawable.bienbao109);
		hash.put("110a.jpg",R.drawable.bienbao110a);
		hash.put("110b.jpg",R.drawable.bienbao110b);
		hash.put("111a.jpg",R.drawable.bienbao111a);
		hash.put("111b.png",R.drawable.bienbao111b);
		hash.put("111c.png",R.drawable.bienbao111c);
		hash.put("111d.png",R.drawable.bienbao111d);
		hash.put("112.jpg",R.drawable.bienbao112);
		hash.put("113.jpg",R.drawable.bienbao113);
		hash.put("114.png",R.drawable.bienbao114);
		hash.put("115.png",R.drawable.bienbao115);
		hash.put("116.png",R.drawable.bienbao116);
		hash.put("117.jpg",R.drawable.bienbao117);
		hash.put("118.jpg",R.drawable.bienbao118);
		hash.put("119.png",R.drawable.bienbao119);
		hash.put("120.png",R.drawable.bienbao120);
		hash.put("121.png",R.drawable.bienbao121);
		hash.put("122.jpg",R.drawable.bienbao122);
		hash.put("123a.jpg",R.drawable.bienbao123a);
		hash.put("123b.png",R.drawable.bienbao123b);
		hash.put("124a.jpg",R.drawable.bienbao124a);
		hash.put("124b.png",R.drawable.bienbao124b);
		hash.put("125.jpg",R.drawable.bienbao125);
		hash.put("126.jpg",R.drawable.bienbao126);
		hash.put("127.jpg",R.drawable.bienbao127);
		hash.put("128.png",R.drawable.bienbao128);
		hash.put("129.png",R.drawable.bienbao129);
		hash.put("130.jpg",R.drawable.bienbao130);
		hash.put("132.png",R.drawable.bienbao132);
		hash.put("133.png",R.drawable.bienbao133);
		hash.put("134.jpg",R.drawable.bienbao134);
		hash.put("135.jpg",R.drawable.bienbao135);
		hash.put("136.png",R.drawable.bienbao136);
		hash.put("137.png",R.drawable.bienbao137);
		hash.put("138.png",R.drawable.bienbao138);
		hash.put("139.png",R.drawable.bienbao139);
		hash.put("201a.jpg",R.drawable.bienbao201a);
		hash.put("201b.png",R.drawable.bienbao201b);
		hash.put("202.png",R.drawable.bienbao202);
		hash.put("203a.jpg",R.drawable.bienbao203a);
		hash.put("203b.png",R.drawable.bienbao203b);
		hash.put("203c.png",R.drawable.bienbao203c);
		hash.put("204.png",R.drawable.bienbao204);
		hash.put("205a.jpg",R.drawable.bienbao205a);
		hash.put("206.jpg",R.drawable.bienbao206);
		hash.put("207a.jpg",R.drawable.bienbao207a);
		hash.put("208.jpg",R.drawable.bienbao208);
		hash.put("209.jpg",R.drawable.bienbao209);
		hash.put("210.jpg",R.drawable.bienbao210);
		hash.put("211.jpg",R.drawable.bienbao211);
		hash.put("212.jpg",R.drawable.bienbao212);
		hash.put("213.png",R.drawable.bienbao213);
		hash.put("214.png",R.drawable.bienbao214);
		hash.put("215a.png",R.drawable.bienbao215a);
		hash.put("215b.png",R.drawable.bienbao215b);
		hash.put("216.png",R.drawable.bienbao216);
		hash.put("217.png",R.drawable.bienbao217);
		hash.put("218.png",R.drawable.bienbao218);
		hash.put("219.jpg",R.drawable.bienbao219);
		hash.put("220.png",R.drawable.bienbao220);
		hash.put("221a.png",R.drawable.bienbao221a);
		hash.put("221b.png",R.drawable.bienbao221b);
		hash.put("222.png",R.drawable.bienbao222);
		hash.put("223a.png",R.drawable.bienbao223a);
		hash.put("224.png",R.drawable.bienbao224);
		hash.put("225.jpg",R.drawable.bienbao225);
		hash.put("226.jpg",R.drawable.bienbao226);
		hash.put("227.png",R.drawable.bienbao227);
		hash.put("228a.png",R.drawable.bienbao228a);
		hash.put("229.png",R.drawable.bienbao229);
		hash.put("230.png",R.drawable.bienbao230);
		hash.put("231.png",R.drawable.bienbao231);
		hash.put("232.png",R.drawable.bienbao232);
		hash.put("233.png",R.drawable.bienbao233);
		hash.put("234.jpg",R.drawable.bienbao234);
		hash.put("235.png",R.drawable.bienbao235);
		hash.put("236.png",R.drawable.bienbao236);
		hash.put("237.png",R.drawable.bienbao237);
		hash.put("238.jpg",R.drawable.bienbao238);
		hash.put("239.jpg",R.drawable.bienbao239);
		hash.put("240.png",R.drawable.bienbao240);
		hash.put("241.png",R.drawable.bienbao241);
		hash.put("242a.jpg",R.drawable.bienbao242a);
		hash.put("242b.jpg",R.drawable.bienbao242b);
		hash.put("243.png",R.drawable.bienbao243);
		hash.put("244.png",R.drawable.bienbao244);
		hash.put("245.png",R.drawable.bienbao245);
		hash.put("246.png",R.drawable.bienbao246a);
		hash.put("301a.png",R.drawable.bienbao301a);
		hash.put("301b.png",R.drawable.bienbao301b);
		hash.put("301c.png",R.drawable.bienbao301c);
		hash.put("301d.png",R.drawable.bienbao301d);
		hash.put("301e.png",R.drawable.bienbao301e);
		hash.put("301f.png",R.drawable.bienbao301f);
		hash.put("301h.png",R.drawable.bienbao301h);
		hash.put("301i.png",R.drawable.bienbao301i);
		hash.put("302a.png",R.drawable.bienbao302a);
		hash.put("302b.png",R.drawable.bienbao302b);
		hash.put("303.png",R.drawable.bienbao303);
		hash.put("304.png",R.drawable.bienbao304);
		hash.put("305.png",R.drawable.bienbao305);
		hash.put("306.png",R.drawable.bienbao306);
		hash.put("307.png",R.drawable.bienbao307);
		hash.put("308a.png",R.drawable.bienbao308a);
		hash.put("308b.png",R.drawable.bienbao308b);
		hash.put("309.png",R.drawable.bienbao309);
		hash.put("401.png",R.drawable.bienbao401);
		hash.put("402.png",R.drawable.bienbao402);
		hash.put("403a.png",R.drawable.bienbao403a);
		hash.put("403b.png",R.drawable.bienbao403b);
		hash.put("404a.png",R.drawable.bienbao404a);
		hash.put("404b.png",R.drawable.bienbao404b);
		hash.put("405a.png",R.drawable.bienbao405a);
		hash.put("405b.png",R.drawable.bienbao405b);
		hash.put("405c.png",R.drawable.bienbao405c);
		hash.put("406.png",R.drawable.bienbao406);
		hash.put("407a.png",R.drawable.bienbao407a);
		hash.put("407b.png",R.drawable.bienbao407b);
		hash.put("407c.png",R.drawable.bienbao407c);
		hash.put("408a.png",R.drawable.bienbao408a);
		hash.put("408b.png",R.drawable.bienbao408b);
		hash.put("409.png",R.drawable.bienbao409);
		hash.put("410.png",R.drawable.bienbao410);
		hash.put("411.png",R.drawable.bienbao411);
		hash.put("412.png",R.drawable.bienbao412);
		hash.put("413a.png",R.drawable.bienbao413a);
		hash.put("413b.png",R.drawable.bienbao413b);
		hash.put("413c.png",R.drawable.bienbao413c);
		hash.put("414a.png",R.drawable.bienbao414a);
		hash.put("414b.png",R.drawable.bienbao414b);
		hash.put("423.png",R.drawable.bienbao423);
		hash.put("425.png",R.drawable.bienbao425);
		hash.put("426.png",R.drawable.bienbao426);
		hash.put("427.png",R.drawable.bienbao427);
		hash.put("428.png",R.drawable.bienbao428);
		hash.put("429.png",R.drawable.bienbao429);
		hash.put("430.png",R.drawable.bienbao430);
		hash.put("431.png",R.drawable.bienbao431);
		hash.put("432.png",R.drawable.bienbao432);
		hash.put("433.png",R.drawable.bienbao433);
		hash.put("434.png",R.drawable.bienbao434);
		hash.put("435.png",R.drawable.bienbao435);
		hash.put("436.png",R.drawable.bienbao436);
		hash.put("437.png",R.drawable.bienbao437);
		hash.put("438.png",R.drawable.bienbao438);
		hash.put("439.png",R.drawable.bienbao439);
		hash.put("443.png",R.drawable.bienbao443);
		hash.put("444.png",R.drawable.bienbao444);
		hash.put("447.png",R.drawable.bienbao447);
		hash.put("448a.png",R.drawable.bienbao448a);
		hash.put("501.png",R.drawable.bienbao501);
		hash.put("502.png",R.drawable.bienbao502);
		hash.put("503a.png",R.drawable.bienbao503a);
		hash.put("503b.png",R.drawable.bienbao503b);
		hash.put("503c.png",R.drawable.bienbao503c);
		hash.put("503d.png",R.drawable.bienbao503d);
		hash.put("503e.png",R.drawable.bienbao503e);
		hash.put("503f.png",R.drawable.bienbao503f);
		hash.put("504.png",R.drawable.bienbao504);
		hash.put("505.png",R.drawable.bienbao505);
		hash.put("506a.png",R.drawable.bienbao506a);
		hash.put("506b.png",R.drawable.bienbao506b);
		hash.put("507.png",R.drawable.bienbao507);
		hash.put("508a.png",R.drawable.bienbao508a);
		hash.put("509.png",R.drawable.bienbao509);
		hash.put("vach1-1.png",R.drawable.bienbaovach11);
		hash.put("vach1-2.png",R.drawable.bienbaovach12);
		hash.put("vach1-3.png",R.drawable.bienbaovach13);
		hash.put("vach1-4.png",R.drawable.bienbaovach14);
		hash.put("vach1-5.png",R.drawable.bienbaovach15);
		hash.put("vach1-5.png",R.drawable.bienbaovach15);
		hash.put("vach1-7.png",R.drawable.bienbaovach17);
		hash.put("vach1-8.png",R.drawable.bienbaovach18);
		hash.put("vach1-9.png",R.drawable.bienbaovach19);
		hash.put("vach1-10.png",R.drawable.bienbaovach110);
		hash.put("vach1-11.png",R.drawable.bienbaovach111);
		hash.put("vach1-12.png",R.drawable.bienbaovach112);
		hash.put("vach1-13.png",R.drawable.bienbaovach113);
		hash.put("vach1-14.png",R.drawable.bienbaovach114);
		hash.put("vach1-15.png",R.drawable.bienbaovach115);
		hash.put("vach1-16-1.png",R.drawable.bienbaovach1161);
		hash.put("vach1-16-2.png",R.drawable.bienbaovach1162);
		hash.put("vach1-16-3.png",R.drawable.bienbaovach1163);
		hash.put("vach1-17.png",R.drawable.bienbaovach117);
		hash.put("vach1-18.png",R.drawable.bienbaovach118);
		hash.put("vach1-19.png",R.drawable.bienbaovach119);
		hash.put("vach1-20.png",R.drawable.bienbaovach120);
		hash.put("vach1-21.png",R.drawable.bienbaovach121);
		hash.put("vach1-22.png",R.drawable.bienbaovach122);
		hash.put("vach1-23.png",R.drawable.bienbaovach123);
		hash.put("vach2-1.png",R.drawable.bienbaovach21);
		hash.put("vach2-2.png",R.drawable.bienbaovach22);
		hash.put("vach2-3.png",R.drawable.bienbaovach23);
		hash.put("vach2-4.png",R.drawable.bienbaovach24);
		hash.put("vach2-5.png",R.drawable.bienbaovach25);
		hash.put("vach2-6.png",R.drawable.bienbaovach26);
		hash.put("vach2-7.png",R.drawable.bienbaovach27);

		return hash;
	}

	public static HashMap<String, Integer> getMapImagecauhoi() {

		HashMap<String, Integer> hashcauhoi = new HashMap<String, Integer>();

		hashcauhoi.put("161.png", R.drawable.cauhoi161);
		hashcauhoi.put("162.png", R.drawable.cauhoi162);
		hashcauhoi.put("163.png", R.drawable.cauhoi163);
		hashcauhoi.put("164.png", R.drawable.cauhoi164);
		hashcauhoi.put("165.png", R.drawable.cauhoi165);
		hashcauhoi.put("226.png", R.drawable.cauhoi226);
		hashcauhoi.put("227.png", R.drawable.cauhoi227);
		hashcauhoi.put("228.png", R.drawable.cauhoi228);
		hashcauhoi.put("229.png", R.drawable.cauhoi229);
		hashcauhoi.put("230.png", R.drawable.cauhoi230);
		hashcauhoi.put("231.png", R.drawable.cauhoi231);
		hashcauhoi.put("232.png", R.drawable.cauhoi232);
		hashcauhoi.put("233.png", R.drawable.cauhoi233);
		hashcauhoi.put("234.png", R.drawable.cauhoi234);
		hashcauhoi.put("235.png", R.drawable.cauhoi235);
		hashcauhoi.put("236.png", R.drawable.cauhoi236);
		hashcauhoi.put("237.png", R.drawable.cauhoi237);
		hashcauhoi.put("238.png", R.drawable.cauhoi238);
		hashcauhoi.put("239.png", R.drawable.cauhoi239);
		hashcauhoi.put("240.png", R.drawable.cauhoi240);
		hashcauhoi.put("241.png", R.drawable.cauhoi241);
		hashcauhoi.put("242.png", R.drawable.cauhoi242);
		hashcauhoi.put("243.png", R.drawable.cauhoi243);
		hashcauhoi.put("244.png", R.drawable.cauhoi244);
		hashcauhoi.put("245.png", R.drawable.cauhoi245);
		hashcauhoi.put("246.png", R.drawable.cauhoi246);
		hashcauhoi.put("247.png", R.drawable.cauhoi247);
		hashcauhoi.put("248.png", R.drawable.cauhoi248);
		hashcauhoi.put("249.png", R.drawable.cauhoi249);
		hashcauhoi.put("250.png", R.drawable.cauhoi250);
		hashcauhoi.put("251.png", R.drawable.cauhoi251);
		hashcauhoi.put("252.png", R.drawable.cauhoi252);
		hashcauhoi.put("253.png", R.drawable.cauhoi253);
		hashcauhoi.put("254.png", R.drawable.cauhoi254);
		hashcauhoi.put("255.png", R.drawable.cauhoi255);
		hashcauhoi.put("256.png", R.drawable.cauhoi256);
		hashcauhoi.put("259.png", R.drawable.cauhoi259);
		hashcauhoi.put("262.png", R.drawable.cauhoi262);
		hashcauhoi.put("265.png", R.drawable.cauhoi265);
		hashcauhoi.put("266.png", R.drawable.cauhoi266);
		hashcauhoi.put("268.png", R.drawable.cauhoi268);
		hashcauhoi.put("270.png", R.drawable.cauhoi270);
		hashcauhoi.put("271.png", R.drawable.cauhoi271);
		hashcauhoi.put("272.png", R.drawable.cauhoi272);
		hashcauhoi.put("274.png", R.drawable.cauhoi274);
		hashcauhoi.put("276.png", R.drawable.cauhoi276);
		hashcauhoi.put("277.png", R.drawable.cauhoi277);
		hashcauhoi.put("279.png", R.drawable.cauhoi279);
		hashcauhoi.put("280.png", R.drawable.cauhoi280);
		hashcauhoi.put("281.png", R.drawable.cauhoi281);
		hashcauhoi.put("285.png", R.drawable.cauhoi285);
		hashcauhoi.put("289.png", R.drawable.cauhoi289);
		hashcauhoi.put("290.png", R.drawable.cauhoi290);
		hashcauhoi.put("291.png", R.drawable.cauhoi291);
		hashcauhoi.put("292.png", R.drawable.cauhoi292);
		hashcauhoi.put("293.png", R.drawable.cauhoi293);
		hashcauhoi.put("294.png", R.drawable.cauhoi294);
		hashcauhoi.put("297.png", R.drawable.cauhoi297);
		hashcauhoi.put("299.png", R.drawable.cauhoi299);
		hashcauhoi.put("300.png", R.drawable.cauhoi300);
		hashcauhoi.put("301.png", R.drawable.cauhoi301);
		hashcauhoi.put("302.png", R.drawable.cauhoi302);
		hashcauhoi.put("303.png", R.drawable.cauhoi303);
		hashcauhoi.put("304.png", R.drawable.cauhoi304);
		hashcauhoi.put("305.png", R.drawable.cauhoi305);
		hashcauhoi.put("306.png", R.drawable.cauhoi306);
		hashcauhoi.put("307.png", R.drawable.cauhoi307);
		hashcauhoi.put("308.png", R.drawable.cauhoi308);
		hashcauhoi.put("309.png", R.drawable.cauhoi309);
		hashcauhoi.put("310.png", R.drawable.cauhoi310);
		hashcauhoi.put("311.png", R.drawable.cauhoi311);
		hashcauhoi.put("312.png", R.drawable.cauhoi312);
		hashcauhoi.put("313.png", R.drawable.cauhoi313);
		hashcauhoi.put("314.png", R.drawable.cauhoi314);
		hashcauhoi.put("315.png", R.drawable.cauhoi315);
		hashcauhoi.put("316.png", R.drawable.cauhoi316);
		hashcauhoi.put("317.png", R.drawable.cauhoi317);
		hashcauhoi.put("318.png", R.drawable.cauhoi318);
		hashcauhoi.put("319.png", R.drawable.cauhoi319);
		hashcauhoi.put("320.png", R.drawable.cauhoi320);
		hashcauhoi.put("321.png", R.drawable.cauhoi321);
		hashcauhoi.put("322.png", R.drawable.cauhoi322);
		hashcauhoi.put("323.png", R.drawable.cauhoi323);
		hashcauhoi.put("324.png", R.drawable.cauhoi324);
		hashcauhoi.put("325.png", R.drawable.cauhoi325);
		hashcauhoi.put("326.png", R.drawable.cauhoi326);
		hashcauhoi.put("327.png", R.drawable.cauhoi327);
		hashcauhoi.put("328.png", R.drawable.cauhoi328);
		hashcauhoi.put("329.png", R.drawable.cauhoi329);
		hashcauhoi.put("330.png", R.drawable.cauhoi330);
		hashcauhoi.put("331.png", R.drawable.cauhoi331);
		hashcauhoi.put("332.png", R.drawable.cauhoi332);
		hashcauhoi.put("333.png", R.drawable.cauhoi333);
		hashcauhoi.put("334.png", R.drawable.cauhoi334);
		hashcauhoi.put("335.png", R.drawable.cauhoi335);
		hashcauhoi.put("336.png", R.drawable.cauhoi336);
		hashcauhoi.put("337.png", R.drawable.cauhoi337);
		hashcauhoi.put("338.png", R.drawable.cauhoi338);
		hashcauhoi.put("339.png", R.drawable.cauhoi339);
		hashcauhoi.put("340.png", R.drawable.cauhoi340);
		hashcauhoi.put("341.png", R.drawable.cauhoi341);
		hashcauhoi.put("342.png", R.drawable.cauhoi342);
		hashcauhoi.put("343.png", R.drawable.cauhoi343);
		hashcauhoi.put("344.png", R.drawable.cauhoi344);
		hashcauhoi.put("345.png", R.drawable.cauhoi345);
		hashcauhoi.put("346.png", R.drawable.cauhoi346);
		hashcauhoi.put("347.png", R.drawable.cauhoi347);
		hashcauhoi.put("348.png", R.drawable.cauhoi348);
		hashcauhoi.put("349.png", R.drawable.cauhoi349);
		hashcauhoi.put("350.png", R.drawable.cauhoi350);
		hashcauhoi.put("351.png", R.drawable.cauhoi351);
		hashcauhoi.put("352.png", R.drawable.cauhoi352);
		hashcauhoi.put("353.png", R.drawable.cauhoi353);
		hashcauhoi.put("354.png", R.drawable.cauhoi354);
		hashcauhoi.put("355.png", R.drawable.cauhoi355);
		hashcauhoi.put("356.png", R.drawable.cauhoi356);
		hashcauhoi.put("357.png", R.drawable.cauhoi357);
		hashcauhoi.put("358.png", R.drawable.cauhoi358);
		hashcauhoi.put("359.png", R.drawable.cauhoi359);
		hashcauhoi.put("360.png", R.drawable.cauhoi360);
		hashcauhoi.put("361.png", R.drawable.cauhoi361);
		hashcauhoi.put("362.png", R.drawable.cauhoi362);
		hashcauhoi.put("363.png", R.drawable.cauhoi363);
		hashcauhoi.put("364.png", R.drawable.cauhoi364);
		hashcauhoi.put("365.png", R.drawable.cauhoi365);
		hashcauhoi.put("366.png", R.drawable.cauhoi366);
		hashcauhoi.put("367.png", R.drawable.cauhoi367);
		hashcauhoi.put("368.png", R.drawable.cauhoi368);
		hashcauhoi.put("369.png", R.drawable.cauhoi369);
		hashcauhoi.put("370.png", R.drawable.cauhoi370);
		hashcauhoi.put("371.png", R.drawable.cauhoi371);
		hashcauhoi.put("372.png", R.drawable.cauhoi372);
		hashcauhoi.put("373.png", R.drawable.cauhoi373);
		hashcauhoi.put("374.png", R.drawable.cauhoi374);
		hashcauhoi.put("375.png", R.drawable.cauhoi375);
		hashcauhoi.put("376.png", R.drawable.cauhoi376);
		hashcauhoi.put("377.png", R.drawable.cauhoi377);
		hashcauhoi.put("378.png", R.drawable.cauhoi378);
		hashcauhoi.put("379.png", R.drawable.cauhoi379);
		hashcauhoi.put("380.png", R.drawable.cauhoi380);
		hashcauhoi.put("381.png", R.drawable.cauhoi381);
		hashcauhoi.put("382.png", R.drawable.cauhoi382);
		hashcauhoi.put("383.png", R.drawable.cauhoi383);
		hashcauhoi.put("384.png", R.drawable.cauhoi384);
		hashcauhoi.put("385.png", R.drawable.cauhoi385);
		hashcauhoi.put("386.png", R.drawable.cauhoi386);
		hashcauhoi.put("387.png", R.drawable.cauhoi387);
		hashcauhoi.put("388.png", R.drawable.cauhoi388);
		hashcauhoi.put("389.png", R.drawable.cauhoi389);
		hashcauhoi.put("390.png", R.drawable.cauhoi390);
		hashcauhoi.put("391.png", R.drawable.cauhoi391);
		hashcauhoi.put("392.png", R.drawable.cauhoi392);
		hashcauhoi.put("393.png", R.drawable.cauhoi393);
		hashcauhoi.put("394.png", R.drawable.cauhoi394);
		hashcauhoi.put("395.png", R.drawable.cauhoi395);
		hashcauhoi.put("396.png", R.drawable.cauhoi396);
		hashcauhoi.put("397.png", R.drawable.cauhoi397);
		hashcauhoi.put("398.png", R.drawable.cauhoi398);
		hashcauhoi.put("399.png", R.drawable.cauhoi399);
		hashcauhoi.put("400.png", R.drawable.cauhoi400);
		hashcauhoi.put("401.png", R.drawable.cauhoi401);
		hashcauhoi.put("402.png", R.drawable.cauhoi402);
		hashcauhoi.put("403.png", R.drawable.cauhoi403);
		hashcauhoi.put("404.png", R.drawable.cauhoi404);
		hashcauhoi.put("405.png", R.drawable.cauhoi405);

		return hashcauhoi;
	}
}
