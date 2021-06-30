package com.company.design.singleton;

public class AClazz {
    // class가 예약어라서 clazz를 사용하기도 함

    private SocketClient socketClient;

    public AClazz() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }

}
