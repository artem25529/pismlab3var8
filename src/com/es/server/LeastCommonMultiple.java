package com.es.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LeastCommonMultiple extends Remote {
    int findLcm(int a, int b) throws RemoteException;
}
