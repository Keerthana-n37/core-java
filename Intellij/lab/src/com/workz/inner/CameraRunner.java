package com.workz.inner;

public class CameraRunner {

    public static void main(String[] args) {

        Camera camera = new DSLR();
        camera.recordVedio();;
        camera.capture();
        camera.deletePhoto();;
        camera.zoom();
        Camera.cameraInfo();
    }
}
