/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
/** 
 * @author Pavel Afremov
 */  
#ifndef _NATIVE_FRAME_H_
#define _NATIVE_FRAME_H_

/**
@file
\ref native_frame

This module describes interfaces to work with native frames as they are
related to java.
*/

/**
@page native_frame Native Frames

\section nf_introduction Introduction

The native frames interface is specified by native_frame.h

\section nf_description Native Frame Description

The candidates to fill in the native frame module are
former M2nFrames and ObjectHandles.

On this stage of the design process, the following
types of the native frames can be imagined:
    \li\ref jit_frame (unwindable)
    \li\ref helper_frame (unwindable)
    \li\ref vm_frame (non-unwindable)
    \li\ref jni_frame (non-unwindable)
    \li\ref int_frame (non-unwindable)

\subsection jit_frame JIT frame

This frame can have varying representations in memory, depending
on the method they are associated with. Normally JIT will save 
the information about stack frame structure in the method descriptor.
This frame can be identified by pair (frame pointer, method handle).

\subsection helper_frame VM Helper frame

This type of the frame is pushed on the stack when jitted code
calls for some runtime helper which needs some object handles to
be allocated. Though, this type of the stack frame does not
prevent exception propagation, and the exception thrown
in native code will be delivered directly to jitted code,
as this frame can't have any handler associated with it.
(at least yet).

\subsection vm_frame VM Native frame

This type of the frame is pushed on the stack when VM needs to
make sure that no exception control transfers would be made,
for example, when entering to complex synchronization code.

\subsection jni_frame JNI Native frame

This type of the frame is pushed on the stack when JNI native
method is to be called. The frame is used to store local object
handles and to prevent destructive stack unwinding over JNI method.

\subsection int_frame Interpreter frame

Stack frame used by interpreter. Non-unwindable, as interpreter
does not use destructive stack unwinding. The frame is used
to store local variables, method stack and may be local object
handles for use with 

*/

/**
 * Pushes native frame to the stack.
 * @note XXX Where the memory is allocated? -salikh
 * @note M2nFrames were only generated by asm stubs before.
 */
void nf_push_frame();

/**
 * Pops native frame off the stack.
 */
void nf_pop_frame();


#endif // _NATIVE_FRAME_H_
