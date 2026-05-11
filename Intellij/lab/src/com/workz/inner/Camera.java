package com.workz.inner;

public interface Camera {

    String brand="canon";
    int pixel=48;
    boolean flash=true;

    void capture();
    void deletePhoto();

    default void zoom()
    {
        System.out.println("executing zoom method in camera");
    }

    default void  recordVedio()
    {
        System.out.println("executing recordVedio in camera");
    }

    static void cameraInfo(){
        System.out.println("executing cameraInfo in camera");
    }
}
