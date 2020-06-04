package com.cm.model;

public class QuizzDto {
	 private String quizzType;
	 private int totalQuestions;
	 private int totalRights;
	 private int totalWrongs;
	 private String timeTaken;
	public String getQuizzType() {
		return quizzType;
	}
	public void setQuizzType(String quizzType) {
		this.quizzType = quizzType;
	}
	public int getTotalQuestions() {
		return totalQuestions;
	}
	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}
	public int getTotalRights() {
		return totalRights;
	}
	public void setTotalRights(int totalRights) {
		this.totalRights = totalRights;
	}
	public int getTotalWrongs() {
		return totalWrongs;
	}
	public void setTotalWrongs(int totalWrongs) {
		this.totalWrongs = totalWrongs;
	}
	public String getTimeTaken() {
		return timeTaken;
	}
	public void setTimeTaken(String timeTaken) {
		this.timeTaken = timeTaken;
	}
	  
	
}
