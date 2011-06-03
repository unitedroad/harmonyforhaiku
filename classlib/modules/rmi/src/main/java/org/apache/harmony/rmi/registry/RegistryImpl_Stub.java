/*
 * RMI stub class
 * for class org.apache.harmony.rmi.registry.RegistryImpl
 * Compatible with stub protocol version 1.1/1.2
 *
 * Generated by DRL RMI Compiler (rmic).
 *
 * DO NOT EDIT!!!
 * Contents subject to change without notice!
 */
package org.apache.harmony.rmi.registry;

import org.apache.harmony.rmi.internal.nls.Messages;


public final class RegistryImpl_Stub extends java.rmi.server.RemoteStub
        implements java.rmi.registry.Registry, java.rmi.Remote {

    private static final long serialVersionUID = 2;

    private static final long interfaceHash = 4905912898345647071L;

    private static boolean useNewInvoke;

    private static final java.rmi.server.Operation[] operations = {
        new java.rmi.server.Operation("void bind(java.lang.String, java.rmi.Remote)"), //$NON-NLS-1$
        new java.rmi.server.Operation("java.lang.String list()[]"), //$NON-NLS-1$
        new java.rmi.server.Operation("java.rmi.Remote lookup(java.lang.String)"), //$NON-NLS-1$
        new java.rmi.server.Operation("void rebind(java.lang.String, java.rmi.Remote)"), //$NON-NLS-1$
        new java.rmi.server.Operation("void unbind(java.lang.String)") //$NON-NLS-1$
    };

    private static java.lang.reflect.Method $method_bind_0;
    private static java.lang.reflect.Method $method_list_1;
    private static java.lang.reflect.Method $method_lookup_2;
    private static java.lang.reflect.Method $method_rebind_3;
    private static java.lang.reflect.Method $method_unbind_4;

    static {
        try {
            java.rmi.server.RemoteRef.class.getMethod("invoke", new java.lang.Class[] {java.rmi.Remote.class, java.lang.reflect.Method.class, java.lang.Object[].class, long.class}); //$NON-NLS-1$

            $method_bind_0 = java.rmi.registry.Registry.class.getMethod("bind", new java.lang.Class[] {java.lang.String.class, java.rmi.Remote.class}); //$NON-NLS-1$
            $method_list_1 = java.rmi.registry.Registry.class.getMethod("list", new java.lang.Class[] {}); //$NON-NLS-1$
            $method_lookup_2 = java.rmi.registry.Registry.class.getMethod("lookup", new java.lang.Class[] {java.lang.String.class}); //$NON-NLS-1$
            $method_rebind_3 = java.rmi.registry.Registry.class.getMethod("rebind", new java.lang.Class[] {java.lang.String.class, java.rmi.Remote.class}); //$NON-NLS-1$
            $method_unbind_4 = java.rmi.registry.Registry.class.getMethod("unbind", new java.lang.Class[] {java.lang.String.class}); //$NON-NLS-1$

            useNewInvoke = true;
        } catch (java.lang.NoSuchMethodException e) {
            useNewInvoke = false;
        }
    }

    public RegistryImpl_Stub() {
        super();
    }

    public RegistryImpl_Stub(java.rmi.server.RemoteRef ref) {
        super(ref);
    }

    // Implementation of bind(String, Remote)
    public void bind(java.lang.String $param_String_1, java.rmi.Remote $param_Remote_2)
            throws java.rmi.RemoteException, java.rmi.AlreadyBoundException, java.rmi.AccessException {
        try {
            if (useNewInvoke) {
                ref.invoke(this, $method_bind_0, new java.lang.Object[] {$param_String_1, $param_Remote_2}, 7583982177005850366L);
            } else {
                java.rmi.server.RemoteCall call = ref.newCall((java.rmi.server.RemoteObject) this, operations, 0, interfaceHash);

                try {
                    java.io.ObjectOutput out = call.getOutputStream();
                    out.writeObject($param_String_1);
                    out.writeObject($param_Remote_2);
                } catch (java.io.IOException e) {
                    throw new java.rmi.MarshalException(Messages.getString("rmi.26"), e); //$NON-NLS-1$
                }

                ref.invoke(call);

                ref.done(call);
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (java.rmi.AlreadyBoundException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.UnexpectedException(Messages.getString("rmi.0C"), e); //$NON-NLS-1$
        }
    }

    // Implementation of list()
    public java.lang.String[] list()
            throws java.rmi.RemoteException, java.rmi.AccessException {
        try {
            if (useNewInvoke) {
                java.lang.Object $result = ref.invoke(this, $method_list_1, null, 2571371476350237748L);
                return ((java.lang.String[]) $result);
            } else {
                java.rmi.server.RemoteCall call = ref.newCall((java.rmi.server.RemoteObject) this, operations, 1, interfaceHash);

                ref.invoke(call);

                java.lang.String[] $result;

                try {
                    java.io.ObjectInput in = call.getInputStream();
                    $result = (java.lang.String[]) in.readObject();
                } catch (java.io.IOException e) {
                    throw new java.rmi.UnmarshalException(Messages.getString("rmi.27"), e); //$NON-NLS-1$
                } catch (java.lang.ClassNotFoundException e) {
                    throw new java.rmi.UnmarshalException(Messages.getString("rmi.27"), e); //$NON-NLS-1$
                } finally {
                    ref.done(call);
                }

                return $result;
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.UnexpectedException(Messages.getString("rmi.0C"), e); //$NON-NLS-1$
        }
    }

    // Implementation of lookup(String)
    public java.rmi.Remote lookup(java.lang.String $param_String_1)
            throws java.rmi.RemoteException, java.rmi.NotBoundException, java.rmi.AccessException {
        try {
            if (useNewInvoke) {
                java.lang.Object $result = ref.invoke(this, $method_lookup_2, new java.lang.Object[] {$param_String_1}, -7538657168040752697L);
                return ((java.rmi.Remote) $result);
            } else {
                java.rmi.server.RemoteCall call = ref.newCall((java.rmi.server.RemoteObject) this, operations, 2, interfaceHash);

                try {
                    java.io.ObjectOutput out = call.getOutputStream();
                    out.writeObject($param_String_1);
                } catch (java.io.IOException e) {
                    throw new java.rmi.MarshalException(Messages.getString("rmi.26"), e); //$NON-NLS-1$
                }

                ref.invoke(call);

                java.rmi.Remote $result;

                try {
                    java.io.ObjectInput in = call.getInputStream();
                    $result = (java.rmi.Remote) in.readObject();
                } catch (java.io.IOException e) {
                    throw new java.rmi.UnmarshalException(Messages.getString("rmi.27"), e); //$NON-NLS-1$
                } catch (java.lang.ClassNotFoundException e) {
                    throw new java.rmi.UnmarshalException(Messages.getString("rmi.27"), e); //$NON-NLS-1$
                } finally {
                    ref.done(call);
                }

                return $result;
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (java.rmi.NotBoundException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.UnexpectedException(Messages.getString("rmi.0C"), e); //$NON-NLS-1$
        }
    }

    // Implementation of rebind(String, Remote)
    public void rebind(java.lang.String $param_String_1, java.rmi.Remote $param_Remote_2)
            throws java.rmi.RemoteException, java.rmi.AccessException {
        try {
            if (useNewInvoke) {
                ref.invoke(this, $method_rebind_3, new java.lang.Object[] {$param_String_1, $param_Remote_2}, -8381844669958460146L);
            } else {
                java.rmi.server.RemoteCall call = ref.newCall((java.rmi.server.RemoteObject) this, operations, 3, interfaceHash);

                try {
                    java.io.ObjectOutput out = call.getOutputStream();
                    out.writeObject($param_String_1);
                    out.writeObject($param_Remote_2);
                } catch (java.io.IOException e) {
                    throw new java.rmi.MarshalException(Messages.getString("rmi.26"), e); //$NON-NLS-1$
                }

                ref.invoke(call);

                ref.done(call);
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.UnexpectedException(Messages.getString("rmi.0C"), e); //$NON-NLS-1$
        }
    }

    // Implementation of unbind(String)
    public void unbind(java.lang.String $param_String_1)
            throws java.rmi.RemoteException, java.rmi.NotBoundException, java.rmi.AccessException {
        try {
            if (useNewInvoke) {
                ref.invoke(this, $method_unbind_4, new java.lang.Object[] {$param_String_1}, 7305022919901907578L);
            } else {
                java.rmi.server.RemoteCall call = ref.newCall((java.rmi.server.RemoteObject) this, operations, 4, interfaceHash);

                try {
                    java.io.ObjectOutput out = call.getOutputStream();
                    out.writeObject($param_String_1);
                } catch (java.io.IOException e) {
                    throw new java.rmi.MarshalException(Messages.getString("rmi.26"), e); //$NON-NLS-1$
                }

                ref.invoke(call);

                ref.done(call);
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (java.rmi.NotBoundException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.UnexpectedException(Messages.getString("rmi.0C"), e); //$NON-NLS-1$
        }
    }
}
