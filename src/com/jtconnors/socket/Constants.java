/*
 * Copyright (c) 2016, Jim Connors
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above
 *     copyright notice, this list of conditions and the following
 *     disclaimer in the documentation and/or other materials provided
 *     with the distribution.
 *   * Neither the name of this project nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.jtconnors.socket;

/**
 * This class contains constants that are common for this package
 * that can be referenced externally via the Constants.instance() static
 * method.  Only primitive types should be used here to avoid ambiguity.
 *
 * It follows the Singleton design pattern and takes advantage of the 
 * properties of the Java Virtual Machine such that initialization of the
 * class instance will be done in a thread safe manner.
 */

public class Constants {   
    private Constants() {}
    
    private static class LazyHolder {
        private static final Constants INSTANCE = new Constants();
    }
    
    public static Constants instance() {
        return LazyHolder.INSTANCE;
    }

    /**
     * Messages sent over MulticastSocket.  Must specify a packet size
     * for received DatagramSocket messages.  Messages must not be
     * larger than the constant specified below.
     */
    public final int MAX_DATAGRAM_MSG_SIZE = 1000;
    /*
     * Multicast Socket constants
     */
    public final int DEFAULT_PORT = 2011;
    public final String DEFAULT_SESSION_ADDR = "227.27.27.27";
    public final String DEFAULT_HOST = "localhost";
}
