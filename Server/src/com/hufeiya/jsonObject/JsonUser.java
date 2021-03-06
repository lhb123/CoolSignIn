package com.hufeiya.jsonObject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.hufeiya.entity.Course;
import com.hufeiya.entity.User;


public class JsonUser {

	// Fields

	private Integer uid;
	private String username;
	private String pass;
	private String userNo;
	private String phone;
	private Boolean userType;
	private Map<Integer, JsonCourse>jsonCoursesMap = new HashMap<Integer, JsonCourse>();
	// Constructors

	/** default constructor */
	public JsonUser() {
	}

	/** full constructor */
	public JsonUser(String username, String pass, String userNo, String phone,
			Boolean userType) {
		this.username = username;
		this.pass = pass;
		this.userNo = userNo;
		this.phone = phone;
		this.userType = userType;
	}
	
	public JsonUser(User user){
		this.uid = user.getUid();
		this.username = user.getUsername();
		this.pass = user.getPass();
		this.userNo = user.getUserNo();
		this.phone = user.getPhone();
		this.userType = user.getUserType();
		Set<Course> tempCouses = user.getCourses();
		for(Course course:tempCouses){
			JsonCourse tempJsonCourse = new JsonCourse(course);
			this.jsonCoursesMap.put(tempJsonCourse.getCid(), tempJsonCourse);
		}
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


	public Map<Integer, JsonCourse> getJsonCoursesMap() {
		return jsonCoursesMap;
	}

	public void setJsonCoursesMap(Map<Integer, JsonCourse> jsonCoursesMap) {
		this.jsonCoursesMap = jsonCoursesMap;
	}

	public String getUserNo() {
		return this.userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getUserType() {
		return this.userType;
	}

	public void setUserType(Boolean userType) {
		this.userType = userType;
	}

}