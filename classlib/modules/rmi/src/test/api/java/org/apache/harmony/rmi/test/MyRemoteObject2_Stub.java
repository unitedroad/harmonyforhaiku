/*
 * RMI stub class
 * for class org.apache.harmony.rmi.test.MyRemoteObject2
 * Compatible with stub protocol version 1.2
 *
 * Generated by DRL RMI Compiler (rmic).
 *
 * DO NOT EDIT!!!
 * Contents subject to change without notice!
 */
package org.apache.harmony.rmi.test;


public final class MyRemoteObject2_Stub extends java.rmi.server.RemoteStub
        implements org.apache.harmony.rmi.test.MyRemoteInterface2, java.rmi.Remote {

    private static final long serialVersionUID = 2;

    private static java.lang.reflect.Method $method_test2_0;

    static {
        try {
            $method_test2_0 = org.apache.harmony.rmi.test.MyRemoteInterface2.class.getMethod("test2", new java.lang.Class[] {});
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.NoSuchMethodError(
                    "Stub class initialization failed: org.apache.harmony.rmi.test.MyRemoteObject2_Stub");
        }
    }

    public MyRemoteObject2_Stub(java.rmi.server.RemoteRef ref) {
        super(ref);
    }

    // Implementation of test2()
    public java.lang.String test2()
            throws java.rmi.RemoteException {
        try {
            java.lang.Object $result = ref.invoke(this, $method_test2_0, null, 5666065769628162627L);
            return ((java.lang.String) $result);
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.UnexpectedException("Undeclared checked exception", e);
        }
    }
}
