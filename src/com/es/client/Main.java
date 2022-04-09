package com.es.client;

import com.es.server.LeastCommonMultiple;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Main {
    public static final String UNIQUE_BINDING_NAME = "least_common_multiple";

    public static void main(String[] args) throws RemoteException, NotBoundException {
        final Registry registry = LocateRegistry.getRegistry(2745);
        LeastCommonMultiple leastCommonMultiple = (LeastCommonMultiple) registry.lookup(UNIQUE_BINDING_NAME);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.printf("Least common multiple of %d and %d is %d%n", a, b, leastCommonMultiple.findLcm(a, b));
    }
}
