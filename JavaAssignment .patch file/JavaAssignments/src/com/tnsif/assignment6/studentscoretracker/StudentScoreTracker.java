package com.tnsif.assignment6.studentscoretracker;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class StudentScoreTracker {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        int[] scores = new int[n];
	        for (int i = 0; i < n; i++) {
	            scores[i] = sc.nextInt();
	        }

	        ArrayList<Integer> scoreList = new ArrayList<>();
	        for (int score : scores) {
	            scoreList.add(score);
	        }

	        System.out.println("Elements in the ArrayList:");
	        for (int score : scoreList) {
	            System.out.println(score);
	        }

	        sc.close();
	    }
	}


