package com.xworkz.runner;

import com.xworkz.inner.Remote;
import com.xworkz.inner.TataRemote;
import com.xworkz.usage.User;

public class RemoteRunner {

    public static void main(String[] args) {

        Remote remote=new TataRemote();

        User user=new User();

        user.setRemote(remote);

        user.operate();
    }
}
