package com.example.application.navigationlearnapp;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;

import java.util.ArrayList;

@SuppressLint("Registered")
public class Courses extends AppCompatActivity {

    private static final String TAG = "COURSEActivity";
    private static final int NUM_COLUMNS = 1;

    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        actionbar();

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://www.tradebrains.in/wp-content/uploads/2017/05/What-kind-of-Investor-you-are-cover-1.jpg");
        mNames.add("What kind of Investor you are? Find out here");

        mImageUrls.add("https://www.tradebrains.in/wp-content/uploads/2017/04/investing-myths-2.jpg");
        mNames.add("7 Most Common Stock Investing Myths");

        mImageUrls.add("https://www.tradebrains.in/wp-content/uploads/2017/05/reasons-to-start-investing-2.jpg");
        mNames.add("10 Reasons To Start Investing In Stock Market Today");

        mImageUrls.add("https://www.tradebrains.in/wp-content/uploads/2017/05/most-common-scams-in-indian-stock-market.jpg");
        mNames.add("3 Most Common Scams in Indian Stock Market That You Should be Aware of");

        mImageUrls.add("https://www.tradebrains.in/wp-content/uploads/2017/04/What-is-the-minimum-money-I-need-to-start-stock-trading-in-India.jpg");
        mNames.add("What is the minimum money I need to start stock trading in India?");

        mImageUrls.add("https://www.tradebrains.in/wp-content/uploads/2017/05/why-people-lose-money-in-stock-market-cover.jpg");
        mNames.add("6 Reasons Why Most People Lose Money in Stock Market");


        mImageUrls.add("https://i2.wp.com/www.tradebrains.in/wp-content/uploads/2017/04/10-must-read-books-for-the-stock-market.png?resize=678%2C381&ssl=1");
        mNames.add("10 Must Read Books For Stock Market Investors");

        mImageUrls.add("https://www.tradebrains.in/wp-content/uploads/2017/07/best-stock-market-apps-2017-cover-1-678x381.jpg");
        mNames.add("7 Best Stock Market Apps that Makes Stock Research 10x Easier");

        mImageUrls.add("https://www.tradebrains.in/wp-content/uploads/2017/07/Untitled-Design-8.png");
        mNames.add("3 Insanely Successful Stock Market Investors in India that you need to Know");



        mImageUrls.add("https://i2.wp.com/www.tradebrains.in/wp-content/uploads/2017/01/stock-market-down.png?resize=678%2C381&ssl=1");
        mNames.add("What are stocks? And what is a Stock Market?");

        mImageUrls.add("https://i2.wp.com/www.tradebrains.in/wp-content/uploads/2017/01/dstreet.jpg?resize=636%2C381&ssl=1");
        mNames.add("What is Nifty and Sensex? Stock Market Basics (For Beginners)");

        mImageUrls.add("https://i1.wp.com/www.tradebrains.in/wp-content/uploads/2017/01/sensex2.jpg?resize=660%2C381&ssl=1");
        mNames.add("How is Sensex calculated?");

        mImageUrls.add("https://i1.wp.com/www.tradebrains.in/wp-content/uploads/2017/01/Nifty50_logo.jpg?resize=678%2C375&ssl=1");
        mNames.add("What is Nifty? Nifty Meaning Explained for Beginners");

        mImageUrls.add("https://i2.wp.com/www.tradebrains.in/wp-content/uploads/2017/01/bearvsbull2.jpg?resize=551%2C311&ssl=1");
        mNames.add("What is Bull and Bear market?");

        mImageUrls.add("https://i0.wp.com/www.tradebrains.in/wp-content/uploads/2017/06/market-capitalization-in-Indian-stock-market-COVER.png?resize=678%2C381&ssl=1");
        mNames.add("Everything about Market Capitalization in Indian Stock Market");

        mImageUrls.add("https://i2.wp.com/www.tradebrains.in/wp-content/uploads/2017/11/27-Key-terms-in-share-market-that-you-should-know.png?resize=678%2C381&ssl=1");
        mNames.add("#27 Key terms in share market that you should know");

        mImageUrls.add("https://i2.wp.com/www.tradebrains.in/wp-content/uploads/2017/11/Why-do-stock-prices-fluctuate.png?resize=678%2C381&ssl=1");
        mNames.add("Why do stock prices fluctuate?");

        initRecyclerView1();

    }

    private void initRecyclerView1(){
        Log.d(TAG, "initRecyclerView: initializing staggered recyclerview.");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        StaggeredRecylerViewAdapter staggeredRecyclerViewAdapter =
                new StaggeredRecylerViewAdapter( mNames, mImageUrls,this);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(staggeredRecyclerViewAdapter);
    }

    //Back Button
    public void actionbar(){
        //for back button in Action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //for Title in Action Bar
        getSupportActionBar().setTitle("Courses");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
