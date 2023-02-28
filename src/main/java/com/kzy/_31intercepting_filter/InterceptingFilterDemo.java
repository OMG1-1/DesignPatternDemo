package com.kzy._31intercepting_filter;

public class InterceptingFilterDemo {
    public static void main(String[] args) {
        // 创建过滤器管理对象
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        // 创建客户端
        Client client = new Client();
        // 为客户端设置过滤器管理器
        client.setFilterManager(filterManager);
        // 客户端发送请求
        client.sendRequest("HOME");
    }
}