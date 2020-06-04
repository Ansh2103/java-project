package com.cm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quizz")
public class Quizz {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    @Column
	    private String quizzType;
	    @Column
	    private int totalQuestions;
	    @Column
	    private int totalRights;
	    
	    @Column
	    private int totalWrongs;
	    @Column
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
