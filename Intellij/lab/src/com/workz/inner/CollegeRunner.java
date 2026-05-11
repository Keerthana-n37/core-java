package com.workz.inner;

public class CollegeRunner {

    public static void main(String[] args) {

        College college= new MVJCollege();

        college.exam();
        college.fest();
        college.library();
        college.results();

        College.takeClass();
    }
}
