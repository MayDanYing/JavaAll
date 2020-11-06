package ru.geekbrains.lesson10;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class HttpJava {

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://google.com/mail").build();

        Response response = client.newCall(request).execute();
        System.out.println( "Status code is " + response.code() +"\n");
        System.out.println(response.headers()+"\n");
        System.out.println(response.body().string());
    }
}
