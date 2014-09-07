package fr.eurecom.tvrdfizator.core.datastructures;

import java.util.Vector;

public class Layer {
	
	
	private String category = ""; 
	private String name= ""; 
	private String id= ""; 
	private String speaker= ""; 
	private String type= ""; 
	
	private String ud_information= ""; 
	private String ud_information_name= ""; 
	
	Vector <ItemLayer> fragments = new Vector<ItemLayer>();
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSpeaker() {
		return speaker;
	}

	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUd_information() {
		return ud_information;
	}

	public void setUd_information(String ud_information) {
		this.ud_information = ud_information;
	}

	public String getUd_information_name() {
		return ud_information_name;
	}

	public void setUd_information_name(String ud_information_name) {
		this.ud_information_name = ud_information_name;
	}
	
	public void addFragment(ItemLayer f){
		this.fragments.add(f);
	}
	
	public Vector<ItemLayer> getFragments(){
		return fragments;
	}
	

}
