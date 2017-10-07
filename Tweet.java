package com.example.twitterproject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by James on 02/03/2017.
 */

public class Tweet {
    private String name;
    private String username;
    private String content;
    private String postDate;
    private int wordCount;
    private int posCount;
    private int negCount;
    private double posScore;
    private double negScore;
    private ArrayList<String> posWords;
    private ArrayList<String> negWords;
    private long tweetID;
    private ArrayList<String> posSentWords;
    private ArrayList<String> negSentWords;
    private ArrayList<String> tweetWords;

    public Tweet(String name, String username, String content, String postDate) {
        this.name = name;
        this.username = username;
        this.content = content;
        this.postDate = postDate;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getContent() {
        return content;
    }

    public String getPostDate() {
        return postDate;
    }

    public String getTweetID() {
        return Long.toString(tweetID);
    }

    public int getTweetWordCount() {
        return wordCount;
    }

    public double getPositiveSentiment() {
        return posScore;
    }

    public double getNegativeSentiment() {
        return negScore;
    }

    public ArrayList<String> getPosWords() {
        return posWords;
    }

    public ArrayList<String> getNegWords() {
        return negWords;
    }

    public ArrayList<String> getPosSentWords() {
        return posSentWords;
    }

    public ArrayList<String> getNegSentWords() {
        return negSentWords;
    }

    public void setTweetID(long tweetID) {
        this.tweetID = tweetID;
    }

    public void setPosWords(ArrayList<String> posWords) {
        this.posWords = posWords;
    }
    public void setNegWords(ArrayList<String> negWords) {
        this.negWords = negWords;
    }
    public void setTweetWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public void setPositiveSentiment(int posCount) {
        posScore = (double) posCount / (double) getTweetWordCount();
    }

    public void setNegativeSentiment(int negCount) {
        negScore = (double) negCount / (double) getTweetWordCount();
    }

    public void setPosSentimentWords(ArrayList<String> posSentWords) {
        this.posSentWords = posSentWords;
    }

    public void setNegSentimentWords(ArrayList<String> negSentWords) {
        this.negSentWords = negSentWords;
    }

    public void setTweetWords(String[] words) {
        tweetWords = new ArrayList<String>(Arrays.asList(words));
    }

    public ArrayList<String> getTweetWords() {
        return tweetWords;
    }

}
