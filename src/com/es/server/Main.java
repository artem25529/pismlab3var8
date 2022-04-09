package com.es.server;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {
    public static final String UNIQUE_BINDING_NAME = "least_common_multiple";

    public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException {
        final LeastCommonMultipleImpl converter = new LeastCommonMultipleImpl();
        final Registry registry = LocateRegistry.createRegistry(2745);

        Remote stab = UnicastRemoteObject.exportObject(converter, 0);
        registry.bind(UNIQUE_BINDING_NAME, stab);
        Thread.sleep(Integer.MAX_VALUE);
    }
}
