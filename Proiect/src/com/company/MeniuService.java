package com.company;

public class MeniuService {

    public void addFel(Meniu meniu, FelDeMancare fel) {

        FelDeMancare[] optiuni = meniu.getOptiuni();
        int n = optiuni.length;
        FelDeMancare[] optiuniupd = new FelDeMancare[n+1];
        for (int i = 0 ;i < n ; i++){
            optiuniupd[i] = optiuni[i];
        }
        optiuniupd[n] = fel;
        meniu.setOptiuni(optiuniupd);

    }

    public void rmvFel(Meniu meniu, FelDeMancare fel) {
        FelDeMancare[] optiuni = meniu.getOptiuni();
        int n = optiuni.length;
        FelDeMancare[] optiuniupd = new FelDeMancare[n-1];
        for (int i =0;i < n -1 ;i++){
            if(optiuni[i]!= fel)
                optiuniupd[i] = optiuni[i];
        }
        meniu.setOptiuni(optiuniupd);
    }
}