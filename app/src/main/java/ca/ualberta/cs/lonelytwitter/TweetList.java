package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Erik Lewis on 2018-10-17.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) throws IllegalArgumentException{
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException("That is duplicate! NONONO!");
        }else{
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public boolean deleteTweet(Tweet tweet){
        return (tweets.remove(tweet));
    }

    public ArrayList<Tweet> getTweets(){
        return tweets; //Make tweet a comparable and sort this
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public Integer getCount(){
        return tweets.size();
    }
}
