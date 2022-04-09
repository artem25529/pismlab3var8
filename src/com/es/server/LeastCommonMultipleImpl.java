package com.es.server;

import java.rmi.RemoteException;

public class LeastCommonMultipleImpl implements LeastCommonMultiple {
    @Override
    public int findLcm(int a, int b) throws RemoteException {
        return a / findGcd(a,b) * b;
    }

    private int findGcd(int a, int b) {
        return b == 0 ? a : findGcd(b,a % b);
    }
}
